package ru.stqa.pft.addressbook.tests;

import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by Sanchez on 27.03.2017.
 */
public class AddContactToGroupTests extends TestBase {

  @BeforeMethod
  public void verifyGroups()
  {
    if (app.db().groups().size() > 0)
      return;

    app.goTo().groupPage();
    app.group().create(new GroupData().withName("test1").withHeader("test2").withFooter("test3"));
  }

  @BeforeMethod
  public void verifyContacts()
  {
    if (app.db().contacts().size() == 0)
    {
      app.contact().createContact(new ContactData().withFirst_name("Ivanov").withMiddle_name("Ivanovich").withLast_name("Ivan"), true);
      app.goTo().home();
    }
  }

  @Test
  public void testAddContactToGroup() {
    app.goTo().home();
    app.contact().selectGroupToContacts(new GroupData().withName("[all]"));
    ContactData contact = app.contact().all().iterator().next();
    Groups groups_from_contact = app.db().groups_in_contact(contact);


    // сравниваем кол-во групп в контакте с общим кол-вом групп
    if (groups_from_contact.size() == app.db().groups().size())
    {
      app.goTo().groupPage();
      app.group().create(new GroupData().withName("name1").withHeader("H1").withFooter("F1"));
      app.goTo().home();
    }

    // проверяем в какой группе не состоит контакт
    Groups contact_not_in_groups = app.db().contact_not_in_groups(contact);
    GroupData contact_not_in_group = contact_not_in_groups.iterator().next();
    assertThat(contact_not_in_groups.size(), not(0));
    app.contact().to_group(contact, contact_not_in_group);

    groups_from_contact = app.db().groups_in_contact(contact);

    //проверяем, что контакт добавился
    assertThat(groups_from_contact.stream().filter((g) -> {return g.getId() == contact_not_in_group.getId();}).count(),
            equalTo(1L));
  }
}

package ru.stqa.pft.addressbook.tests;

import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;


/**
 * Created by Sanchez on 27.03.2017.
 */
public class DeleteContactFromGroupTests extends TestBase {

  @BeforeMethod
  public void verifyGroups()
  {
    if (app.db().groups().size() > 0)
      return;

    app.goTo().groupPage();
    app.group().create(new GroupData().withName("test1").withHeader("test2").withFooter("test3"));
    Contacts contacts = app.db().contacts();

    if (contacts.size() == 0)
    {
      app.contact().createContact(new ContactData().withFirst_name("Ivanov").withMiddle_name("Ivanovich").withLast_name("Ivan"), true);
      app.goTo().home();
    }
    contacts = app.db().contacts();

    for(ContactData c: contacts)
    {
      Groups groups_from_contact =  app.db().groups_in_contact(c);
      if (groups_from_contact.size() != app.db().groups().size())
      {
        // проверяем в какой не состоит
        Groups contact_not_in_groups = app.db().contact_not_in_groups(c);
        if (contact_not_in_groups.size() > 0 )
          app.contact().to_group(c, contact_not_in_groups.iterator().next());
      }
    }

  }

  @Test
  public void testDeleteContactFromGroup() {
    app.goTo().home();
    ContactData contact = app.contact().all().iterator().next();
    GroupData group = app.group().all_from_home().iterator().next();
    app.contact().without_group(contact, group);

    assertThat(app.db().groups_in_contact(contact).stream().filter((g) -> g.getId() == group.getId()).count(),
            equalTo(0L));
  }
}

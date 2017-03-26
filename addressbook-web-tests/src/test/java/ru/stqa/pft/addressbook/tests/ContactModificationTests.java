package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;


/**
 * Created by Sanchez on 13.02.2017.
 */
public class ContactModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    if (app.db().contacts().size() == 0) {
      app.goTo().home();
      app.contact().createContact(new ContactData()
                      .withFirst_name("Petrov").withMiddle_name("Petrovich").withLast_name("Petr").withNickname("Petrov")
                      .withTitle("title1").withCompany("Company1").withAddress("c. Saratov, st. Gagarina 32, fl. 59")
                      .withTelephone_Home("493-44-33").withTelephone_Mobile("+7(834)390-78-49").withTelephone_Work("4931919").withFax("-")
                      .withEmail("petrov@mail.ru").withEmail2("PPPetrov@gmail.com").withEmail3("Petrov38@yande.ru")
                      .withHomepage("-").withBirthday_day("//div[@id='content']/form/select[1]//option[19]")
                      .withBirthday_day_ent("//div[@id='content']/form/select[1]//option[19]")
                      .withBirthday_mon("//div[@id='content']/form/select[2]//option[9]")
                      .withBirthday_mon_ent("//div[@id='content']/form/select[2]//option[9]").withBirthday_year("1988")
                      .withAnniversary_day("//div[@id='content']/form/select[3]//option[12]")
                      .withAnniversary_day_ent("//div[@id='content']/form/select[3]//option[12]")
                      .withAnniversary_mon("//div[@id='content']/form/select[4]//option[12]")
                      .withAnniversary_mon_ent("//div[@id='content']/form/select[4]//option[12]").withAnniversary_year("2013").withGroup("test1")
              , true);
    }
  }

  @Test
  public void testContactModification(){
    Contacts before = app.db().contacts();
    ContactData modifiedContact = before.iterator().next();
    ContactData contact = new ContactData()
            .withId(modifiedContact.getId())
            .withFirst_name("Petrov").withMiddle_name("Petrovich").withLast_name("Petr").withNickname("Petrov")
            .withTitle("title1").withCompany("Company1").withAddress("c. Saratov, st. Gagarina 32, fl. 59")
            .withTelephone_Home("4955588").withTelephone_Mobile("+7834390749").withTelephone_Work("4931919").withFax("-")
            .withEmail("petrov@mail.ru").withEmail2("PPPetrov@gmail.com").withEmail3("Petrov38@yande.ru")
            .withHomepage("-").withBirthday_day("//div[@id='content']/form/select[1]//option[19]")
            .withBirthday_day_ent("//div[@id='content']/form/select[1]//option[19]")
            .withBirthday_mon("//div[@id='content']/form/select[2]//option[9]")
            .withBirthday_mon_ent("//div[@id='content']/form/select[2]//option[9]").withBirthday_year("1988")
            .withAnniversary_day("//div[@id='content']/form/select[3]//option[12]")
            .withAnniversary_day_ent("//div[@id='content']/form/select[3]//option[12]")
            .withAnniversary_mon("//div[@id='content']/form/select[4]//option[12]")
            .withAnniversary_mon_ent("//div[@id='content']/form/select[4]//option[12]").withAnniversary_year("2013").withGroup("test1");
    app.contact().modify(contact);
    assertThat(app.contact().count(), equalTo(before.size()));
    Contacts after = app.db().contacts();
    assertThat(after, equalTo(before.without(modifiedContact).withAdded(contact)));
  }
}

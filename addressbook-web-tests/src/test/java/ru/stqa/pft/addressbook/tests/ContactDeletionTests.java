package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Set;

/**
 * Created by Sanchez on 13.02.2017.
 */
public class ContactDeletionTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().home();
    if (app.contact().all().size() == 0) {
      app.contact().createContact(new ContactData()
              .withFirst_name("Петров").withMiddle_name("Петрович").withLast_name("Петр").withNickname("Petrov")
              .withTitle("title1").withCompany("Company1").withAddress("г. Саратов, ул. Гагарина 32, кв. 59")
              .withTelephone_Home("4934433").withTelephone_Mobile("+7834390749").withTelephone_Work("4931919").withFax("-")
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
  public void testContactDeletion(){
    Set<ContactData> before = app.contact().all();
    ContactData deletedContact = before.iterator().next();
    app.contact().delete(deletedContact);
    Set<ContactData> after = app.contact().all();
    if (before.size() != 0) {
      Assert.assertEquals(after.size(), before.size() - 1);
    } else {
      Assert.assertEquals(after.size(), before.size());
    }

    before.remove(deletedContact);
    Assert.assertEquals(before, after);
  }
}

package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.goTo().home();
    List<ContactData> before = app.contact().list();
    ContactData contact = new ContactData()
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
            .withAnniversary_mon_ent("//div[@id='content']/form/select[4]//option[12]").withAnniversary_year("2013").withGroup("test1");
    app.contact().createContact(contact, true);
    List<ContactData> after = app.contact().list();
    Assert.assertEquals(after.size(), before.size() + 1);

    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }

}

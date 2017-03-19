package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.goTo().home();
    Contacts before = app.contact().all();
    ContactData contact = new ContactData()
            .withFirst_name("Петров").withMiddle_name("Петрович").withLast_name("Петр").withNickname("Petrov")
            .withTitle("title1").withCompany("Company1").withAddress("г. Саратов, ул. Гагарина 32, кв. 59")
            .withTelephone_Home("4934433").withTelephone_Mobile("+7834390749").withTelephone_Work("4931919").withFax("-")
            .withEmail("petrov@mail.ru").withEmail2("PPPetrov@gmail.com").withEmail3("Petrov38@yande.ru")
            .withHomepage("-").withBirthday_day(null)
            .withBirthday_day_ent(null)
            .withBirthday_mon(null)
            .withBirthday_mon_ent(null).withBirthday_year(null)
            .withAnniversary_day(null)
            .withAnniversary_day_ent(null)
            .withAnniversary_mon(null)
            .withAnniversary_mon_ent(null).withAnniversary_year(null).withGroup(null);
    app.contact().createContact(contact, true);
    assertThat(app.contact().count(), equalTo(before.size() + 1));
    Contacts after = app.contact().all();
    assertThat(after, equalTo(
            before.withAdded(contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt()))));
  }

}

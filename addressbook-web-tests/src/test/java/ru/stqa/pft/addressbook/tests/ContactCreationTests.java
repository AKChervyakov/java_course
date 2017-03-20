package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase {

  @DataProvider
  public Iterator<Object[]> validContacts() {
    List<Object[]> list = new ArrayList<Object[]>();
    File photo = new File("src/test/resources/MyPhoto.jpg");
    list.add(new Object[] {new ContactData().withFirst_name("Петров").withMiddle_name("Петрович").withLast_name("Петр").withNickname("Petrov")
            .withPhoto(photo).withTitle("title1").withCompany("Company1").withAddress("г. Саратов, ул. Гагарина 32, кв. 59")
            .withTelephone_Home("4934433").withTelephone_Mobile("+7834390749").withTelephone_Work("4931919").withFax("-")
            .withEmail("petrov@mail.ru").withEmail2("PPPetrov@gmail.com").withEmail3("Petrov38@yandex.ru")
            .withHomepage("-").withBirthday_day(null)
            .withBirthday_day_ent(null)
            .withBirthday_mon(null)
            .withBirthday_mon_ent(null).withBirthday_year(null)
            .withAnniversary_day(null)
            .withAnniversary_day_ent(null)
            .withAnniversary_mon(null)
            .withAnniversary_mon_ent(null).withAnniversary_year(null).withGroup(null)});
    list.add(new Object[] {new ContactData().withFirst_name("Федоров").withMiddle_name("Федорович").withLast_name("Федор").withNickname("Fedya")
            .withPhoto(photo).withTitle("title2").withCompany("Company2").withAddress("г. Ставрополь, ул. Ленина 44, кв. 89")
            .withTelephone_Home("653-24-54").withTelephone_Mobile("+7(834)390-74-99").withTelephone_Work("542-54-44").withFax("-")
            .withEmail("fed@mail.ru").withEmail2("FFFedor@gmail.com").withEmail3("Fedor38@yandex.ru")
            .withHomepage("-").withBirthday_day(null)
            .withBirthday_day_ent(null)
            .withBirthday_mon(null)
            .withBirthday_mon_ent(null).withBirthday_year(null)
            .withAnniversary_day(null)
            .withAnniversary_day_ent(null)
            .withAnniversary_mon(null)
            .withAnniversary_mon_ent(null).withAnniversary_year(null).withGroup(null)});
    list.add(new Object[] {new ContactData().withFirst_name("Иванов").withMiddle_name("Иванович").withLast_name("Иван").withNickname("Ivanov")
            .withPhoto(photo).withTitle("title3").withCompany("Company3").withAddress("г. Москва, ул. Арбат 1, кв. 59")
            .withTelephone_Home("466-44-11").withTelephone_Mobile("+7(834)390-70-49").withTelephone_Work("653-44-23").withFax("-")
            .withEmail("ivanov@mail.ru").withEmail2("IIIvanov@gmail.com").withEmail3("Ivanov38@yande.ru")
            .withHomepage("-").withBirthday_day(null)
            .withBirthday_day_ent(null)
            .withBirthday_mon(null)
            .withBirthday_mon_ent(null).withBirthday_year(null)
            .withAnniversary_day(null)
            .withAnniversary_day_ent(null)
            .withAnniversary_mon(null)
            .withAnniversary_mon_ent(null).withAnniversary_year(null).withGroup(null)});
    return list.iterator();
  }

  @Test(dataProvider = "validContacts")
  public void testContactCreation(ContactData contact) {
    app.goTo().home();
    Contacts before = app.contact().all();
    app.contact().createContact(contact, true);
    assertThat(app.contact().count(), equalTo(before.size() + 1));
    Contacts after = app.contact().all();
    assertThat(after, equalTo(
            before.withAdded(contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt()))));
  }

  @Test (enabled = false)
  public void testCurrentDir() {
    File currentDir = new File (".");
    System.out.println(currentDir.getAbsolutePath());
    File photo = new File("src/test/resources/MyPhoto.jpg");
    System.out.println(photo.getAbsolutePath());
    System.out.println(photo.exists());
  }
}

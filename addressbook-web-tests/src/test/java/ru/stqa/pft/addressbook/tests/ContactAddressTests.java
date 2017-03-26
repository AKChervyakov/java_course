package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Sanchez on 18.03.2017.
 */
public class ContactAddressTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    if (app.db ().contacts().size () ==0) {
      app.goTo().home();
      app.contact().createContact(new ContactData()
                      .withFirst_name("Петров").withMiddle_name("Петрович").withLast_name("Петр").withNickname("Petrov")
                      .withTitle("title1").withCompany("Company1").withAddress("г. Саратов, ул. Гагарина 32, кв. 59")
                      .withTelephone_Home("493-44-33").withTelephone_Mobile("+7(834)390-78-49").withTelephone_Work("4931919").withFax("-")
                      .withEmail("petrov@mail.ru").withEmail2("PPPetrov@gmail.com").withEmail3("Petrov38@yande.ru")
                      .withHomepage("-").withBirthday_day("//div[@id='content']/form/select[1]//option[19]")
                      .withBirthday_day_ent("//div[@id='content']/form/select[1]//option[19]")
                      .withBirthday_mon("//div[@id='content']/form/select[2]//option[9]")
                      .withBirthday_mon_ent("//div[@id='content']/form/select[2]//option[9]").withBirthday_year("1988")
                      .withAnniversary_day("//div[@id='content']/form/select[3]//option[12]")
                      .withAnniversary_day_ent("//div[@id='content']/form/select[3]//option[12]")
                      .withAnniversary_mon("//div[@id='content']/form/select[4]//option[12]")
                      .withAnniversary_mon_ent("//div[@id='content']/form/select[4]//option[12]").withAnniversary_year("2013")
              , true);
    }
  }

  @Test
  public void testContactAddress(){
    app.goTo().home();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);
    assertThat (cleaned(contact.getAddress()), equalTo(cleaned(contactInfoFromEditForm.getAddress())));
  }

  public static String cleaned (String address){
    return address.replaceAll("\\s","");
  }
}

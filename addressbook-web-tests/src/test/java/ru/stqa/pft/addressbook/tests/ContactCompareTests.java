package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.model.ContactData;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Sanchez on 19.03.2017.
 */
public class ContactCompareTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.goTo().home();
    if (app.contact().all().size() == 0) {
      app.contact().createContact(new ContactData()
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
                      .withAnniversary_mon_ent(null).withAnniversary_year(null).withGroup(null)
              , true);
    }
  }

  @Test
  public void testContactCompareTests() {
    app.goTo().home();
    ContactData contact = app.contact().all().iterator().next(); //загрузка множества контактов и выбор одного из них случайным образом
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

    ContactData contactInfoFromDetailesForm = app.contact().infoFromDetailesForm(contact);
    System.out.println(cleaned1(contactInfoFromDetailesForm.getAllInformation()));
    System.out.println(mergeDadaFromEditPage(contactInfoFromEditForm));

    assertThat(cleaned1(contactInfoFromDetailesForm.getAllInformation()),equalTo
            (mergeDadaFromEditPage(contactInfoFromEditForm)));

  }

  private String mergeDadaFromEditPage(ContactData contact) {

    String H = "H:";
    String M = "M:";
    String W = "W:";
    String F = "F:";
    String Homepage = "Homepage:";

    if(contact.getTelephone_Home().equals(""))  H = "";
    if(contact.getTelephone_Mobile().equals(""))  M = "";
    if(contact.getTelephone_Work().equals(""))  W = "";
    if(contact.getFax().equals(""))  F = "";
    if(contact.getHomepage().equals(""))  Homepage = "";

    return Arrays.asList(contact.getFirst_name(),contact.getMiddle_name(),contact.getLast_name(),contact.getNickname()
            ,contact.getTitle(),contact.getCompany(),contact.getAddress(),
            (H + contact.getTelephone_Home()), (M + contact.getTelephone_Mobile()),(W +  contact.getTelephone_Work())
            ,(F +  contact.getFax()),
            contact.getEmail(),contact.getEmail2(),contact.getEmail3(),(Homepage +  contact.getHomepage()))
            .stream().filter((s)-> ! s.equals(""))
            .map(ContactCompareTests::cleaned2)
            .collect(Collectors.joining(""));
  }

  private  static String cleaned1 (String information){
    return information.replaceAll("\\s","");
  }

  private  static String cleaned2 (String phone){
    return phone.replaceAll("\\s","");
  }
}

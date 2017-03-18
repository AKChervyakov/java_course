package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Sanchez on 18.03.2017.
 */
public class ContactPhoneTests extends TestBase {

  @Test
  public void testPersonPhones(){
    app.goTo().home();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);

    assertThat(contact.getTelephone_Home(), equalTo(cleaned(contactInfoFromEditForm.getTelephone_Home())));
    assertThat(contact.getTelephone_Mobile(), equalTo(cleaned(contactInfoFromEditForm.getTelephone_Mobile())));
    assertThat(contact.getTelephone_Work(), equalTo(cleaned(contactInfoFromEditForm.getTelephone_Work())));
  }

  public static String cleaned (String phone){
    return phone.replaceAll("\\s","").replaceAll("[-()]","");
  }
}

package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import static ru.stqa.pft.addressbook.tests.TestBase.app;

/**
 * Created by Sanchez on 18.03.2017.
 */
public class ContactPhoneTests {
  @Test(enabled = false)
  public void testPersonPhones(){
    app.goTo().home();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactInfoFromEditForm = app.contact().infoFromEditForm(contact);
  }
}

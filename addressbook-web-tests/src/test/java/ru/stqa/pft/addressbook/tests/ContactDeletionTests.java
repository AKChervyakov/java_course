package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

/**
 * Created by Sanchez on 13.02.2017.
 */
public class ContactDeletionTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions() {
    app.getNavigationHelper().goToHome();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Петров", "Петрович", "Петр", "Petrov", "title1", "Company1", "г. Саратов, ул. Гагарина 32, кв. 59", "4934433", "+7834390749", "4931919", "-", "petrov@mail.ru", "PPPetrov@gmail.com", "Petrov38@yande.ru", "-", "//div[@id='content']/form/select[1]//option[19]", "//div[@id='content']/form/select[1]//option[19]", "//div[@id='content']/form/select[2]//option[9]", "//div[@id='content']/form/select[2]//option[9]", "1988", "//div[@id='content']/form/select[3]//option[12]", "//div[@id='content']/form/select[3]//option[12]", "//div[@id='content']/form/select[4]//option[12]", "//div[@id='content']/form/select[4]//option[12]", "2013", "test1"), true);
    }
  }

  @Test
  public void testContactDeletion(){
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectContact(before.size() - 1);
    app.getContactHelper().deleteContact();
    app.getNavigationHelper().goToHome();
    List<ContactData> after = app.getContactHelper().getContactList();
    if (before.size() != 0) {
      Assert.assertEquals(after.size(), before.size() - 1);
    } else {
      Assert.assertEquals(after.size(), before.size());
    }

    before.remove(before.size() - 1);
    Assert.assertEquals(before, after);
  }
}

package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;


/**
 * Created by Sanchez on 13.02.2017.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().goToHome();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Петров", "Петрович", "Петр", "Petrov", "title1", "Company1", "г. Саратов, ул. Гагарина 32, кв. 59", "4934433", "+7834390749", "4931919", "-", "petrov@mail.ru", "PPPetrov@gmail.com", "Petrov38@yande.ru", "-", "//div[@id='content']/form/select[1]//option[19]", "//div[@id='content']/form/select[1]//option[19]", "//div[@id='content']/form/select[2]//option[9]", "//div[@id='content']/form/select[2]//option[9]", "1988", "//div[@id='content']/form/select[3]//option[12]", "//div[@id='content']/form/select[3]//option[12]", "//div[@id='content']/form/select[4]//option[12]", "//div[@id='content']/form/select[4]//option[12]", "2013", "test1"), true);
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().selectModifiedContact(before.size()-1);
    ContactData contact = new ContactData(before.get(before.size() - 1).getId(),"Петров", "Петрович", "Петр", "Petrov", "title1", "Company1", "г. Саратов, ул. Гагарина 32, кв. 59", "4955588", "+7834390749", "4931919", "-", "petrov@mail.ru", "PPPetrov@gmail.com", "Petrov38@yande.ru", "-", "//div[@id='content']/form[1]/select[1]//option[9]", "//div[@id='content']/form[1]/select[1]//option[9]", "//div[@id='content']/form[1]/select[2]//option[6]", "//div[@id='content']/form[1]/select[2]//option[6]", "1987", "//div[@id='content']/form[1]/select[3]//option[12]", "//div[@id='content']/form[1]/select[3]//option[12]", "//div[@id='content']/form[1]/select[4]//option[12]", "//div[@id='content']/form[1]/select[4]//option[12]", "2013", null);
    app.getContactHelper().fillContactForm(contact, false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().goToHome();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() - 1);
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before,after);
  }
}

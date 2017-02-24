package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


/**
 * Created by Sanchez on 13.02.2017.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){

    app.getNavigationHelper().goToHome();
    app.getContactHelper().selectModifiedContact();
    app.getContactHelper().fillContactForm(new ContactData("Петров", "Петрович", "Петр", "Petrov", "title1", "Company1", "г. Саратов, ул. Гагарина 32, кв. 59", "495-55-88", "+7834390749", "493-19-19", "-", "petrov@mail.ru", "PPPetrov@gmail.com", "Petrov38@yande.ru", "-", "//div[@id='content']/form[1]/select[1]//option[9]", "//div[@id='content']/form[1]/select[1]//option[9]", "//div[@id='content']/form[1]/select[2]//option[6]", "//div[@id='content']/form[1]/select[2]//option[6]", "1987", "//div[@id='content']/form[1]/select[3]//option[12]", "//div[@id='content']/form[1]/select[3]//option[12]", "//div[@id='content']/form[1]/select[4]//option[12]", "//div[@id='content']/form[1]/select[4]//option[12]", "2013"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().returnToHomePage();
  }
}

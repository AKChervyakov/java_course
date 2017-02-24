package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Петров", "Петрович", "Петр", "Petrov", "title1", "Company1", "г. Саратов, ул. Гагарина 32, кв. 59", "493-44-33", "+7834390749", "493-19-19", "-", "petrov@mail.ru", "PPPetrov@gmail.com", "Petrov38@yande.ru", "-", "//div[@id='content']/form/select[1]//option[19]", "//div[@id='content']/form/select[1]//option[19]", "//div[@id='content']/form/select[2]//option[9]", "//div[@id='content']/form/select[2]//option[9]", "1988", "//div[@id='content']/form/select[3]//option[12]", "//div[@id='content']/form/select[3]//option[12]", "//div[@id='content']/form/select[4]//option[12]", "//div[@id='content']/form/select[4]//option[12]", "2013"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().returnToHomePage();
    }

}

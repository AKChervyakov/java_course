package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sanchez on 08.02.2017.
 */
public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirst_name());
    type(By.name("middlename"), contactData.getMiddle_name());
    type(By.name("lastname"), contactData.getLast_name());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getTelephone_Home());
    type(By.name("mobile"), contactData.getTelephone_Mobile());
    type(By.name("work"), contactData.getTelephone_Work());
    type(By.name("fax"), contactData.getFax());
    type(By.name("email"), contactData.getEmail());
    type(By.name("email2"), contactData.getEmail2());
    type(By.name("email3"), contactData.getEmail3());
    type(By.name("homepage"), contactData.getHomepage());
    if (!wd.findElement(By.xpath(contactData.getBirthday_day())).isSelected()) {
      wd.findElement(By.xpath(contactData.getBirthday_day_ent())).click();
    }
    if (!wd.findElement(By.xpath(contactData.getBirthday_mon())).isSelected()) {
      wd.findElement(By.xpath(contactData.getBirthday_mon_ent())).click();
    }
    type(By.name("byear"), contactData.getBirthday_year());
    if (!wd.findElement(By.xpath(contactData.getAnniversary_day())).isSelected()) {
      wd.findElement(By.xpath(contactData.getAnniversary_day_ent())).click();
    }
    if (!wd.findElement(By.xpath(contactData.getAnniversary_mon())).isSelected()) {
      wd.findElement(By.xpath(contactData.getAnniversary_mon_ent())).click();
    }
    type(By.name("ayear"), contactData.getAnniversary_year());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void selectContact(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }

  public void deleteContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    wd.switchTo().alert().accept();
  }

  public void selectModifiedContact(int index) {
    wd.findElements(By.xpath("//tr[@name='entry']")).get(index).findElement(By.xpath(".//a[contains(@href,'edit')]")).click();
  }

  public void submitContactModification() {
    click(By.name("update"));
  }

  private void returnToHomePage() {
    wd.findElement(By.linkText("home")).click();
  }

  public void home() {
    if (isElementPresent(By.id("maintable"))) {
      return;
    }
    click(By.linkText("home"));
  }

  public void createContact(ContactData contact, boolean creation) {
    initContactCreation();
    fillContactForm(contact, true);
    submitContactCreation();
    returnToHomePage();
  }

  public void modify(int index, ContactData contact) {
    selectModifiedContact(index);
    fillContactForm(contact, false);
    submitContactModification();
    home();
  }

  public void delete(int index) {
    selectContact(index);
    deleteContact();
    home();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public List<ContactData> list() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.xpath("//tr[@name='entry']"));
    for (WebElement element : elements) {
      String First_name = element.findElement(By.xpath(".//td[3]")).getText();
      String Last_name = element.findElement(By.xpath(".//td[2]")).getText();
      String Address = element.findElement(By.xpath(".//td[4]")).getText();
      int ID = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
      ContactData contact = new ContactData(ID, First_name, null, Last_name, null, null, null, Address, null, null, null, null, null, null, null, null,  null, null, null, null, null, null, null, null, null, null, null);
      contacts.add(contact);
    }
    return contacts;
  }
}

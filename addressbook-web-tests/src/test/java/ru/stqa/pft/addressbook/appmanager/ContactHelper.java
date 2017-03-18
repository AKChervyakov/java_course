package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

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

  public void selectContactById(int id) {
    wd.findElement(By.cssSelector("input[value='" + id + "']")).click();
  }

  public void deleteContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    wd.switchTo().alert().accept();
  }

  public void selectModifiedContactById(int i) {
    click(By.xpath("//input[@value='" + i +"']/../..//img[@alt='Edit']"));
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
    contactCache = null;
    returnToHomePage();
  }

  public void modify(ContactData contact) {
    selectModifiedContactById(contact.getId());
    fillContactForm(contact, false);
    submitContactModification();
    contactCache = null;
    home();
  }

  public void delete(ContactData contact) {
    selectContactById(contact.getId());
    deleteContact();
    contactCache = null;
    home();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public int count() {
    return wd.findElements(By.name("selected[]")).size();
  }

  private Contacts contactCache = null;

  public Contacts all() {
    if (contactCache != null) {
      return new Contacts(contactCache);
    }

    contactCache = new Contacts();
    List<WebElement> rows = wd.findElements(By.name("entry"));
    for (WebElement row : rows) {
      List<WebElement> cells = row.findElements(By.tagName("td"));
      int ID = Integer.parseInt(cells.get(0).findElement(By.tagName("input")).getAttribute("value"));
      String Last_name = cells.get(1).getText();
      String First_name = cells.get(2).getText();
      String Address = cells.get(3).getText();
      String allEmail = cells.get(4).getText();
      String allPhones = cells.get(5).getText();
      contactCache.add(new ContactData().withId(ID).withFirst_name(First_name).withLast_name(Last_name).withAddress(Address)
              .withAllEmails(allEmail).withAllPhones(allPhones));
    }
    return new Contacts(contactCache);
  }

  public ContactData infoFromEditForm(ContactData contact) {
    selectModifiedContactById(contact.getId());
    String firstname = wd.findElement(By.name("firstname")).getAttribute("value");
    String lastname = wd.findElement(By.name("lastname")).getAttribute("value");
    String address = wd.findElement(By.name("address")).getAttribute("value");
    String home = wd.findElement(By.name("home")).getAttribute("value");
    String mobile = wd.findElement(By.name("mobile")).getAttribute("value");
    String work = wd.findElement(By.name("work")).getAttribute("value");
    String email = wd.findElement(By.name("email")).getAttribute("value");
    String email2 = wd.findElement(By.name("email2")).getAttribute("value");
    String email3 = wd.findElement(By.name("email3")).getAttribute("value");
    wd.navigate().back();
    return new ContactData().withId(contact.getId()).withFirst_name(firstname).withLast_name(lastname)
            .withTelephone_Home(home).withTelephone_Mobile(mobile).withTelephone_Work(work).withAddress(address).withEmail(email)
            .withEmail2(email2).withEmail3(email3);
  }
}

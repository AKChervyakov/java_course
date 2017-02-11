package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Sanchez on 08.02.2017.
 */
public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
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
    click(By.name("theform"));
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
    wd.findElement(By.name("theform")).click();
    if (!wd.findElement(By.xpath(contactData.getGroup())).isSelected()) {
      wd.findElement(By.xpath(contactData.getGroup_ent())).click();
    }
    type(By.name("address2"), contactData.getSec_Address());
    type(By.name("phone2"), contactData.getSec_Phone());
    type(By.name("notes"), contactData.getNotes());
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }
}

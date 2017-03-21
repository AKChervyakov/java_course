package ru.stqa.pft.addressbook.model;

import com.google.gson.annotations.Expose;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

import java.io.File;

@XStreamAlias("contact")
public class ContactData {
  @XStreamOmitField
  private int id = Integer.MAX_VALUE;;
  @Expose
  private String first_name;
  @Expose
  private String middle_name;
  @Expose
  private String last_name;
  @Expose
  private String nickname;
  @Expose
  private String title;
  @Expose
  private String company;
  @Expose
  private String address;
  @Expose
  private String telephone_Home;
  @Expose
  private String telephone_Mobile;
  @Expose
  private String telephone_Work;
  @Expose
  private String fax;
  @Expose
  private String email;
  @Expose
  private String email2;
  @Expose
  private String email3;
  @Expose
  private String homepage;
  private String birthday_day;
  private String birthday_day_ent;
  private String birthday_mon;
  private String birthday_mon_ent;
  private String birthday_year;
  private String anniversary_day;
  private String anniversary_day_ent;
  private String anniversary_mon;
  private String anniversary_mon_ent;
  private String anniversary_year;
  private String group;
  private String allPhones;
  private String allEmails;
  private String allInformation;
  private File photo;

  public File getPhoto() {
    return photo;
  }

  public ContactData withPhoto(File photo) {
    this.photo = photo;
    return this;
  }

  public String getAllEmails() {
    return allEmails;
  }

  public ContactData withAllEmails(String allEmails) {
    this.allEmails = allEmails;
    return this;
  }

  public String getAllPhones() {
    return allPhones;
  }

  public ContactData withAllPhones(String allPhones) {
    this.allPhones = allPhones;
    return this;
  }

  public String getAllInformation() {
    return allInformation;
  }

  public ContactData withAllInformation(String allInformation) {
    this.allInformation = allInformation;
    return this;
  }

  public int getId() {
    return id;
  }

  public ContactData withId(int id) {
    this.id = id;
    return this;
  }

  public ContactData withFirst_name(String first_name) {
    this.first_name = first_name;
    return this;
  }

  public ContactData withMiddle_name(String middle_name) {
    this.middle_name = middle_name;
    return this;
  }

  public ContactData withLast_name(String last_name) {
    this.last_name = last_name;
    return this;
  }

  public ContactData withNickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  public ContactData withTitle(String title) {
    this.title = title;
    return this;
  }

  public ContactData withCompany(String company) {
    this.company = company;
    return this;
  }

  public ContactData withAddress(String address) {
    this.address = address;
    return this;
  }

  public ContactData withTelephone_Home(String telephone_Home) {
    this.telephone_Home = telephone_Home;
    return this;
  }

  public ContactData withTelephone_Mobile(String telephone_Mobile) {
    this.telephone_Mobile = telephone_Mobile;
    return this;
  }

  public ContactData withTelephone_Work(String telephone_Work) {
    this.telephone_Work = telephone_Work;
    return this;
  }

  public ContactData withFax(String fax) {
    this.fax = fax;
    return this;
  }

  public ContactData withEmail(String email) {
    this.email = email;
    return this;
  }

  public ContactData withEmail2(String email2) {
    this.email2 = email2;
    return this;
  }

  public ContactData withEmail3(String email3) {
    this.email3 = email3;
    return this;
  }

  public ContactData withHomepage(String homepage) {
    this.homepage = homepage;
    return this;
  }

  public ContactData withBirthday_day(String birthday_day) {
    this.birthday_day = birthday_day;
    return this;
  }

  public ContactData withBirthday_day_ent(String birthday_day_ent) {
    this.birthday_day_ent = birthday_day_ent;
    return this;
  }

  public ContactData withBirthday_mon(String birthday_mon) {
    this.birthday_mon = birthday_mon;
    return this;
  }

  public ContactData withBirthday_mon_ent(String birthday_mon_ent) {
    this.birthday_mon_ent = birthday_mon_ent;
    return this;
  }

  public ContactData withBirthday_year(String birthday_year) {
    this.birthday_year = birthday_year;
    return this;
  }

  public ContactData withAnniversary_day(String anniversary_day) {
    this.anniversary_day = anniversary_day;
    return this;
  }

  public ContactData withAnniversary_day_ent(String anniversary_day_ent) {
    this.anniversary_day_ent = anniversary_day_ent;
    return this;
  }

  public ContactData withAnniversary_mon(String anniversary_mon) {
    this.anniversary_mon = anniversary_mon;
    return this;
  }

  public ContactData withAnniversary_mon_ent(String anniversary_mon_ent) {
    this.anniversary_mon_ent = anniversary_mon_ent;
    return this;
  }

  public ContactData withAnniversary_year(String anniversary_year) {
    this.anniversary_year = anniversary_year;
    return this;
  }

  public ContactData withGroup(String group) {
    this.group = group;
    return this;
  }

  public String getFirst_name() {
    return first_name;
  }

  public String getMiddle_name() {
    return middle_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getTelephone_Home() {
    return telephone_Home;
  }

  public String getTelephone_Mobile() {
    return telephone_Mobile;
  }

  public String getTelephone_Work() {
    return telephone_Work;
  }

  public String getFax() {
    return fax;
  }

  public String getEmail() {
    return email;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getHomepage() {
    return homepage;
  }

  public String getBirthday_day() {
    return birthday_day;
  }

  public String getBirthday_day_ent() {
    return birthday_day_ent;
  }

  public String getBirthday_mon() {
    return birthday_mon;
  }

  public String getBirthday_mon_ent() {
    return birthday_mon_ent;
  }

  public String getBirthday_year() {
    return birthday_year;
  }

  public String getAnniversary_day() {
    return anniversary_day;
  }

  public String getAnniversary_day_ent() {
    return anniversary_day_ent;
  }

  public String getAnniversary_mon() {
    return anniversary_mon;
  }

  public String getAnniversary_mon_ent() {
    return anniversary_mon_ent;
  }

  public String getAnniversary_year() {
    return anniversary_year;
  }

  public String getGroup() {
    return group;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", first_name='" + first_name + '\'' +
            ", last_name='" + last_name + '\'' +
            ", address='" + address + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (id != that.id) return false;
    if (first_name != null ? !first_name.equals(that.first_name) : that.first_name != null) return false;
    if (last_name != null ? !last_name.equals(that.last_name) : that.last_name != null) return false;
    return address != null ? address.equals(that.address) : that.address == null;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (first_name != null ? first_name.hashCode() : 0);
    result = 31 * result + (last_name != null ? last_name.hashCode() : 0);
    result = 31 * result + (address != null ? address.hashCode() : 0);
    return result;
  }
}

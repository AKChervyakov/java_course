package ru.stqa.pft.addressbook.model;

import com.google.gson.annotations.Expose;
import com.sun.javafx.beans.IDProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.File;

@Entity
@Table (name = "addressbook")
@XStreamAlias("contact")
public class ContactData {
  @XStreamOmitField
  @Id
  @Column(name = "id")
  private int id = Integer.MAX_VALUE;;

  @Expose
  @Column(name = "firstname")
  private String first_name;

  @Expose
  @Column(name = "middlename")
  private String middle_name;

  @Expose
  @Column(name = "lastname")
  private String last_name;

  @Expose
  @Column(name = "nickname")
  private String nickname;

  @Expose
  @Column(name = "title")
  private String title;

  @Expose
  @Column(name = "company")
  private String company;

  @Expose
  @Column(name = "address")
  @Type(type = "text")
  private String address;

  @Expose
  @Column(name = "home")
  @Type(type = "text")
  private String telephone_Home;

  @Expose
  @Column(name = "mobile")
  @Type(type = "text")
  private String telephone_Mobile;

  @Expose
  @Column(name = "work")
  @Type(type = "text")
  private String telephone_Work;

  @Expose
  @Column(name = "fax")
  @Type(type = "text")
  private String fax;

  @Expose
  @Column(name = "email")
  @Type(type = "text")
  private String email;

  @Expose
  @Column(name = "email2")
  @Type(type = "text")
  private String email2;

  @Expose
  @Column(name = "email3")
  @Type(type = "text")
  private String email3;

  @Expose
  @Column(name = "homepage")
  @Type(type = "text")
  private String homepage;

  @Expose
  @Transient
  private String birthday_day;

  @Expose
  @Transient
  private String birthday_day_ent;

  @Expose
  @Transient
  private String birthday_mon;

  @Expose
  @Transient
  private String birthday_mon_ent;

  @Expose
  @Transient
  private String birthday_year;

  @Expose
  @Transient
  private String anniversary_day;

  @Expose
  @Transient
  private String anniversary_day_ent;

  @Expose
  @Transient
  private String anniversary_mon;

  @Expose
  @Transient
  private String anniversary_mon_ent;

  @Expose
  @Transient
  private String anniversary_year;

  @Expose
  @Transient
  private String group;

  @Expose
  @Transient
  private String allPhones;

  @Expose
  @Transient
  private String allEmails;

  @Expose
  @Transient
  private String allInformation;

  @Expose
  @Transient
  @Column(name = "photo")
  @Type(type = "text")
  private String photo;

  public File getPhoto() {
    return new File(photo);
  }

  public ContactData withPhoto(File photo) {
    this.photo = photo.getPath();
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
            ", middle_name='" + middle_name + '\'' +
            ", last_name='" + last_name + '\'' +
            ", nickname='" + nickname + '\'' +
            ", title='" + title + '\'' +
            ", company='" + company + '\'' +
            ", address='" + address + '\'' +
            ", telephone_Home='" + telephone_Home + '\'' +
            ", telephone_Mobile='" + telephone_Mobile + '\'' +
            ", telephone_Work='" + telephone_Work + '\'' +
            ", fax='" + fax + '\'' +
            ", email='" + email + '\'' +
            ", email2='" + email2 + '\'' +
            ", email3='" + email3 + '\'' +
            ", homepage='" + homepage + '\'' +
            ", birthday_day='" + birthday_day + '\'' +
            ", birthday_day_ent='" + birthday_day_ent + '\'' +
            ", birthday_mon='" + birthday_mon + '\'' +
            ", birthday_mon_ent='" + birthday_mon_ent + '\'' +
            ", birthday_year='" + birthday_year + '\'' +
            ", anniversary_day='" + anniversary_day + '\'' +
            ", anniversary_day_ent='" + anniversary_day_ent + '\'' +
            ", anniversary_mon='" + anniversary_mon + '\'' +
            ", anniversary_mon_ent='" + anniversary_mon_ent + '\'' +
            ", anniversary_year='" + anniversary_year + '\'' +
            ", group='" + group + '\'' +
            ", allPhones='" + allPhones + '\'' +
            ", allEmails='" + allEmails + '\'' +
            ", allInformation='" + allInformation + '\'' +
            ", photo='" + photo + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (id != that.id) return false;
    if (first_name != null ? !first_name.equals(that.first_name) : that.first_name != null) return false;
    if (middle_name != null ? !middle_name.equals(that.middle_name) : that.middle_name != null) return false;
    if (last_name != null ? !last_name.equals(that.last_name) : that.last_name != null) return false;
    if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
    if (title != null ? !title.equals(that.title) : that.title != null) return false;
    if (company != null ? !company.equals(that.company) : that.company != null) return false;
    if (address != null ? !address.equals(that.address) : that.address != null) return false;
    if (telephone_Home != null ? !telephone_Home.equals(that.telephone_Home) : that.telephone_Home != null)
      return false;
    if (telephone_Mobile != null ? !telephone_Mobile.equals(that.telephone_Mobile) : that.telephone_Mobile != null)
      return false;
    if (telephone_Work != null ? !telephone_Work.equals(that.telephone_Work) : that.telephone_Work != null)
      return false;
    if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
    if (email != null ? !email.equals(that.email) : that.email != null) return false;
    if (email2 != null ? !email2.equals(that.email2) : that.email2 != null) return false;
    if (email3 != null ? !email3.equals(that.email3) : that.email3 != null) return false;
    if (homepage != null ? !homepage.equals(that.homepage) : that.homepage != null) return false;
    if (birthday_day != null ? !birthday_day.equals(that.birthday_day) : that.birthday_day != null) return false;
    if (birthday_day_ent != null ? !birthday_day_ent.equals(that.birthday_day_ent) : that.birthday_day_ent != null)
      return false;
    if (birthday_mon != null ? !birthday_mon.equals(that.birthday_mon) : that.birthday_mon != null) return false;
    if (birthday_mon_ent != null ? !birthday_mon_ent.equals(that.birthday_mon_ent) : that.birthday_mon_ent != null)
      return false;
    if (birthday_year != null ? !birthday_year.equals(that.birthday_year) : that.birthday_year != null) return false;
    if (anniversary_day != null ? !anniversary_day.equals(that.anniversary_day) : that.anniversary_day != null)
      return false;
    if (anniversary_day_ent != null ? !anniversary_day_ent.equals(that.anniversary_day_ent) : that.anniversary_day_ent != null)
      return false;
    if (anniversary_mon != null ? !anniversary_mon.equals(that.anniversary_mon) : that.anniversary_mon != null)
      return false;
    if (anniversary_mon_ent != null ? !anniversary_mon_ent.equals(that.anniversary_mon_ent) : that.anniversary_mon_ent != null)
      return false;
    if (anniversary_year != null ? !anniversary_year.equals(that.anniversary_year) : that.anniversary_year != null)
      return false;
    if (group != null ? !group.equals(that.group) : that.group != null) return false;
    if (allPhones != null ? !allPhones.equals(that.allPhones) : that.allPhones != null) return false;
    if (allEmails != null ? !allEmails.equals(that.allEmails) : that.allEmails != null) return false;
    if (allInformation != null ? !allInformation.equals(that.allInformation) : that.allInformation != null)
      return false;
    return photo != null ? photo.equals(that.photo) : that.photo == null;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (first_name != null ? first_name.hashCode() : 0);
    result = 31 * result + (middle_name != null ? middle_name.hashCode() : 0);
    result = 31 * result + (last_name != null ? last_name.hashCode() : 0);
    result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
    result = 31 * result + (title != null ? title.hashCode() : 0);
    result = 31 * result + (company != null ? company.hashCode() : 0);
    result = 31 * result + (address != null ? address.hashCode() : 0);
    result = 31 * result + (telephone_Home != null ? telephone_Home.hashCode() : 0);
    result = 31 * result + (telephone_Mobile != null ? telephone_Mobile.hashCode() : 0);
    result = 31 * result + (telephone_Work != null ? telephone_Work.hashCode() : 0);
    result = 31 * result + (fax != null ? fax.hashCode() : 0);
    result = 31 * result + (email != null ? email.hashCode() : 0);
    result = 31 * result + (email2 != null ? email2.hashCode() : 0);
    result = 31 * result + (email3 != null ? email3.hashCode() : 0);
    result = 31 * result + (homepage != null ? homepage.hashCode() : 0);
    result = 31 * result + (birthday_day != null ? birthday_day.hashCode() : 0);
    result = 31 * result + (birthday_day_ent != null ? birthday_day_ent.hashCode() : 0);
    result = 31 * result + (birthday_mon != null ? birthday_mon.hashCode() : 0);
    result = 31 * result + (birthday_mon_ent != null ? birthday_mon_ent.hashCode() : 0);
    result = 31 * result + (birthday_year != null ? birthday_year.hashCode() : 0);
    result = 31 * result + (anniversary_day != null ? anniversary_day.hashCode() : 0);
    result = 31 * result + (anniversary_day_ent != null ? anniversary_day_ent.hashCode() : 0);
    result = 31 * result + (anniversary_mon != null ? anniversary_mon.hashCode() : 0);
    result = 31 * result + (anniversary_mon_ent != null ? anniversary_mon_ent.hashCode() : 0);
    result = 31 * result + (anniversary_year != null ? anniversary_year.hashCode() : 0);
    result = 31 * result + (group != null ? group.hashCode() : 0);
    result = 31 * result + (allPhones != null ? allPhones.hashCode() : 0);
    result = 31 * result + (allEmails != null ? allEmails.hashCode() : 0);
    result = 31 * result + (allInformation != null ? allInformation.hashCode() : 0);
    result = 31 * result + (photo != null ? photo.hashCode() : 0);
    return result;
  }
}

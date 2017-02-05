package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String first_name;
  private final String middle_name;
  private final String last_name;
  private final String nickname;
  private final String title;
  private final String company;
  private final String address;
  private final String telephone_Home;
  private final String telephone_Mobile;
  private final String telephone_Work;
  private final String fax;
  private final String email;
  private final String email2;
  private final String email3;
  private final String homepage;
  private final String birthday_day;
  private final String birthday_day_ent;
  private final String birthday_mon;
  private final String birthday_mon_ent;
  private final String birthday_year;
  private final String anniversary_day;
  private final String anniversary_day_ent;
  private final String anniversary_mon;
  private final String anniversary_mon_ent;
  private final String anniversary_year;
  private final String group;
  private final String group_ent;
  private final String sec_Address;
  private final String sec_Phone;
  private final String notes;

  public ContactData(String First_name, String Middle_name, String Last_name, String Nickname, String Title, String Company, String Address, String Telephone_Home, String Telephone_Mobile, String Telephone_Work, String Fax, String Email, String Email2, String Email3, String Homepage, String Birthday_day, String Birthday_day_ent, String Birthday_mon, String Birthday_mon_ent, String Birthday_year, String Anniversary_day, String Anniversary_day_ent, String Anniversary_mon, String Anniversary_mon_ent, String Anniversary_year, String Group, String Group_ent, String Sec_Address, String Sec_Phone, String Notes) {
    first_name = First_name;
    middle_name = Middle_name;
    last_name = Last_name;
    nickname = Nickname;
    title = Title;
    company = Company;
    address = Address;
    telephone_Home = Telephone_Home;
    telephone_Mobile = Telephone_Mobile;
    telephone_Work = Telephone_Work;
    fax = Fax;
    email = Email;
    email2 = Email2;
    email3 = Email3;
    homepage = Homepage;
    birthday_day = Birthday_day;
    birthday_day_ent = Birthday_day_ent;
    birthday_mon = Birthday_mon;
    birthday_mon_ent = Birthday_mon_ent;
    birthday_year = Birthday_year;
    anniversary_day = Anniversary_day;
    anniversary_day_ent = Anniversary_day_ent;
    anniversary_mon = Anniversary_mon;
    anniversary_mon_ent = Anniversary_mon_ent;
    anniversary_year = Anniversary_year;
    group = Group;
    group_ent = Group_ent;
    sec_Address = Sec_Address;
    sec_Phone = Sec_Phone;
    notes = Notes;
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

  public String getGroup_ent() {
    return group_ent;
  }

  public String getSec_Address() {
    return sec_Address;
  }

  public String getSec_Phone() {
    return sec_Phone;
  }

  public String getNotes() {
    return notes;
  }
}

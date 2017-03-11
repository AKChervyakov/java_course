package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String id;
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
  private String group;

  public ContactData(String First_name, String Middle_name, String Last_name, String Nickname, String Title, String Company, String Address, String Telephone_Home, String Telephone_Mobile, String Telephone_Work, String Fax, String Email, String Email2, String Email3, String Homepage, String Birthday_day, String Birthday_day_ent, String Birthday_mon, String Birthday_mon_ent, String Birthday_year, String Anniversary_day, String Anniversary_day_ent, String Anniversary_mon, String Anniversary_mon_ent, String Anniversary_year, String group) {
    id = null;
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
    this.group = group;
  }

  public ContactData(String ID, String First_name, String Middle_name, String Last_name, String Nickname, String Title, String Company, String Address, String Telephone_Home, String Telephone_Mobile, String Telephone_Work, String Fax, String Email, String Email2, String Email3, String Homepage, String Birthday_day, String Birthday_day_ent, String Birthday_mon, String Birthday_mon_ent, String Birthday_year, String Anniversary_day, String Anniversary_day_ent, String Anniversary_mon, String Anniversary_mon_ent, String Anniversary_year, String group) {
    id = ID;
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
    this.group = group;
  }

  public String getId() {
    return id;
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (id != null ? !id.equals(that.id) : that.id != null) return false;
    if (first_name != null ? !first_name.equals(that.first_name) : that.first_name != null) return false;
    if (last_name != null ? !last_name.equals(that.last_name) : that.last_name != null) return false;
    if (address != null ? !address.equals(that.address) : that.address != null) return false;
    if (telephone_Home != null ? !telephone_Home.equals(that.telephone_Home) : that.telephone_Home != null)
      return false;
    if (telephone_Mobile != null ? !telephone_Mobile.equals(that.telephone_Mobile) : that.telephone_Mobile != null)
      return false;
    if (telephone_Work != null ? !telephone_Work.equals(that.telephone_Work) : that.telephone_Work != null)
      return false;
    if (email != null ? !email.equals(that.email) : that.email != null) return false;
    if (email2 != null ? !email2.equals(that.email2) : that.email2 != null) return false;
    return email3 != null ? email3.equals(that.email3) : that.email3 == null;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (first_name != null ? first_name.hashCode() : 0);
    result = 31 * result + (last_name != null ? last_name.hashCode() : 0);
    result = 31 * result + (address != null ? address.hashCode() : 0);
    result = 31 * result + (telephone_Home != null ? telephone_Home.hashCode() : 0);
    result = 31 * result + (telephone_Mobile != null ? telephone_Mobile.hashCode() : 0);
    result = 31 * result + (telephone_Work != null ? telephone_Work.hashCode() : 0);
    result = 31 * result + (email != null ? email.hashCode() : 0);
    result = 31 * result + (email2 != null ? email2.hashCode() : 0);
    result = 31 * result + (email3 != null ? email3.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id='" + id + '\'' +
            ", first_name='" + first_name + '\'' +
            ", last_name='" + last_name + '\'' +
            ", address='" + address + '\'' +
            ", telephone_Home='" + telephone_Home + '\'' +
            ", telephone_Mobile='" + telephone_Mobile + '\'' +
            ", telephone_Work='" + telephone_Work + '\'' +
            ", email='" + email + '\'' +
            ", email2='" + email2 + '\'' +
            ", email3='" + email3 + '\'' +
            '}';
  }

}

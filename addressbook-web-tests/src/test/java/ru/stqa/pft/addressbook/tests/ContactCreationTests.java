package ru.stqa.pft.addressbook.tests;

import com.thoughtworks.xstream.XStream;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase {

/** Провайдер для csv
  @DataProvider
  public Iterator<Object[]> validContacts() throws IOException {
    List<Object[]> list = new ArrayList<Object[]>();
//    File photo = new File("src/test/resources/MyPhoto.jpg");
    BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/contacts.csv")));
    String line = reader.readLine();
    while (line != null) {
      String[] split = line.split(";");
      list.add(new Object[] {new ContactData().withFirst_name(split[0]).withMiddle_name(split[1]).withLast_name(split[2])
              .withNickname(split[3]).withTitle(split[4]).withCompany(split[5]).withAddress(split[6]).withTelephone_Home(split[7])
              .withTelephone_Mobile(split[8]).withTelephone_Work(split[9]).withFax(split[10]).withEmail(split[11])
              .withEmail2(split[12]).withEmail3(split[13])});
      line = reader.readLine();
    }
    return list.iterator();
  }
 */

//Провайдер для xml
  @DataProvider
  public Iterator<Object[]> validContacts() throws IOException {
//    File photo = new File("src/test/resources/MyPhoto.jpg");
    BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/contacts.xml")));
    String xml = "";
    String line = reader.readLine();
    while (line != null) {
      xml += line;
      line = reader.readLine();
    }
    XStream xstream = new XStream();
    xstream.processAnnotations(ContactData.class);
    List<ContactData> groups = (List<ContactData>) xstream.fromXML(xml);
    return groups.stream().map((c) -> new Object[] {c}).collect(Collectors.toList()).iterator();
  }

  @Test(dataProvider = "validContacts")
  public void testContactCreation(ContactData contact) {
    app.goTo().home();
    Contacts before = app.contact().all();
    app.contact().createContact(contact, true);
    assertThat(app.contact().count(), equalTo(before.size() + 1));
    Contacts after = app.contact().all();
    assertThat(after, equalTo(
            before.withAdded(contact.withId(after.stream().mapToInt((c) -> c.getId()).max().getAsInt()))));
  }

  @Test (enabled = false)
  public void testCurrentDir() {
    File currentDir = new File (".");
    System.out.println(currentDir.getAbsolutePath());
    File photo = new File("src/test/resources/MyPhoto.jpg");
    System.out.println(photo.getAbsolutePath());
    System.out.println(photo.exists());
  }
}

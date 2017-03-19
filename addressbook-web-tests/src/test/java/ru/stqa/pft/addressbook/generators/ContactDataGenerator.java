package ru.stqa.pft.addressbook.generators;

import ru.stqa.pft.addressbook.model.ContactData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sanchez on 19.03.2017.
 */
public class ContactDataGenerator {

  public static void main(String[] args) throws IOException {
    int count = Integer.parseInt(args[0]);
    File file = new File(args[1]);

    List<ContactData> contacts = generateContacts(count);
    save(contacts, file);
  }

  private static void save(List<ContactData> contacts, File file) throws IOException {
    Writer writer = new FileWriter(file);
    for (ContactData contact : contacts) {
      writer.write(String.format("%s;%s;%s:%s;%s;%s;%s;%s;%s:%s;%s;%s;%s\n", contact.getFirst_name(), contact.getMiddle_name()
      , contact.getLast_name(), contact.getNickname(), contact.getTitle(), contact.getCompany(), contact.getAddress()
      , contact.getTelephone_Home(), contact.getTelephone_Mobile(), contact.getTelephone_Work(), contact.getFax()
      , contact.getEmail(), contact.getEmail2(), contact.getEmail3()));
    }
    writer.close();
  }

  private static List<ContactData> generateContacts(int count) {
    List<ContactData> contacts = new ArrayList<ContactData>();
    for (int i = 0; i < count; i++) {
      contacts.add(new ContactData().withFirst_name(String.format("Петров %s", i))
              .withMiddle_name(String.format("Петрович %s", i)).withLast_name(String.format("Петр %s", i))
              .withNickname(String.format("Petrov %s", i)).withTitle(String.format("title %s", i))
              .withCompany(String.format("company %s", i)).withAddress(String.format("Столичная 34 %s", i))
              .withTelephone_Home(String.format("584-49-03 %s", i)).withTelephone_Mobile(String.format("+7(978)403-89-09 %s", i))
              .withTelephone_Work(String.format("374-44-33 %s", i)).withFax(String.format("fax %s", i))
              .withEmail(String.format("petrov1.mail.ru %s", i)).withEmail2(String.format("PPetrov2@yandex.ru %s", i))
              .withEmail3(String.format("email3@gmail.com %s", i)).withHomepage(String.format("homepage %s", i)));
    }
    return contacts;
  }
}

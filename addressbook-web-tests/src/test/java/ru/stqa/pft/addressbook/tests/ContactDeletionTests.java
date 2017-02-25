package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Sanchez on 13.02.2017.
 */
public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion(){
    app.getNavigationHelper().goToHome();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
  }
}

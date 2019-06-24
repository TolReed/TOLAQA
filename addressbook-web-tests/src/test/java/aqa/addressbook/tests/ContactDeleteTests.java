package aqa.addressbook.tests;

import aqa.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactDeleteTests extends TestBase {

    @Test
    public void testContactDeletion () {
        app.getNavigationHelper().gotoHomePage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Tol-AutoCreate", "Tol-AutoCreate", null));

        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().returnToHomePage();

    }


}

package aqa.addressbook.tests;

import aqa.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreateTests extends TestBase {

    @Test
    public void testContactCreation () {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("TolRockGroup_AQA7022019+777" , "TolRochGroupHEader707070", "TolRockGroup_AQA6182019+777"), false); // null як параметер, для значення за замовчуванням; true заповняємо випадаючий список
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();

    }
}

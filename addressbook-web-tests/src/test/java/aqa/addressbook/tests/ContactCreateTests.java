package aqa.addressbook.tests;

import aqa.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreateTests extends TestBase {

    @Test
    public void testGroupCreation () {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactCreation(); // app. спочатку кожного метода, тому що замінили наслідування делегуваннямб і створили нове поле при рефікторингу
        app.getContactHelper().fillContactForm(new ContactData("TolRockGroup_AQA6182019+777" , "TolRochGroupHEader707070", "TolRockGroup_AQA6182019+777"), true); // null як параметер, для значення за замовчуванням; true заповняємо випадаючий список
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();

    }
}

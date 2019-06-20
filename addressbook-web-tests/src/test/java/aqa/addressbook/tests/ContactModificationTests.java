package aqa.addressbook.tests;

import aqa.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testGroupCreation () {
        app.getNavigationHelper().gotoGroupPage();
        app.getContactHelper().initContactCreation(); // app. спочатку кожного метода, тому що замінили наслідування делегуваннямб і створили нове поле при рефікторингу
        app.getContactHelper().fillContactForm(new ContactData("TolRockGroup_AQA6182019+777" , "TolRochGroupHEader707070", null), false); // null як параметер, для значення за замовчуванням
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();

    }
}


package aqa.addressbook.tests;

import aqa.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification () {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        // app. спочатку кожного метода, тому що замінили наслідування делегуваннямб і створили нове поле при рефікторингу
        app.getContactHelper().fillContactForm(new ContactData("TolRockGroup_AQA - change" , "TolRoch - change", null), false);
        // null як параметер, для значення за замовчуванням, false так як для модифікації нема дропдаунв на сторінці цій
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();

    }
}


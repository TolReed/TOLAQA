package aqa.addressbook.appmanager;

import aqa.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
        click(By.xpath("//*[@id=\"content\"]/form/input[2]"));

    }

    public void fillContactForm (ContactData contactData, boolean creation) {

        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());

        if (creation ) {
            //імпортуємо новий селект метод і находим наш елемент
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }

    public void submitContactCreation() {click(By.xpath("//*[@id=\"content\"]/form/input[1]"));}

    public void returnToHomePage() {click(By.xpath("//*[@id=\"nav\"]/ul/li[1]/a"));}

    public void initContactModification() { click(By.cssSelector("img[alt='Edit']"));}

    public void submitContactModification() {
        click(By.xpath("//*[@id=\"content\"]/form[1]/input[22]"));
    }
}

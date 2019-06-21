package aqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }


    public void gotoGroupPage() {
        if (isElementPresent(By.tagName("h1"))
                //перевіряємо наявність заголовка
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                // перевіряємо текст заголовка
                && isElementPresent(By.name("new"))) {
                // перевіряємо чи є кнопка для створення нової групи по атрибуту new
            return;
            // вихід з метода, якщо умова винонується

        } else {
            click(By.linkText("groups")); // якщо умова з if  не виконується, то робимо click
        }
    }

    public void gotoHomePage() {
        if (isElementPresent(By.id("maintable"))) { //ідентифікуємо по таблиці, що це головна сторінка
            return;
        }
        click(By.linkText("home")); //якщо не на головній, то робимо клік для того аби перейти на головну
    }
}

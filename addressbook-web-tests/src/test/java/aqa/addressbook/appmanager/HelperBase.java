package aqa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    protected WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd; // присвоюємо, отримуємо доступ до драйверу ініціалізованого а аппМенехер і передану у хелперь
    }

    protected void click(By locator) {// метод для кліку по кнопцці
        wd.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        click(locator);
        if (text != null) { // пердаємо null у тесті як параметер, знгачення поля за замовчуванням
            String existingText = wd.findElement(locator).getAttribute("value");
            // якщо наш текст дорівнює тексту який уже введено, доцільно використовуватия якщо багато полів і дуже довгий текст
            if (! text.equals(existingText)) {
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }
    }

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}

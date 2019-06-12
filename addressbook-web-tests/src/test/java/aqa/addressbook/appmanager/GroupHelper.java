package aqa.addressbook.appmanager;

import aqa.addressbook.model.CreateGroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper {
    private FirefoxDriver wd;

    public GroupHelper(FirefoxDriver wd) {
        this.wd = wd; // присвоюємо, отримуємо доступ до драйверу ініціалізованого а аппМенехер і передану у хелперь
    }

    public void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillGroupData(CreateGroupData createGroupData) {//приймає тепер один об"єкт createGroupData, допоміжна функція
        typeGroupName((By.name("group_name")),createGroupData.getName());
        typeGroupName(By.name("group_header"), createGroupData.getHeader());
        typeGroupName(By.name("group_footer"), createGroupData.getFooter());
    }

    private void typeGroupName(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    public void deleteSelectedGroups() {// private - можна трігнути тільки з метода в том же самому класі нельзя копировать в той же клас
        wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {// protected - доступно в тому самому класі та класі наслідників
        wd.findElement(By.name("selected[]")).click();
    }
}

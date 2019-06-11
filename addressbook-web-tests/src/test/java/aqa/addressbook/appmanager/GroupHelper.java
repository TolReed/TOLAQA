package aqa.addressbook.appmanager;

import aqa.addressbook.model.CreateGroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper {
    private FirefoxDriver wd;

    public GroupHelper(FirefoxDriver wd) {
        this.wd = wd; // присвоюємо, отримуємо доступ до драйверу ініціалізованого а аппМенехер і передану у хелперь
    }

    public void returnToGroupPage(String s) {
        wd.findElement(By.linkText(s)).click();
    }

    public void submitGroupCreation(String submit) {
        wd.findElement(By.name(submit)).click();
    }

    public void fillGroupData(CreateGroupData createGroupData) {//приймає тепер один об"єкт createGroupData, допоміжна функція
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(createGroupData.getName());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(createGroupData.getHeader());
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(createGroupData.getFooter());
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

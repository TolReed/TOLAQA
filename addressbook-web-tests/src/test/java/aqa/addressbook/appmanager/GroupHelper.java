package aqa.addressbook.appmanager;

import aqa.addressbook.model.CreateGroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.ArrayList;


public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);// звернення до конструктора базового класа
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupData(CreateGroupData createGroupData) {//приймає тепер один об"єкт createGroupData, допоміжна функція
        type((By.name("group_name")),createGroupData.getName());
        type(By.name("group_header"), createGroupData.getHeader());
        type(By.name("group_footer"), createGroupData.getFooter());
    }

    public void initGroupCreation() {

        click(By.name("new"));
    }

    public void deleteSelectedGroups() {// private - можна трігнути тільки з метода в том же самому класі нельзя копировать в той же клас

        click(By.name("delete"));
    }

    public void selectGroup(int index) {
        // protected - доступно в тому самому класі та класі наслідників
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void createGroup(CreateGroupData group) {
       initGroupCreation();
       fillGroupData(group);
       submitGroupCreation();
       returnToGroupPage();
    }

    public boolean isThereAGroup() {
       return isElementPresent(By.name("selected[]"));
    }

    public int getGroupCount() {
        return wd.findElements(By.name("selected[]")).size(); //return elements
    }


    public List<CreateGroupData> getGroupList() {
        List<CreateGroupData> groups = new ArrayList<CreateGroupData>();
        List<WebElement> elements = wd.findElements(By.name("selected[]"));
        for (WebElement element : elements) {
            String name = element.getText(); // get name of the group
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            CreateGroupData group = new CreateGroupData(id, name, null, null); //object group data with parameters: id, name, header, footer
            groups.add(group);//add created object in the list of the groups
        }
        return groups;

    }
}



/*
    public List<CreateGroupData> getGroupList() {
        List<CreateGroupData> groups = new ArrayList<CreateGroupData>();
        List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
        for (WebElement element : elements) {
            String name = element.getText(); // get name of the group
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            CreateGroupData group = new CreateGroupData(id, name, null, null); //object group data with parameters: id, name, header, footer
            groups.add(group);//add created object in the list of the groups
        }
        return groups;

    }


*/
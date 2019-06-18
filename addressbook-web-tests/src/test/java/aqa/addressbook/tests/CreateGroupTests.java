package aqa.addressbook.tests;

import aqa.addressbook.model.CreateGroupData;
import org.testng.annotations.Test;

    public class CreateGroupTests extends TestBase {

    @Test
    public void testGroupCreation () {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation(); // app. спочатку кожного метода, тому що замінили наслідування делегуваннямб і створили нове поле при рефікторингу
        app.getGroupHelper().fillGroupData(new CreateGroupData("TolRockGroup_AQA6182019+777" , "TolRochGroupHEader707070", "TolRock707070 - AQA"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();

    }

}

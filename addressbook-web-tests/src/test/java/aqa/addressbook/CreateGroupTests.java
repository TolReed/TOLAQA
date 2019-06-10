package aqa.addressbook;

import org.testng.annotations.Test;

    public class CreateGroupTests extends TestBase {

    @Test
    public void testGroupCreation () {
        gotoGroupPage();
        initGroupCreation();
        fillGroupData(new CreateGroupData("TolRockGroup_AQA6102019+777" , "TolRochGroupHEader707070", "TolRock707070 - AQA"));
        submitGroupCreation("submit");
        returnToGroupPage("group page");

    }

}

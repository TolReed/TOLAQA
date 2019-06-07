package aqa.addressbook;

import org.testng.annotations.Test;

    public class CreateGroupTests extends TestBase {

    @Test
    public void testGroupCreation () {
        gotoGroupPage();
        initGroupCreation();
        fillGroupData(new CreateGroupData("TolRockGroup_AQA777", "TolRochGroupHEader", "TolRock - AQA"));
        submitGroupCreation("submit");
        returnToGroupPage("group page");

    }

}

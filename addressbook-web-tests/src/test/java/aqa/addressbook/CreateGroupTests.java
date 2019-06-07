package aqa.addressbook;

import org.testng.annotations.Test;

    public class CreateGroupTests extends TestBase {

    @Test
    public void testGroupCreation () {
        gotoGroupPage("groups");
        initGroupCreation("new");
        fillGroupData(new CreateGroupData("TolRockGroup_AQA", "TolRochGroupHEader", "TolRock - AQA"));
        submitGroupCreation("submit");
        returnToGroupPage("group page");

    }

}

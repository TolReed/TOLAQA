package aqa.addressbook.tests;

import org.testng.annotations.*;

public class DeleteGroupTests extends TestBase {

    @Test
    public void testDeleteGroup() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage("groups");
    }

}
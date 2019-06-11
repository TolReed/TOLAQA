package aqa.addressbook.tests;

import org.testng.annotations.*;

public class DeleteGroupTests extends TestBase {

    @Test
    public void testDeleteGroup() {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returnToGroupPage("groups");
    }

}
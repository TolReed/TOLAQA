package aqa.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class DeleteGroupTests extends TestBase {

    @Test
    public void testDeleteGroup() {
        gotoGroupPage("groups");
        selectGroup();
        deleteSelectedGroups();
        returnToGroupPage("groups");
    }

}

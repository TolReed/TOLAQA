package aqa.addressbook.tests;

import aqa.addressbook.appmanager.ApplicationManager;
import aqa.addressbook.model.CreateGroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupData(new CreateGroupData("Change1-name", "Change2-header", "Change3-footer"));
    }
}

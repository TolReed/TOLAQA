package aqa.addressbook.tests;

import aqa.addressbook.appmanager.ApplicationManager;
import aqa.addressbook.model.CreateGroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {//just a comment here, please change it whenever you want, thanks

        app.getNavigationHelper().gotoGroupPage();
        List<CreateGroupData> before = app.getGroupHelper().getGroupList(); // quantity of group before creation

        if (! app.getGroupHelper().isThereAGroup()) {//якщо не існує ні одної групи
            app.getGroupHelper().createGroup(new CreateGroupData("Tol-AutoCreate", "Tol-AutoCreate", null));
        }
        app.getGroupHelper().selectGroup(before.size() - 1);
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupData(new CreateGroupData("Change1-name", "Change2-header", "Change3-footer"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        List<CreateGroupData> after = app.getGroupHelper().getGroupList(); // quantity of group after creation
        Assert.assertEquals(after.size(), before.size());
    }
}

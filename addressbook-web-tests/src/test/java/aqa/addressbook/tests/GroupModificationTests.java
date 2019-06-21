package aqa.addressbook.tests;

import aqa.addressbook.appmanager.ApplicationManager;
import aqa.addressbook.model.CreateGroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {//just a comment here, please change it whenever you want, thanks
        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAGroup()) {//якщо не існує ні одної групи
            app.getGroupHelper().createGroup(new CreateGroupData("Tol-AutoCreate", "Tol-AutoCreate", null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupData(new CreateGroupData("Change1-name", "Change2-header", "Change3-footer"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}

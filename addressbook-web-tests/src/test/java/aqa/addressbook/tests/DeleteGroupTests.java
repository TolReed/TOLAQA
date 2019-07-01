package aqa.addressbook.tests;

import aqa.addressbook.model.CreateGroupData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class DeleteGroupTests extends TestBase {

    @Test
    public void testDeleteGroup() {
        app.getNavigationHelper().gotoGroupPage();

        if (! app.getGroupHelper().isThereAGroup()) {//якщо не існує ні одної групи
            app.getGroupHelper().createGroup(new CreateGroupData("Tol-AutoCreate", "Tol-AutoCreate", null));
        }

        List<CreateGroupData> before = app.getGroupHelper().getGroupList(); // quantity of group before creation
        app.getGroupHelper().selectGroup(before.size() - 1); //if we want to delete the last element in the group list = before - 1
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
        List<CreateGroupData> after = app.getGroupHelper().getGroupList(); // quantity of group after creation
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(before, after); // less code here, the same results as for multiline comment below, we give to lists for compare
        /* for (int i = 0; i < after.size(); i++) {
            Assert.assertEquals(before.get(i), after.get(i));
        } */
    }

}
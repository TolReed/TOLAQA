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

        //int before = app.getGroupHelper().getGroupCount(); //count groups before test
        List<CreateGroupData> before = app.getGroupHelper().getGroupList(); // list of elements of group before creation
        app.getGroupHelper().selectGroup(before.size() - 1); //if we want to delete the last element in the group list = before - 1
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
        //int after = app.getGroupHelper().getGroupCount();
        List<CreateGroupData> after = app.getGroupHelper().getGroupList(); // quantity of group after creation
        //Assert.assertEquals(after, before + 1); //count groups test after the test finish
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(before, after); // less code here, the same results as for multiline comment below, we give to lists for compare
        /* for (int i = 0; i < after.size(); i++) {
            Assert.assertEquals(before.get(i), after.get(i));
        } another way to do the same as 3 lines above */
    }

}
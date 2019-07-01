package aqa.addressbook.tests;

import aqa.addressbook.appmanager.ApplicationManager;
import aqa.addressbook.model.CreateGroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {//just a comment here, please change it whenever you want, thanks
        app.getNavigationHelper().gotoGroupPage();

        if (! app.getGroupHelper().isThereAGroup()) {//якщо не існує ні одної групи
            app.getGroupHelper().createGroup(new CreateGroupData("Tol-AutoCreate", "Tol-AutoCreate", null));
        }

        List<CreateGroupData> before = app.getGroupHelper().getGroupList(); // quantity of group before creation
        app.getGroupHelper().selectGroup(before.size() - 1);
        app.getGroupHelper().initGroupModification();
        CreateGroupData group = new CreateGroupData(before.get(before.size()-1).getId(),"Change1-name", "Change2-header", "Change3-footer");
        app.getGroupHelper().fillGroupData(group);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        List<CreateGroupData> after = app.getGroupHelper().getGroupList(); // quantity of group after creation
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(group);//add object ot the list after creation/modification
        Assert.assertEquals(new HashSet<>(before), new HashSet<>(after));//compare two lists без учета порядка
    }
}

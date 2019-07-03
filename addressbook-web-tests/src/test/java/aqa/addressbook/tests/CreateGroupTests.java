package aqa.addressbook.tests;

import aqa.addressbook.model.CreateGroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;


public class CreateGroupTests extends TestBase {

    @Test
    public void testGroupCreation () {
        app.getNavigationHelper().gotoGroupPage();
        //int before = app.getGroupHelper().getGroupCount(); //count groups before test
        List<CreateGroupData> before = app.getGroupHelper().getGroupList(); // list of group before creation
        CreateGroupData group = new CreateGroupData("TolRock-AQA-newGroup", "TolRock-AQA-newHeader", "TolRock-AQA-newFooter");
        app.getGroupHelper().createGroup(group);
        //int after = app.getGroupHelper().getGroupCount();
        List<CreateGroupData> after = app.getGroupHelper().getGroupList(); // quantity of group after creation
        //Assert.assertEquals(after, before + 1); //count groups test after the test finish
        Assert.assertEquals(after.size(), before.size() + 1);


        int max = 0;
        for (CreateGroupData g : after) {
            if (g.getId() > max) {
                max = g.getId();
            }
        }
        group.setId(max);

        before.add(group); //add object to the list after creation/modification of a group
        Assert.assertEquals(new HashSet<>(before), new HashSet<>(after)); //compare two lists без учета порядка
    }

}

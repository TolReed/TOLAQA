package aqa.addressbook.tests;

import aqa.addressbook.model.CreateGroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CreateGroupTests extends TestBase {

    @Test
    public void testGroupCreation () {
        app.getNavigationHelper().gotoGroupPage();
        List<CreateGroupData> before = app.getGroupHelper().getGroupList(); // list of group before creation
        app.getGroupHelper().createGroup(new CreateGroupData("TolRockGroup_AQA6182019+777" , "TolRochGroupHEader707070", null)); // null як параметер, для значення за замовчуванням
        List<CreateGroupData> after = app.getGroupHelper().getGroupList(); // quantity of group after creation
        Assert.assertEquals(after.size(), before.size() + 1);
    }

}

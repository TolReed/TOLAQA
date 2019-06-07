package aqa.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static java.util.concurrent.TimeUnit.SECONDS;

    public class CreateGroupTests {

        FirefoxDriver wd;

    @BeforeMethod
    public  void setUp () throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait (60, SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        login("admin", "secret");
    }

    public void login(String username, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    @Test
    public void testGroupCreation () {
        gotoGroupPage("groups");
        initGroupCreation("new");
        fillGroupData(new CreateGroupData("TolRockGroup_AQA", "TolRochGroupHEader", "TolRock - AQA"));
        submitGroupCreation("submit");
        returnToGroupPage("group page");

    }

        private void returnToGroupPage(String s) {
            wd.findElement(By.linkText(s)).click();
        }

        private void submitGroupCreation(String submit) {
            wd.findElement(By.name(submit)).click();
        }

        private void fillGroupData(CreateGroupData createGroupData) {//приймає тепер один об"єкт createGroupData
            wd.findElement(By.name("group_name")).click();
            wd.findElement(By.name("group_name")).clear();
            wd.findElement(By.name("group_name")).sendKeys(createGroupData.getName());
            wd.findElement(By.name("group_header")).click();
            wd.findElement(By.name("group_header")).clear();
            wd.findElement(By.name("group_header")).sendKeys(createGroupData.getHeader());
            wd.findElement(By.name("group_footer")).click();
            wd.findElement(By.name("group_footer")).clear();
            wd.findElement(By.name("group_footer")).sendKeys(createGroupData.getFooter());
        }

        private void initGroupCreation(String s) {
            wd.findElement(By.name(s)).click();
        }

        private void gotoGroupPage(String groups) {
            wd.findElement(By.linkText(groups)).click();
        }

        @AfterMethod
    public  void tearDown () {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }



}

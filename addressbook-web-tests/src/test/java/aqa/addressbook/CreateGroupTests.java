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
        login();
    }

    public void login () {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();

        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    @Test
    public void testGroupCreation () {
        wd.findElement(By.linkText("groups")).click();
        wd.findElement(By.name("new")).click();
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys("TolRockGroup_AQA");
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys("TolRochGroupHEader");
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys("TolRock - AQA");
        wd.findElement(By.name("submit")).click();
        wd.findElement(By.linkText("group page")).click();
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

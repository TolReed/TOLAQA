package aqa.addressbook.tests;

import aqa.addressbook.appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {// ініціалізірує об"єкт AM а потім знищує його
    protected final ApplicationManager app = new ApplicationManager();// ссилка на новий об"єкт

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}


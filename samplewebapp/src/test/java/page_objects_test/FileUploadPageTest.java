package page_objects_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.FileUploadPage;
import page_objects.HomePage;

public class FileUploadPageTest extends BrowserDriver {

    FileUploadPage fileUploadPage = null;
    HomePage homePage = null;

    @BeforeMethod
    public void initializeElements(){
        fileUploadPage = PageFactory.initElements(driver, FileUploadPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void fileUploadTest(){
        homePage.goToFileUploadPage();
      String actualText =  fileUploadPage.fileUpload();
      Assert.assertEquals(actualText,"File Uploaded!");

    }



}

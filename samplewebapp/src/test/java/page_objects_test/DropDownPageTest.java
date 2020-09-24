package page_objects_test;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.DropDownPage;
import page_objects.FileUploadPage;
import page_objects.HomePage;

public class DropDownPageTest extends BrowserDriver {
    HomePage homePage = null;
    DropDownPage dropDownPage = null;

    @BeforeMethod
    public void initializeElements(){
        dropDownPage = PageFactory.initElements(driver, DropDownPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void dropDownTest(){
        homePage.goToDropdownPage();
        dropDownPage.selectOption("1");

    }
}

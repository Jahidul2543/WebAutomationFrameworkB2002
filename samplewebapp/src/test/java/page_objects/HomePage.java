package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.LINK_TEXT, using = "File Upload")
    WebElement file_upload;

    @FindBy(how = How.LINK_TEXT, using = "Dropdown")
    WebElement dropdown;

    public void goToFileUploadPage(){
        file_upload.click();
    }

    public void goToDropdownPage(){
        dropdown.click();
    }
}

package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.List;

public class FileUploadPage {

    WebDriver driver = null;
    @FindBy(how = How.ID, using = "file-upload")
    WebElement file_upload;

    @FindBy(how = How.ID, using = "file-submit")
    WebElement submitButton;

    @FindBy(how = How.TAG_NAME, using = "h3")
    WebElement message;


    public String fileUpload(){
        file_upload.sendKeys("/Users/jahidul/IdeaProjects/WebAutomationFrameworkB2002/samplewebapp/data/demo.txt");
        submitButton.click();
        String uploadMessage =  message.getText();
      return uploadMessage;
    }



}

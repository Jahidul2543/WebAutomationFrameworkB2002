package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class ContactUsPage {

    @FindBy(how = How.ID, using = "message")
    WebElement messageBox;

    @FindBy(how = How.ID, using = "submitMessage")
    WebElement submitButton;

    @FindBy(how = How.XPATH, using = "//div[@id='center_column']/div/p")
    WebElement errorMessage;

    public void sendText(){
        TestLogger.log("Sending texts to message box");
        messageBox.sendKeys("Hello Writing from web automation framework");
        TestLogger.log("Message written in message box");
        clickSubmitButton();

    }

    public void clickSubmitButton() {
        TestLogger.log("CLick Submit Button");
        submitButton.click();
        TestLogger.log("CLicked Submit Button");

    }

    public String getErrorMessage(){

      String message =  errorMessage.getText();

        return message;

    }

}

package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

    @FindBy(how = How.ID, using = "dropdown")
    WebElement dropdown;

    public void selectOption(String optionValue){
        Select select = new Select(dropdown);
        // Select Option
        select.selectByValue(optionValue);
    }

}

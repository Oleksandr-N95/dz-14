package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteFormPage extends AbstractPageObject{

    private final By deleteButtonField = By.cssSelector("#delete-record-1");

    public DeleteFormPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/webtables");
    }

    public DeleteFormPage deleteForm() {
        clickOnElement(deleteButtonField);
        return new DeleteFormPage(driver);
    }
}

package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteFormPage extends AbstractPageObject{

    private final By deleteButtonField = By.cssSelector("#delete-record-1");

    public DeleteFormPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/webtables");
    }

    public WebElement deleteRecord(String lastName) {
        return getElement(deleteRecordXpath(lastName));
    }

    private By deleteRecordXpath(String lastName) {
        return By.xpath(String.format("(//div[@class='rt-table']//div[text()])[2]", lastName));
    }

    public DeleteFormPage deleteForm() {
        clickOnElement(deleteButtonField);
        return new DeleteFormPage(driver);
    }
}

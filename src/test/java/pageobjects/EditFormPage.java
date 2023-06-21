package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditFormPage extends AbstractPageObject{

    private final By editButtonField = By.cssSelector("#edit-record-1");
    private final By ageField = By.cssSelector("#age");
    private final By salaryField = By.cssSelector("#salary");
    private final By departmentField = By.cssSelector("#department");
    private final By submitButtonField = By.cssSelector("#submit");

    public EditFormPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/webtables");
    }

    public WebElement editRecord(String department) {
        return getElement(editRecordXpath(department));
    }

    private By editRecordXpath(String department) {
        return By.xpath(String.format("(//div[@class='rt-table']//div[text()])[6]", department));
    }

    public EditFormPage editForm(int age, int salary, String department) {
        clickOnElement(editButtonField);
        getElement(ageField).sendKeys(String.valueOf(age));
        getElement(salaryField).sendKeys(String.valueOf(salary));
        getElement(departmentField).sendKeys(department);
        clickOnElement(submitButtonField);
        return new EditFormPage(driver);
    }
}

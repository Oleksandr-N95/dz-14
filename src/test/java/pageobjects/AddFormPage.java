package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddFormPage extends AbstractPageObject{

    private final By addButtonField = By.cssSelector("#addNewRecordButton");
    private final By firstNameField = By.cssSelector("#firstName");
    private final By lastNameField = By.cssSelector("#lastName");
    private final By emailField = By.cssSelector("#userEmail");
    private final By ageField = By.cssSelector("#age");
    private final By salaryField = By.cssSelector("#salary");
    private final By departmentField = By.cssSelector("#department");
    private final By submitButtonField = By.cssSelector("#submit");


    public AddFormPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/webtables");
    }

    public WebElement userRecord(String username) {
        return getElement(userRecordXpath(username));
    }

    private By userRecordXpath(String username) {
        return By.xpath(String.format("//div[@class='rt-table']//div[text()]", username));
    }

    public AddFormPage addForm(String firstName, String lastName, String email, int age, int salary, String department) {
        clickOnElement(addButtonField);
        getElement(firstNameField).sendKeys(firstName);
        getElement(lastNameField).sendKeys(lastName);
        getElement(emailField).sendKeys(email);
        getElement(ageField).sendKeys(String.valueOf(age));
        getElement(salaryField).sendKeys(String.valueOf(salary));
        getElement(departmentField).sendKeys(department);
        clickOnElement(submitButtonField);
        return new AddFormPage(driver);
    }


}

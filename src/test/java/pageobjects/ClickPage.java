package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickPage extends AbstractPageObject{

    private final By buttonField = By.cssSelector("#item-4");
    private final By clickButtonField = By.xpath("//button[text()='Click Me']");
    private final By messageTitle = By.cssSelector("#dynamicClickMessage");

    public ClickPage(WebDriver driver) {
        super(driver);
        driver.get("https://demoqa.com/elements");
    }

    public String getMessageText(){
        return getElement(messageTitle).getText();
    }

    public String clickOnTheButton (){
        clickOnElement(buttonField);
        clickOnElement(clickButtonField);
        String messageText = getElement(messageTitle).getText();
        System.out.println(messageText);
        return messageText;
    }




}

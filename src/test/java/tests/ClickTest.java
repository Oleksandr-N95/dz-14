package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ClickPage;

public class ClickTest extends BaseTest{
    @Test
    public void buttonClickTest(){
        new ClickPage(driver).clickOnTheButton();
        Assert.assertEquals(driver.getTitle(), "You have done a dynamic click", "This message is wrong");
    }
}

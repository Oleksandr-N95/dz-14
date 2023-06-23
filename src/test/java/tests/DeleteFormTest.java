package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.FormPage;

public class DeleteFormTest extends BaseTest{
    private final static String LASTNAME = "Vega";

    @Test
    public void deleteFormTest(){
        FormPage deleteFormPage = new FormPage(driver)
                .deleteForm();
        Assert.assertFalse(deleteFormPage.isElementPresent(By.id(LASTNAME)), "The form wasn't deleted");
    }
}

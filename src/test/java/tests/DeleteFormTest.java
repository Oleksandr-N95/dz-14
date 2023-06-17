package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.DeleteFormPage;

public class DeleteFormTest extends BaseTest{

    @Test
    public void deleteFormTest(){
        new DeleteFormPage(driver)
                .deleteForm();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/webtables", "The form wasn't deleted");
    }
}

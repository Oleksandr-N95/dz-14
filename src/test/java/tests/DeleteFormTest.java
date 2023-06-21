package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.DeleteFormPage;
import pageobjects.EditFormPage;

public class DeleteFormTest extends BaseTest{
    private final static String LASTNAME = "Vega";

    @Test
    public void deleteFormTest(){
        DeleteFormPage deleteFormPage = new DeleteFormPage(driver)
                .deleteForm();
        Assert.assertTrue(deleteFormPage.deleteRecord(LASTNAME).isEnabled(), "The form wasn't edited");
    }
}

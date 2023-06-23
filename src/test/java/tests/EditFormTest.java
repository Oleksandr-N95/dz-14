package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.FormPage;

public class EditFormTest extends BaseTest{
    private final static int AGE = 25;
    private final static int SALARY = 5000;
    private final static String DEPARTMENT = "QA";

    @Test
    public void editFormTest(){
        FormPage FormPage = new FormPage(driver);
                FormPage.editForm(AGE, SALARY, DEPARTMENT);
        Assert.assertTrue(FormPage.editRecord(DEPARTMENT).isDisplayed(), "The form wasn't edited");
    }


}

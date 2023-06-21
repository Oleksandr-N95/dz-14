package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.AddFormPage;
import pageobjects.EditFormPage;

public class EditFormTest extends BaseTest{
    private final static int AGE = 25;
    private final static int SALARY = 5000;
    private final static String DEPARTMENT = "QA";

    @Test
    public void editFormTest(){
        EditFormPage editFormPage = new EditFormPage(driver);
                editFormPage.editForm(AGE, SALARY, DEPARTMENT);
        Assert.assertTrue(editFormPage.editRecord(DEPARTMENT).isDisplayed(), "The form wasn't edited");
    }


}

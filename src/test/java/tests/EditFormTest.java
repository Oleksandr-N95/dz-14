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
        new EditFormPage(driver)
                .editForm(AGE, SALARY, DEPARTMENT);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/webtables", "The form wasn't edited");
    }


}

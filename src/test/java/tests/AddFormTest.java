package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.AddFormPage;

public class AddFormTest extends BaseTest{
    private final static String NAME = "Ben";
    private final static String LASTNAME = "Benson";
    private final static String EMAIL = "ben_benson@gmail.com";
    private final static int AGE = 30;
    private final static int SALARY = 2000;
    private final static String DEPARTMENT = "Department";


    @Test
    public void addFormTest() {
        AddFormPage addFormPage = new AddFormPage(driver);
        addFormPage.addForm(NAME, LASTNAME, EMAIL, AGE, SALARY, DEPARTMENT);
        Assert.assertTrue(addFormPage.userRecord(NAME).isDisplayed(), "The record was not created");
    }






}

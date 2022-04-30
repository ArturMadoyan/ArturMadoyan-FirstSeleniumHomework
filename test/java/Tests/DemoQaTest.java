package Tests;
import TestForDemoQa.Constants;
import TestForDemoQa.Text_box_page;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class DemoQaTest extends BaseTest{
    @Test
    public void demoQaTask() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        Text_box_page tB_Page = new Text_box_page(driver);
        Assert.assertEquals(Constants.EXPECTED_PAGE_URL,driver.getCurrentUrl());
        System.out.println(Constants.EXPECTED_PAGE_URL);
        System.out.println(driver.getCurrentUrl());

        String full_Name = tB_Page.fullNameField("Artur Madoyan");
        String email = tB_Page.emailField("Madoyan@gmail.com");
        String current_add = tB_Page.currentAddressField("Armenia Yerevan");
        String perm_add = tB_Page.permanentAddressField("Armenia Yerevan Halabyan");
        tB_Page.clickOnSubmitButton();
        Assert.assertEquals("Name:"+full_Name+'\n'+"Email:"+email+'\n'+"Current Address :"+current_add+'\n'+"Permananet Address :"+perm_add,driver.findElement(By.id("output")).getText());
        Thread.sleep(2000); //just for us

    }
}

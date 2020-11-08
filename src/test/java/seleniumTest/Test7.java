package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test7 extends Test1 {
    @Test
    public void checkName() {
        WebElement inputForm = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForm.click();
        WebElement ajaxFormSubmit = driver.findElement(By.xpath("//ul[@id='treemenu']//ul//a[text()='Ajax Form Submit']"));
        ajaxFormSubmit.click();
        WebElement submitButton = driver.findElement(By.xpath("//input[@id='btn-submit']"));
        submitButton.click();
        String fieldName = driver.findElement(By.xpath("//input[@id='title']")).getAttribute("style");
        Assert.assertEquals("border: 1px solid rgb(255, 0, 0);", fieldName);
    }


}

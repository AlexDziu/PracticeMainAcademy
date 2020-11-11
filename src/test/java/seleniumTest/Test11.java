package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test11 extends Driver {
    @Test
    public void test11() {
        driver.findElement(By.xpath("//a[text()='Alerts & Modals']")).click();
        driver.findElement(By.xpath("//li[@style]/a[text()='Javascript Alerts']")).click();
        driver.findElement(By.xpath("//div[text()='Java Script Confirm Box']/../div/button")).click();
        driver.switchTo().alert().dismiss();
        String actualText = driver.findElement(By.cssSelector("#confirm-demo")).getText();
        String expectedText = "You pressed Cancel!";
        Assert.assertEquals(expectedText,actualText);
    }
}

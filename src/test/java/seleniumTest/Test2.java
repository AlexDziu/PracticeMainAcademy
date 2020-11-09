package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2 extends Test1 {
    @Test
    public void checkTotalNumbers() {
        WebElement inputForm = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForm.click();
        WebElement simpleFormDemo = driver.findElement(By.xpath("//*[@id='treemenu']//a[text()='Simple Form Demo']"));
        simpleFormDemo.click();
        WebElement enterA = driver.findElement(By.xpath("//form[@id='gettotal']//input[@id='sum1']"));
        enterA.sendKeys("2");
        WebElement enterB = driver.findElement(By.xpath("//form[@id='gettotal']//input[@id='sum2']"));
        enterB.sendKeys(String.valueOf(8));
        WebElement buttonGetTotal = driver.findElement(By.xpath("//form[@id='gettotal']//button[@class='btn btn-default']"));
        buttonGetTotal.click();
        String total = driver.findElement(By.xpath("//*[@id='displayvalue']")).getText();
        int totalResult = Integer.parseInt(total);
        Assert.assertEquals(10, totalResult);
        //fix
    }
}

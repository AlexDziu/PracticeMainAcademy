package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test5 extends Test1 {
    @Test
    public void checkDaySelected() {
        WebElement inputForm = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForm.click();
        WebElement selectDropDownList = driver.findElement(By.xpath("//div[@id='easycont']//a[text()='Select Dropdown List']"));
        selectDropDownList.click();
        WebElement selectListDemo = driver.findElement(By.xpath("//select[@id='select-demo']"));
        selectListDemo.click();
        WebElement selectFriday = driver.findElement(By.xpath("//select[@id='select-demo']//option[@value='Friday']"));
        selectFriday.click();
        String daySelected = driver.findElement(By.xpath("//p[@class='selected-value']")).getText();
        Assert.assertEquals("Day selected :- Friday", daySelected);
    }
}

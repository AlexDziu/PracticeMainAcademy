package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test8 extends Driver {
    @Test
    public void checkDay() {
        WebElement dataPickers = driver.findElement(By.xpath("//a[text()='Date pickers']"));
        dataPickers.click();
        WebElement bootstrapDataPicker = driver.findElement(By.xpath("//div[@class='container-fluid text-center']//a[text()='Bootstrap Date Picker']"));
        bootstrapDataPicker.click();
        WebElement dataExampleSelectDay = driver.findElement(By.xpath("//div[@id='sandbox-container1']//input[@class='form-control']"));
        dataExampleSelectDay.click();
        WebElement selectDay = driver.findElement(By.xpath("//div[@class='datepicker-days']//td[@class='day'][6]"));
        selectDay.click();
        String selectDayField = driver.findElement(By.xpath("//div[@class='input-group date']//input[@type='text']")).getAttribute("value");
        Assert.assertEquals("07/11/2020",selectDayField);
        //joda time + pom  minus() 07/11/2020
    }
}

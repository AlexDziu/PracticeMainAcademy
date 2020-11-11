package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test8 extends Driver {
    @Test
    public void checkDay() {
        WebElement dataPickers = driver.findElement(By.xpath("//a[text()='Date pickers']"));
        dataPickers.click();
        WebElement bootstrapDataPicker = driver.findElement(By.xpath("//div[@class='container-fluid text-center']//a[text()='Bootstrap Date Picker']"));
        bootstrapDataPicker.click();
        WebElement dataExampleSelectDay = driver.findElement(By.xpath("//div[@id='sandbox-container1']//input[@class='form-control']"));
        dataExampleSelectDay.click();
        LocalDate yesterday =LocalDate.now().minusDays(1);
        driver.findElement(By.xpath("//td[text()='"+yesterday.getDayOfMonth()+"' and @class='day']")).click();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String expectedDate = yesterday.format(formatter);
        String selectDayField = driver.findElement(By.xpath("//div[@class='input-group date']//input[@type='text']")).getAttribute("value");
        Assert.assertEquals(expectedDate,selectDayField);
        //joda time + pom  minus() 07/11/2020
    }
}

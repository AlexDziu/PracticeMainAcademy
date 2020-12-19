package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test8 extends Driver {
    private final By dataPickers = By.xpath("//a[text()='Date pickers']");
    private final By bootstrapDataPicker = By.xpath("//div[@class='container-fluid text-center']//a[text()='Bootstrap Date Picker']");
    private final By dataExampleSelectDay = By.xpath("//div[@id='sandbox-container1']//input[@class='form-control']");
    private final By selectDayField = By.xpath("//div[@class='input-group date']//input[@type='text']");

    @Test
    public void checkDay() {
        driver.findElement(dataPickers).click();
        driver.findElement(bootstrapDataPicker).click();
        driver.findElement(dataExampleSelectDay).click();
        LocalDate yesterday = LocalDate.now().minusDays(2);
        driver.findElement(By.xpath("//td[text()='" + yesterday.getDayOfMonth() + "' and @class='day']")).click();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String expectedDate = yesterday.format(formatter);
        String actualDate = driver.findElement(selectDayField).getAttribute("value");
        Assert.assertEquals(expectedDate, actualDate);
    }
}

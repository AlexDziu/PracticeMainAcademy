package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test4 extends Test1 {
    @Test
    public void checkMessageSex() {
        WebElement inputForm = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForm.click();
        WebElement radioButtonsDemo = driver.findElement(By.xpath("//*[@id='treemenu']//a[text()='Radio Buttons Demo']"));
        radioButtonsDemo.click();
        WebElement sexMale = driver.findElement(By.xpath("//div[@class='col-md-6 text-left']//div[2]//div[2]//div//input[@value='Male']"));
        sexMale.click();
        WebElement ageGroup = driver.findElement(By.xpath("//input[@value='15 - 50']"));
        ageGroup.click();
        WebElement getValuesButton = driver.findElement(By.xpath("//*[@onclick='getValues();']"));
        getValuesButton.click();
        String resultMessage = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
        String checkMessage = "Sex : Female Age group: 5 - 15";
        Assert.assertNotEquals(checkMessage,resultMessage);

    }
}

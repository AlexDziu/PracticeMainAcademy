package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test4 extends Driver {
    private By inputForm = By.xpath("//a[text()='Input Forms']");
    private By radioButtonsDemo = By.xpath("//*[@id='treemenu']//a[text()='Radio Buttons Demo']");
    private By sexMale = By.xpath("//div[@class='col-md-6 text-left']//div[2]//div[2]//div//input[@value='Male']");
    private By ageGroup = By.xpath("//input[@value='15 - 50']");
    private By getValuesButton = By.xpath("//*[@onclick='getValues();']");
    private By resultMessage = By.xpath("//p[@class='groupradiobutton']");

    @Test
    public void checkMessageSex() {
        driver.findElement(inputForm).click();
        driver.findElement(radioButtonsDemo).click();
        driver.findElement(sexMale).click();
        driver.findElement(ageGroup).click();
        driver.findElement(getValuesButton).click();
        String expectedResult = "Sex : Female Age group: 5 - 15";
        String actualResult = driver.findElement(resultMessage).getText();
        Assert.assertNotEquals(expectedResult, actualResult);
    }
}

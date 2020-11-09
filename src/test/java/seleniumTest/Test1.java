package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test1 extends Driver {
    private By inputForm = By.xpath("//a[text()='Input Forms']");
    private By simpleFormDemo = By.xpath("//*[@id='treemenu']//a[text()='Simple Form Demo']");
    private By inputElement = By.xpath("//input[@id='user-message']");
    private By buttonShowMassage = By.xpath("//form[@id='get-input']//button[@class='btn btn-default']");
    private By yourMessage = By.xpath("//span[@id='display']");

    @Test
    public void checkYourMessage() {
        driver.findElement(inputForm).click();
        driver.findElement(simpleFormDemo).click();
        String expectedText = "Hello, my name is Sasha";
        driver.findElement(inputElement).sendKeys(expectedText);
        driver.findElement(buttonShowMassage).click();
        String actualResult = driver.findElement(yourMessage).getText();
        Assert.assertEquals(expectedText, actualResult);
    }
}

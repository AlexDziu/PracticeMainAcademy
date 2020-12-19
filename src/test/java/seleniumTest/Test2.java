package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test2 extends Driver {
    private final By inputForm = By.xpath("//a[text()='Input Forms']");
    private final By simpleFormDemo = By.xpath("//*[@id='treemenu']//a[text()='Simple Form Demo']");
    private final By enterA = By.xpath("//form[@id='gettotal']//input[@id='sum1']");
    private final By enterB = By.xpath("//form[@id='gettotal']//input[@id='sum2']");
    private final By buttonGetTotal = By.xpath("//form[@id='gettotal']//button[@class='btn btn-default']");
    private final By totalResult = By.xpath("//*[@id='displayvalue']");

    @Test
    public void checkTotalNumbers() {
        driver.findElement(inputForm).click();
        driver.findElement(simpleFormDemo).click();
        driver.findElement(enterA).sendKeys("2");
        driver.findElement(enterB).sendKeys("8");
        String expectedResult = "10";
        driver.findElement(buttonGetTotal).click();
        String actualResult = driver.findElement(totalResult).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}


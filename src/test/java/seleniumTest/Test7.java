package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test7 extends Driver {
    private By inputForm = By.xpath("//a[text()='Input Forms']");
    private By ajaxFormSubmit = By.xpath("//ul[@id='treemenu']//ul//a[text()='Ajax Form Submit']");
    private By submitButton = By.xpath("//input[@id='btn-submit']");
    private By fieldName = By.xpath("//input[@id='title']");

    @Test
    public void checkName() {
        driver.findElement(inputForm).click();
        driver.findElement(ajaxFormSubmit).click();
        driver.findElement(submitButton).click();
        String expectedResult = driver.findElement(fieldName).getAttribute("style");
        String actualResult = "border: 1px solid rgb(255, 0, 0);";
        Assert.assertEquals(expectedResult, actualResult);
    }
}

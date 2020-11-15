package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test11 extends Driver {
    private By alertModals = By.xpath("//a[text()='Alerts & Modals']");
    private By javaScriptAlerts = By.xpath("//li[@style]/a[text()='Javascript Alerts']");
    private By javaScriptConfirmBoxClickMe = By.xpath("//div[text()='Java Script Confirm Box']/../div/button");
    private By confirmDemo = By.cssSelector("#confirm-demo");

    @Test
    public void test11() {
        driver.findElement(alertModals).click();
        driver.findElement(javaScriptAlerts).click();
        driver.findElement(javaScriptConfirmBoxClickMe).click();
        driver.switchTo().alert().dismiss();
        String actualText = driver.findElement(confirmDemo).getText();
        String expectedText = "You pressed Cancel!";
        Assert.assertEquals(expectedText, actualText);
    }
}

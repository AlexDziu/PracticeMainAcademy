package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test15 extends Driver {
    private final By others = By.xpath("//a[text()='Others']");
    private final By dynamicDataLoading = By.xpath("//li[@style]/a[text()='Dynamic Data Loading']");
    private final By buttonGetNewUser = By.id("save");
    private final By userAppear = By.cssSelector("#loading");
    private final By userImage = By.cssSelector("img");

    @Test
    public void checkNamesIsNotEmpty() {
        driver.findElement(others).click();
        driver.findElement(dynamicDataLoading).click();
        driver.findElement(buttonGetNewUser).click();
        WebElement userWebElement = driver.findElement(userAppear);
        String imageSource = userWebElement.findElement(userImage).getAttribute("src");
        Assert.assertNotNull(imageSource);
        String firstName = userWebElement.getText();
        String lastName = userWebElement.getText();
        Assert.assertNotNull(firstName);
        Assert.assertNotNull(lastName);
    }
}

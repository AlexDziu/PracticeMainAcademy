package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test15 extends Driver {
    private By others = By.xpath("//a[text()='Others']");
    private By dynamicDataLoading = By.xpath("//li[@style]/a[text()='Dynamic Data Loading']");
    private By buttonGetNewUser = By.id("save");
    private By userAppear = By.cssSelector("#loading");
    private By userImage = By.cssSelector("img");

    @Test
    public void test15() {
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

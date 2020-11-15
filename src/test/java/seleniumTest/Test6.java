package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Test6 extends Driver {
    private By inputForm = By.xpath("//a[text()='Input Forms']");
    private By selectDropDownList = By.xpath("//div[@id='easycont']//a[text()='Select Dropdown List']");
    private By selectNewYork = By.xpath("//select[@name='States']//option[@value='New York']");
    private By selectFlorida = By.xpath("//select[@name='States']//option[@value='Florida']");
    private By getAllSelected = By.xpath("//button[@id='printAll']");
    private By optionsSelectedAre = By.xpath("//p[@class='getall-selected']");

    @Test
    public void checkText() {
        driver.findElement(inputForm).click();
        driver.findElement(selectDropDownList).click();
        String expectedText = "Options selected are : " +driver.findElement(selectNewYork).getText()+ "," +driver.findElement(selectFlorida).getText();
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(driver.findElement(selectNewYork)).build().perform();
        action.keyDown(Keys.CONTROL).click(driver.findElement(selectFlorida)).build().perform();
        driver.findElement(getAllSelected).click();
        String actualText = driver.findElement(optionsSelectedAre).getText();
        Assert.assertEquals(expectedText, actualText);
    }
}

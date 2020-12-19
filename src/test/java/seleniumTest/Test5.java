package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test5 extends Driver {
    private final By inputForm = By.xpath("//a[text()='Input Forms']");
    private final By selectDropDownList = By.xpath("//div[@id='easycont']//a[text()='Select Dropdown List']");
    private final By selectListDemo = By.xpath("//select[@id='select-demo']");
    private final By selectFriday = By.xpath("//select[@id='select-demo']//option[@value='Friday']");
    private final By daySelected = By.xpath("//p[@class='selected-value']");

    @Test
    public void checkDaySelected() {
        driver.findElement(inputForm).click();
        driver.findElement(selectDropDownList).click();
        driver.findElement(selectListDemo).click();
        driver.findElement(selectFriday).click();
        String expectedResult = "Day selected :- Friday";
        String actualResult = driver.findElement(daySelected).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}

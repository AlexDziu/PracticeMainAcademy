package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test5 extends Test1 {
    private By inputForm = By.xpath("//a[text()='Input Forms']");
    private By selectDropDownList = By.xpath("//div[@id='easycont']//a[text()='Select Dropdown List']");
    private By selectListDemo = By.xpath("//select[@id='select-demo']");
    private By selectFriday = By.xpath("//select[@id='select-demo']//option[@value='Friday']");
    private By daySelected = By.xpath("//p[@class='selected-value']");

    @Test
    public void checkDaySelected() {
        driver.findElement(inputForm).click();
        driver.findElement(selectDropDownList).click();
        driver.findElement(selectListDemo).click();;
        driver.findElement(selectFriday).click();
        String expectedResult = "Day selected :- Friday";
        String actualResult = driver.findElement(daySelected).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}

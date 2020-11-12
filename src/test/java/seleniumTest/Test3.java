package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test3 extends Driver {
    private By inputForm = By.xpath("//a[text()='Input Forms']");
    private By checkboxDemo = By.xpath("//div[@id='easycont']//a[text()='Checkbox Demo']");
    private By option1 = By.xpath("//label[text()='Option 1']");
    private By option3 = By.xpath("//label[text()='Option 3']");

    @Test
    public void checkedCheckbox() {
        driver.findElement(inputForm).click();
        driver.findElement(checkboxDemo).click();
        driver.findElement(option1).click();
        driver.findElement(option3).click();
        boolean actualResult =  driver.findElement(option1).findElement(By.cssSelector("input")).isSelected();
        boolean actualResult2 = driver.findElement(option3).findElement(By.cssSelector("input")).isSelected();
        Assert.assertTrue(actualResult);
        Assert.assertTrue(actualResult2);
    }
}

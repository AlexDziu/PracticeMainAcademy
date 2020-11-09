package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;

public class Test10 extends Driver {
    private By table = By.xpath("//li[@class='tree-branch'][3]");
    private By tableFilter = By.xpath("//ul[@id='treemenu']//a[text()='Table Filter ']");
    private By orangeButton = By.xpath("//button[@class='btn btn-warning btn-filter']");
    private By orange1 = By.xpath("//*/tbody/tr[2]/td[3]/div/div/h4/span");
    private By orange2 = By.xpath("//*/tbody/tr[5]/td[3]/div/div/h4/span");

    @Test
    public void checkOrangeSmile() {
        driver.findElement(table).click();
        driver.findElement(tableFilter).click();
        driver.findElement(orangeButton).click();
        String expectedColor = "#f0ad4e";
        String color = driver.findElement(orange1).getCssValue("color");
        String color2 = driver.findElement(orange2).getCssValue("color");
        String hexColor = Color.fromString(color).asHex();
        String hexColor2 = Color.fromString(color2).asHex();
        Assert.assertEquals(expectedColor, hexColor);
        Assert.assertEquals(expectedColor, hexColor2);
    }
}

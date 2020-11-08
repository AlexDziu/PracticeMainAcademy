package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class Test10 extends Test1 {
    @Test
    public void checkOrangeSmile() {
        WebElement table = driver.findElement(By.xpath("//li[@class='tree-branch'][3]"));
        table.click();
        WebElement tableFilter = driver.findElement(By.xpath("//ul[@id='treemenu']//a[text()='Table Filter ']"));
        tableFilter.click();
        WebElement orangeButton = driver.findElement(By.xpath("//button[@class='btn btn-warning btn-filter']"));
        orangeButton.click();
        String expectedColor = "#f0ad4e";
        String orange1 = driver.findElement(By.xpath("//*/tbody/tr[2]/td[3]/div/div/h4/span")).getCssValue("color");
        String orange2 = driver.findElement(By.xpath("//*/tbody/tr[5]/td[3]/div/div/h4/span")).getCssValue("color");
        String hexColor = Color.fromString(orange1).asHex();
        String hexColor2 = Color.fromString(orange2).asHex();
        Assert.assertEquals(expectedColor, hexColor);
        Assert.assertEquals(expectedColor, hexColor2);
    }
}

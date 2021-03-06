package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test12 extends Driver {
    private final By listBox = By.xpath("//a[text()='List Box']");
    private final By bootstrapListBox = By.xpath("//li[@style]/a[text()='Bootstrap List Box']");
    private final By selectMorbiLeoRisus = By.xpath("//div[contains(@class,'list-left')]//li[text()='Morbi leo risus']");
    private final By buttonInRight = By.className("move-right");
    private final By listRight = By.xpath("//div[contains(@class,'list-right')]//li[text()='Morbi leo risus']");

    @Test
    public void checkTwoOptions() {
        driver.findElement(listBox).click();
        driver.findElement(bootstrapListBox).click();
        driver.findElement(selectMorbiLeoRisus).click();
        driver.findElement(buttonInRight).click();
        int expectedSize = driver.findElements(listRight).size();
        Assert.assertEquals(2, expectedSize);
    }
}

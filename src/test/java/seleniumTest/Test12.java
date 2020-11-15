package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test12 extends Driver {
    private By listBox = By.xpath("//a[text()='List Box']");
    private By bootstrapListBox = By.xpath("//li[@style]/a[text()='Bootstrap List Box']");
    private By selectMorbiLeoRisus = By.xpath("//div[contains(@class,'list-left')]//li[text()='Morbi leo risus']");
    private By buttonInRight = By.className("move-right");
    private By listRight = By.xpath("//div[contains(@class,'list-right')]//li[text()='Morbi leo risus']");

    @Test
    public void test12() {
        driver.findElement(listBox).click();
        driver.findElement(bootstrapListBox).click();
        driver.findElement(selectMorbiLeoRisus).click();
        driver.findElement(buttonInRight).click();
        int expectedSize = driver.findElements(listRight).size();
        Assert.assertEquals(2, expectedSize);
    }
}

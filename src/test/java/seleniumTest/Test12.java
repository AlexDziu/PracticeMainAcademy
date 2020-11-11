package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test12 extends Driver{

    @Test
    public void test12() {
        driver.findElement(By.xpath("//a[text()='List Box']")).click();
        driver.findElement(By.xpath("//li[@style]/a[text()='Bootstrap List Box']")).click();

        driver.findElement(By.xpath("//div[contains(@class,'list-left')]//li[text()='Morbi leo risus']")).click();
        driver.findElement(By.className("move-right")).click();
        int expectedSize = driver.findElements(By.xpath("//div[contains(@class,'list-right')]//li[text()='Morbi leo risus']")).size();
        Assert.assertEquals(2,expectedSize);
    }
}

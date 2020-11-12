package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test15 extends Driver{

    @Test
    public void test15(){
        driver.findElement(By.xpath("//a[text()='Others']")).click();
        driver.findElement(By.xpath("//li[@style]/a[text()='Dynamic Data Loading']")).click();
        driver.findElement(By.id("save")).click();
        WebElement userWebElement = driver.findElement(By.cssSelector("#loading"));
        String imageSource = userWebElement.findElement(By.cssSelector("img")).getAttribute("src");
        Assert.assertNotNull(imageSource);
        String firstName = userWebElement.getText().split("\n\n")[0].split(": ")[0];
        String lastName = userWebElement.getText().split("\n\n")[1].split(": ")[0];
        Assert.assertNotNull(firstName);
        Assert.assertNotNull(lastName);
    }
}

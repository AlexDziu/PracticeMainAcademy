package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Test6 extends Test1 {



    @Test
    public void checkText() {
        WebElement inputForm = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForm.click();
        WebElement selectDropDownList = driver.findElement(By.xpath("//div[@id='easycont']//a[text()='Select Dropdown List']"));
        selectDropDownList.click();
        WebElement selectNewYork = driver.findElement(By.xpath("//select[@name='States']//option[@value='New York']"));
        WebElement selectFlorida = driver.findElement(By.xpath("//select[@name='States']//option[@value='Florida']"));
        WebElement getAllSelected = driver.findElement(By.xpath("//button[@id='printAll']"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).clickAndHold(selectNewYork).build().perform();
        action.keyDown(Keys.CONTROL).clickAndHold(selectFlorida).build().perform();
        getAllSelected.click();
        String optionsSelectedAre = driver.findElement(By.xpath("//p[@class='getall-selected']")).getText();
        Assert.assertEquals("Options selected are : Florida,New York", optionsSelectedAre);

    }
}
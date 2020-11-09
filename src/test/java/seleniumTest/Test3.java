package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test3 extends Test1 {
    @Test
    public void checkedCheckbox() {
        WebElement inputForm = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForm.click();
        WebElement checkboxDemo = driver.findElement(By.xpath("//div[@id='easycont']//a[text()='Checkbox Demo']"));
        checkboxDemo.click();
        WebElement option1 = driver.findElement(By.xpath("//label[text()='Option 1']"));
        option1.click();
        WebElement option3 = driver.findElement(By.xpath("//label[text()='Option 3']"));
        option3.click();
        Assert.assertTrue(option1.isSelected());
        Assert.assertEquals(option1.isSelected(), option3.isSelected());

    }
}

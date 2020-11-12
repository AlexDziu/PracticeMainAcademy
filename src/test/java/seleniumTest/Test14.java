package seleniumTest;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.util.Arrays;
import java.util.List;

public class Test14 extends Driver{

    @Test
    public void test14(){
        driver.findElement(By.xpath("//a[text()='List Box']")).click();
        driver.findElement(By.xpath("//li[@style]/a[text()='JQuery List Box']")).click();
        Select select = new Select(driver.findElement(By.cssSelector("select.pickData")));
        List<String> itemsToSelect = Arrays.asList("Alice","Laura","Giovanna");
        itemsToSelect.forEach(select::selectByVisibleText);
        driver.findElement(By.className("pAdd")).click();
        List<String> actualList = Arrays.asList(StringUtils.split(driver.findElement(By.className("pickListResult")).getText(), "\n"));
        Assert.assertEquals(itemsToSelect,actualList);
    }
}

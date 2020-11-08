package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test9 extends Test1 {
    @Test
    public void checkRecordAppears() {
        WebElement table = driver.findElement(By.xpath("//li[@class='tree-branch'][3]"));
        table.click();
        WebElement tableDataSearch = driver.findElement(By.xpath("//div[@class='container-fluid text-center']//a[text()='Table Data Search']"));
        tableDataSearch.click();
        WebElement fieldTasks = driver.findElement(By.xpath("//*[@id='task-table-filter']"));
        fieldTasks.sendKeys("Emily John");
        String actualResult = driver.findElement(By.xpath("//table[@id='task-table']//tbody//tr[4]")).getText();
        Assert.assertEquals("4 Bootstrap 3 Emily John in progress", actualResult);

    }
}

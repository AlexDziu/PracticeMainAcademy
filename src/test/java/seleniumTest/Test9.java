package seleniumTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Test9 extends Driver {
    private By table = By.xpath("//li[@class='tree-branch'][3]");
    private By tableDataSearch = By.xpath("//div[@class='container-fluid text-center']//a[text()='Table Data Search']");
    private By fieldTasks = By.xpath("//*[@id='task-table-filter']");
    private By column1 = By.xpath("//table[@id='task-table']//tbody//tr[4]/td[1]");
    private By column2 = By.xpath("//table[@id='task-table']//tbody//tr[4]/td[2]");
    private By column3 = By.xpath("//table[@id='task-table']//tbody//tr[4]/td[3]");
    private By column4 = By.xpath("//table[@id='task-table']//tbody//tr[4]/td[4]");

    @Test
    public void checkRecordAppears() {
        driver.findElement(table).click();
        driver.findElement(tableDataSearch).click();
        driver.findElement(fieldTasks).sendKeys("Emily John");
        String actualText1 = driver.findElement(column1).getText();
        String expectedText1 = "4";
        String actualText2 = driver.findElement(column2).getText();
        String expectedText2 = "Bootstrap 3";
        String actualText3 = driver.findElement(column3).getText();
        String expectedText3 = "Emily John";
        String actualText4 = driver.findElement(column4).getText();
        String expectedText4 = "in progress";
        Assert.assertEquals(expectedText1, actualText1);
        Assert.assertEquals(expectedText2, actualText2);
        Assert.assertEquals(expectedText3, actualText3);
        Assert.assertEquals(expectedText4, actualText4);
    }
}

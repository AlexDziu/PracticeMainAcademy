package seleniumTest;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class Test14 extends Driver {
    private By listBox = By.xpath("//a[text()='List Box']");
    private By jqueryListBox = By.xpath("//li[@style]/a[text()='JQuery List Box']");
    private By selectPickData = By.cssSelector("select.pickData");
    private By buttonAdd = By.className("pAdd");
    private By listResult = By.className("pickListResult");

    @Test
    public void test14() {
        driver.findElement(listBox).click();
        driver.findElement(jqueryListBox).click();
        Select select = new Select(driver.findElement(selectPickData));
        List<String> itemsToSelect = Arrays.asList("Alice", "Laura", "Giovanna");
        itemsToSelect.forEach(select::selectByVisibleText);
        driver.findElement(buttonAdd).click();
        List<String> actualList = Arrays.asList(StringUtils.split(driver.findElement(listResult).getText(), "\n"));
        Assert.assertEquals(itemsToSelect, actualList);
    }
}

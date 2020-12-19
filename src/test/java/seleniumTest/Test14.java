package seleniumTest;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class Test14 extends Driver {
    private final By listBox = By.xpath("//a[text()='List Box']");
    private final By jqueryListBox = By.xpath("//li[@style]/a[text()='JQuery List Box']");
    private final By selectPickData = By.cssSelector("select.pickData");
    private final By buttonAdd = By.className("pAdd");
    private final By listResult = By.className("pickListResult");

    @Test
    public void checkText() {
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

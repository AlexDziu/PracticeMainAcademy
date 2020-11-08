package seleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
    WebDriver driver;
    @Before
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='at-cv-lightbox-close']"))).click();
    }

    @Test
    public void checkYourMessage() {
        WebElement inputForm = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForm.click();
        WebElement simpleFormDemo = driver.findElement(By.xpath("//*[@id='treemenu']//a[text()='Simple Form Demo']"));
        simpleFormDemo.click();
        WebElement inputElement = driver.findElement(By.xpath("//input[@id='user-message']"));
        inputElement.sendKeys("Hello, my name is Sasha");
        WebElement buttonShowMassage = driver.findElement(By.xpath("//form[@id='get-input']//button[@class='btn btn-default']"));
        buttonShowMassage.click();
        String yourMessage = driver.findElement(By.xpath("//div[@id='user-message']//span[@id='display']")).getText();
        Assert.assertEquals("Hello, my name is Sasha", yourMessage);
    }

    @After
    public void afterTest() {
        driver.quit();
    }

}

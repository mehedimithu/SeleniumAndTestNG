package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertExample {
    WebDriver driver;
    String uri = "https://opensource-demo.orangehrmlive.com";

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/mehedisumi/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get(uri);
    }

    @Test
    void logoTest() {
        WebElement logo = driver.findElement(By.id("divLogo"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not available ");
    }

    @Test
    void getPageTitle() {
        String text = driver.getTitle();
      Assert.assertEquals("OrangeHRM", text);
    }

    @AfterTest
    void tearDown(){
        if(null != driver){
            driver.close();
        }
    }
}

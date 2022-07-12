package parameterexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    public void setUp(String browser, String appUri) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/mehedisumi/Downloads/chromedriver");
            driver = new ChromeDriver();

        } else {
            System.out.println("Error!");
        }
        driver.get(appUri);
        driver.manage().window().maximize();

    }

    @Test(priority = 1)
    void logoTest() {
        WebElement logo = driver.findElement(By.id("divLogo"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not available ");
    }

    @Test(priority = 2)
    void getPageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", title, "Title is not matched");
    }

    @AfterTest
    void tearDown() {
        if (null != driver) {
            driver.close();
        }
    }
}

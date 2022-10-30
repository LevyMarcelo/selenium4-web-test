package br.com.selenium.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {

    protected WebDriver driver;

    @Parameters({"browser"})
    @BeforeClass
    public void setup(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            chromeDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            safariDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            firefoxdriver();
        } else {
            chromeDriverHeadless();
        }
        driver.manage().window().maximize();
        driver.get("https://www.google.com.br/");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    private void chromeDriver() {
        driver = WebDriverManager.chromedriver().create();
    }

    private void safariDriver() {
        driver = WebDriverManager.safaridriver().create();
    }

    private void firefoxdriver() {
        driver = WebDriverManager.firefoxdriver().create();
    }

    private void chromeDriverHeadless() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
    }
}

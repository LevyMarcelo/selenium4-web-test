package br.com.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Utils {

    private WebDriver driver;
    private WebDriverWait wait;

    public Utils(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void waitForElement(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void write(By element, String value) {
        waitForElement(element);
        driver.findElement(element).sendKeys(value);
    }

    public void click(By element) {
        waitForElement(element);
        driver.findElement(element).click();
    }

    public String getText(By element) {
        waitForElement(element);
        return driver.findElement(element).getText();
    }
}

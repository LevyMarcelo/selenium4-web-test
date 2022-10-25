package br.com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import br.com.selenium.utils.Utils;

public class SearchGooglePage extends Utils {

    private By searchField = By.name("q");
    private By searchButton = By.name("btnK");
    private By linkText = By.cssSelector("div#rso div > div > div > div > div > div.Z26q7c.UK95Uc.jGGQ5e > div > a > h3");

    public SearchGooglePage(WebDriver driver) {
        super(driver);
    }

    public void fillSearchField(String value) {
        write(searchField, value);
    }

    public void clickSearchButton() {
        click(searchButton);
    }

    public String getLinkText() {
        return getText(linkText);
    }
}

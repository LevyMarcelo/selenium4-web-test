package br.com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import br.com.selenium.utils.Utils;

public class SearchGooglePage extends Utils {

    private By searchField = By.name("q");
    private By searchButton = By.name("btnK");
    private By linkText = By.cssSelector("h3.LC20lb.MBeuO.DKV0Md");

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

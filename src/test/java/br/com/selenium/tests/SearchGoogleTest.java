package br.com.selenium.tests;

import org.testng.annotations.Test;
import br.com.selenium.pages.SearchGooglePage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SearchGoogleTest extends BaseTest {

    @Test
    public void searchGoogleTest() {
        SearchGooglePage searchGooglePage = new SearchGooglePage(driver);
        searchGooglePage.fillSearchField("Selenium");
        searchGooglePage.clickSearchButton();
        assertThat(searchGooglePage.validateSearchGoogle(), is("Downloads - Selenium.dev"));
    }
}

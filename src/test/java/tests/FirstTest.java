package tests;

import base.BaseTest;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public  void verifyTitle(){
        page.navigate("https://playwright.dev/java/");
        String pageTitle = page.title();

        if (pageTitle.equalsIgnoreCase("Fast and reliable end-to-end testing for modern web apps | Playwright Java"))
            System.out.println("Passed - pageTitle: " + pageTitle);
        else
            System.out.println("Failed - pageTitle: "+ pageTitle);
    }
}

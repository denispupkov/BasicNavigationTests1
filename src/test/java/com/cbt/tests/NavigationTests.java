package com.cbt.tests;
import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;


public class NavigationTests {

    public static void main(String[] args) throws Exception {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com");
        String googleTitle = driver.getTitle();
        System.out.println("googleTitle = " + googleTitle);
        Thread.sleep(3000);
        driver.get("https://etsy.com");
        String etsyTitle = driver.getTitle();
        System.out.println("etsyTitle = " + etsyTitle);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        if (driver.getTitle().equalsIgnoreCase(googleTitle)) {
            System.out.println("Google Titles are equal");
        } else {
            System.out.println("Google Titles aren't equal");
        }
        driver.navigate().forward();
        Thread.sleep(3000);
        if (driver.getTitle().equalsIgnoreCase(etsyTitle)) {
            System.out.println("ETSY Titles are equal");
        } else {
            System.out.println("ETSY Titles aren't equal");

        }
        driver.close();

    }
}

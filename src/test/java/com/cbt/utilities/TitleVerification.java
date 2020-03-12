package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        driver.get(urls.get(0));
        String title1 = driver.getTitle();
        Thread.sleep(5000);
        driver.get(urls.get(1));
        String title2 = driver.getTitle();
        Thread.sleep(5000);
        driver.get(urls.get(2));
        String title3 = driver.getTitle();

        if (title1.equalsIgnoreCase(title2) && title2.equalsIgnoreCase(title3)) {
            System.out.println("Test Passed");
        }
else {
            System.out.println("Test Failed");
        }

    }
}

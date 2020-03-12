package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) throws InterruptedException {


            WebDriver driver = BrowserFactory.getDriver("chrome");
            List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                    "https://wayfair.com/", "https://walmart.com", "http://westelm.com/");



            for (int i = 0; i < urls.size(); i++) {

                driver.get(urls.get(i));

                String url = driver.getCurrentUrl().toLowerCase();
                String title = driver.getTitle().toLowerCase().replace(" ", "");
                if (url.contains(title)) {
                    System.out.println("Test Passed for the Website: "+url);
                } else {
                    System.out.println("Test Failed for the Website: "+url);
                }

                Thread.sleep(5000);
                driver.close();

                driver = BrowserFactory.getDriver("chrome");


            }
driver.close();
        }
    }








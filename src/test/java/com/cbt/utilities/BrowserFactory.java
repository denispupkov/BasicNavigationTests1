package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

   public static WebDriver getDriver (String arg) {


       String osVersion = System.getProperty("os.name");

   if (osVersion.contains("Windows") && arg.equalsIgnoreCase("safari")) {
       return null;
     }
   else if (osVersion.contains("Mac") && arg.equalsIgnoreCase("edge")) {
       return null;
   }

   else if (arg.equalsIgnoreCase("firefox")) {
       WebDriverManager.firefoxdriver().setup();
       WebDriver driverFirefox = new FirefoxDriver();
       return driverFirefox;
   }
   else if (arg.equalsIgnoreCase("edge")) {
       WebDriverManager.edgedriver().setup();
       System.setProperty("webdriver.edge.driver",
               "C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
       WebDriver driverEdge = new EdgeDriver();
       return driverEdge;
   }
   else {
       WebDriverManager.chromedriver().version("79").setup();
       WebDriver driver = new ChromeDriver();
       return driver;
   }
   }

}

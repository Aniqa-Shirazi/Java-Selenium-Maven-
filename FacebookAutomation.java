/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloselenium;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/**
 *
 * @author Dell
 */
public class FacebookAutomation {
    
     private WebDriver driver;

  //This method is used to setup drivers and settings for chrome
  public void setUp() throws IOException {
     
      
   
      System.setProperty("webdriver.chrome.driver","chromedriver_win32_11//chromedriver.exe" );
      ChromeOptions op = new ChromeOptions();
      //disable notification parameter
      op.addArguments("--disable-notifications");
      // configure options parameter to Chrome driver
     driver = new ChromeDriver(op);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);    
  }
  

}
package com.mishra.Sample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest
{
    @Test
    public void do_RD()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\baradam\\BaradaPrasadMishra\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");

        System.out.println("The Title of the page is : "+driver.getTitle());
        driver.navigate().to("https://www.gmail.com");
        System.out.println("The Title of the page is : "+driver.getTitle());

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("alert('The Test case run sucessfully')");

        driver.switchTo().alert().accept();
        System.out.println("Now i close the browser");

        driver.close();
   System.out.println("now i finish my test");
    }
}
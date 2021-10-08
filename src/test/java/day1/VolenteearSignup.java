package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class VolenteearSignup {
    public static void main(String args[]) {
      //  System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");//
      //  WebDriver driver=new ChromeDriver();//

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://signup.com/");
        String title = driver.getTitle();
        System.out.println("title of the page:" + title);
        String url = driver.getCurrentUrl();
        System.out.println("url og the page:" + url);
        System.out.println(driver.getPageSource());
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("mouni");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("sontela");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hdji@.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("haghduh");


    }
}






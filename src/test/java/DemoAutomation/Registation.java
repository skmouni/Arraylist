package DemoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Registation {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("mouni");
        driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("sontela");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress'] ")).sendKeys("atp");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mouni@987");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("949570695");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
        driver.findElement(By.xpath("//div[@id='msdd']")).click();
        List<WebElement> lang = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
        for(int i=0; i<lang.size();i++){
            if(lang.get(i).getText().equalsIgnoreCase("English")){
                lang.get(i).click();
            }
        }
        driver.findElement(By.xpath("//input[@value='FeMale']")).click();
        driver.findElement(By.xpath("(//select[@ng-model='Skill'])")).sendKeys("css");
        driver.findElement(By.xpath("//select[@id='countries']")).sendKeys("india");
        driver.findElement(By.xpath("//span[@id='select2-country-container']/..")).click();
        driver.findElement(By.className("select2-search__field")).sendKeys("i");
        List<WebElement> cont = driver.findElements(By.xpath("//li[@class='select2-results__option']"));
        for(int i=0; i<cont.size();i++){
            if(cont.get(i).getText().equalsIgnoreCase("India")){
                cont.get(i).click();
                break;
            }
        }
        Select year=new Select(driver.findElement(By.xpath("//select[@ng-model='yearbox']")));
        year.selectByValue("1998");
        Select month=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
        month.selectByVisibleText("October");
        Select date=new Select(driver.findElement(By.id("daybox")));
        date.selectByIndex(30);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("7576769");
        driver.findElement(By.xpath("(//input[@id='secondpassword'])")).sendKeys("manisha34");
        driver.findElement(By.xpath("(//button[@type='submit'])")).click();
        driver.findElement(By.xpath("//button[@value='Refresh']")).click();


    }
}

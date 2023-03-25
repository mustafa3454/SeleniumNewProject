package day02_Sali_DriverMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
public class C03_WebelementLocators {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //Search box bölümünü locate ediniz
        //driver.findElement(By.id("twotabsearchtextbox"));
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        //NOT : Eğer bir webelementi birden fazla kullanılacaksa bir webelement e atama yapılabilir
        searchBox.sendKeys("iphone");//Locate ettiğimiz searchBox'a iphone metnini gönderir
        //ve amazonda iphone aratınız
    }
}

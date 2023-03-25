package Pratice.DT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03 {
    public static void main(String[] args) throws InterruptedException {



            System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

            // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
            driver.get("https://testpages.herokuapp.com/styled/calculator");

            // ilk kutucuga 20 giriniz
            WebElement birinci= driver.findElement(By.id("number1"));
            birinci.sendKeys("20", Keys.ENTER);

            // ikinci kutucuga 30 giriniz
            WebElement ikinci= driver.findElement(By.id("number2"));
            ikinci.sendKeys("30", Keys.ENTER);

            // calculate'e tıklayınız
         //   WebElement calcu= driver.findElement(By.id("calculate"));
         //   calcu.click();

            // sonucu yazdırınızdriver.findElement(By.id("calculate")).click();

            // sayfayi kapatiniz
          //  driver.close();
        }
    }
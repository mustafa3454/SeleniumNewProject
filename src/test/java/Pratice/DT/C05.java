package Pratice.DT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C05 {
    public static void main(String[] args) {

   System.setProperty("webdriver.chrome.drriver","src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz

       driver.manage().window().maximize();
        System.out.println(driver.manage().window().getPosition());// konumun

        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz

       driver.manage().window().fullscreen();

        System.out.println("fullscreen pencere olcusu:"+driver.manage().window().getPosition());

        System.out.println("fullscreen pencer olcusu:"+driver.manage().window().getSize());


        // sayfayi kapatiniz

   driver.close();

    }
}

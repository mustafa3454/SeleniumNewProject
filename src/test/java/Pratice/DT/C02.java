package Pratice.DT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
public class C02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();

        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        Thread.sleep(2000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String titleTeknosa=driver.getTitle();
        String urlTeknosa=driver.getCurrentUrl();
        System.out.println("Teknosa Title ="+titleTeknosa);
        System.out.println("Teknosa URL ="+urlTeknosa);

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (titleTeknosa.contains("Teknoloji")){
            System.out.println("Title 'Teknoloji içeriyor");
        }else System.out.println("Title 'Teknoloji içermiyor");

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (urlTeknosa.contains("teknosa")){
            System.out.println("URL 'teknosa' içeriyor");
        }else System.out.println("URL 'teknosa' içermiyor");
        System.out.println();
        System.out.println();

        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");
        Thread.sleep(2000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String titleMedunna=driver.getTitle();
        String urlMedunna=driver.getCurrentUrl();

        System.out.println("Medunna Title ="+titleMedunna);

        System.out.println("Medunna URL ="+urlMedunna);


        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.

        if (titleMedunna.contains("MEDUNNA")){
            System.out.println("Title 'MEDUNNA' içeriyor");
        }else {
            System.out.println("Title 'MEDUNNA' içermiyor");
        }


        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz

        if (urlMedunna.contains("medunna")){

            System.out.println("MEDUNNA URL 'medunna' içeriyor");

        }else System.out.println("MEDUNNA URL 'medunna' içermiyor");



        // teknosa adresine geri donunuz
        driver.navigate().back();// back geri donme
        Thread.sleep(2000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2000);
        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(2000);
        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2000);
        // pencereyi kapat
        driver.close();
    }
}

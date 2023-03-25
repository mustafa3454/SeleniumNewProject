package day04_XpathCssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
import java.util.List;
public class C01_Xpath {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://amazon.com");



        //Search(ara) “city bike”
        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
        placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
        aria-label="Search Amazon" spellcheck="false">
        XPATH SYNTAX;
                    //tag_name[@attributeName='atributeDeğeri']
                    //input[@id='twotabsearchtextbox']
         */
        WebElement aramakutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramakutusu.sendKeys("city bike");
        aramakutusu.submit();
        //Hybrid Bikes bölümüne tıklayın
        /*
        (//*[@class='a-size-base a-color-base'])[11] --> Bu şekilde index kullanarak uniqe olarak WE ulaşabiliriz
        //*[text()='Hybrid Bikes'] --> xpath ile locate alırken html kodlarında attribute name olmayan <tagname class=değeri>text()
        metin varsa bu şekilde locate edebiliriz
         */
        /*
        <span class="a-size-base a-color-base">hybrid bike</span>
         */
        driver.findElement(By.xpath("//*[text()='Hybrid Bikes']")).click();
        //Sadece sonuc sayısını yazdıralım
        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
    }
}












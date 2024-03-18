package US307_308_309;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class US307_308_309 extends BaseDriver {

    @Test
    public void US307_308(){

        driver.get("https://shopdemo.e-junkie.com/"); //Website sayfası açıldı.
        MyFunc.Bekle(2);

        WebElement link1=driver.findElement(By.linkText("E-commerce by E-junkie"));// En alt sağ köşedeki link tıklandı.
        link1.click();

        WebElement link2= driver.findElement(By.linkText("GET IT NOW"));// Açılan alertten kurtulmak için login yapıldı.
        link2.click();

        WebElement link3=driver.findElement(By.xpath("//button[contains(text(), 'Have an account? Sign In')]"));
        link3.click();// hesaba giriş yapmak istiyorum seçildi

        WebElement email=driver.findElement(By.name("username"));
        email.sendKeys("elcnburak@gmail.com");// email adres bilgisi gönderildi

        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("Haziran4052**");// email şifre gönderildi

        WebElement buton=driver.findElement(By.xpath("//button[@class='all_btn']"));
        buton.click();// buton tıklandı

        WebElement LogoLink = driver.findElement(By.xpath("//a[@href='/']/img[@src='https://www.e-junkie.com/wiki/user/themes/Wiki/images/logo.png']"));
        LogoLink.click();// açılan sayfadan logo linkine tıklandı

        if (driver.getCurrentUrl().contains("https://www.e-junkie.com/")) {// mevcut link karşılaştırılması yapıldı
            System.out.println("Mevcut link doğru.");
        } else {
            System.out.println("Mevcut link doğru değil.");
        }

        WebElement SeeHowItWorks=driver.findElement(By.xpath("//a[contains(@class, 'blue_btn') and contains(@onclick, 'toggleYoutubeModal(true)')]"));
        SeeHowItWorks.click(); // See How It Works yazısına tıklandı.

        Actions driverAksiyon = new Actions(driver);

        for (int i = 0; i < 15; i++) { // 15 defa tab yapmak için döngü konuldu.
            driverAksiyon.sendKeys(Keys.TAB);
        }
        driverAksiyon.sendKeys(Keys.ENTER)
                .build()
                .perform();
        BekleKapat();
    }
    @Test
    public void us308(){
        driver.get("https://shopdemo.e-junkie.com/");
        WebElement addToChart= driver.findElement(By.xpath("//div[@class='basicDetails']/button[@class='view_product']"));
        addToChart.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // Duration kullanarak bekleme süresini belirtin
        WebElement creditCardOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Payment-Options']//button[contains(text(), 'Credit Card')]")));
        creditCardOption.click();


    }

}

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.net.MalformedURLException;


public class iki extends bir{
    public static void main(String[]args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver =capabilities();
        driver.get("https://www.a101.com.tr/");

        MobileElement cookie = driver.findElement(By.xpath("//button[contains(text(),'Kabul Et')]"));
        cookie.click();
        Thread.sleep(2000);
        System.out.println("Çerez Adımı");
        MobileElement menu = driver.findElement(By.xpath("/html/body/section/header/div/div[2]/a[1]/em"));
        menu.click();
        Thread.sleep(2000);
        System.out.println("Menü Adımı");
        MobileElement giyimaksesuar = driver.findElement(By.xpath("/html/body/section/section[2]/div[2]/div[2]/div[2]/ul/li[4]/a"));
        giyimaksesuar.click();
        Thread.sleep(2000);
        System.out.println("Giyim Aksesuar Adımı");
        MobileElement kadinicgiyim = driver.findElement(By.xpath("/html/body/section/section[2]/div[2]/div[2]/div[2]/ul[2]/li[4]/a"));
        kadinicgiyim.click();
        Thread.sleep(2000);
        System.out.println("Kadın İç Giyim Adımı");
        MobileElement dizalticorap = driver.findElement(By.xpath("/html/body/section/section[2]/div[2]/div[2]/div[2]/ul[3]/li[9]/a"));
        dizalticorap.click();
        Thread.sleep(2000);
        System.out.println("Dizaltı Çorap Adımı");
        MobileElement siyahcorap = driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/a/div/header/hgroup/h3"));
        siyahcorap.click();
        Thread.sleep(2000);
        System.out.println("Siyah Çorap Adımı");
        MobileElement sepetekle = driver.findElement(By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button"));
        sepetekle.click();
        Thread.sleep(2000);
        System.out.println("Sepete Ekle Adımı");
        MobileElement sepetigoruntule = driver.findElement(By.xpath("//*[@id=\"js-modal-basket\"]/div[3]/a[3]"));
        sepetigoruntule.click();
        Thread.sleep(2000);
        System.out.println("Sepeti Görüntüle Adımı");
        MobileElement sepetionayla = driver.findElement(By.xpath("//a[contains(text(),'Sepeti Onayla')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", sepetionayla);
        Thread.sleep(2000);
        System.out.println("Sepeti Onayla Adımı");
        MobileElement uyeolmadan = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a"));
        uyeolmadan.click();
        System.out.println("Uye Olmadan Devam Et Adımı");
        MobileElement emailyaz = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input"));
        emailyaz.sendKeys("denemehesap561@gmail.com");
        Thread.sleep(2000);
        System.out.println("Email Yaz Adımı");
        MobileElement devamet = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/button"));
        devamet.click();
        Thread.sleep(2000);
        System.out.println("Devam Et Adımı");
        MobileElement yeniadresolustur = driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a"));
        yeniadresolustur.click();
        Thread.sleep(2000);
        System.out.println("Yeni Adres Olustur Adımı");
        MobileElement adresbaslik = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[2]/div/div/label/input"));
        adresbaslik.sendKeys("Ev");
        Thread.sleep(2000);
        System.out.println("Adres Baslık Adımı");
        MobileElement ad = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[1]/div/label/input"));
        ad.sendKeys("Adım");
        Thread.sleep(2000);
        System.out.println("Kişi Ad Adımı");
        MobileElement soyad = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[2]/div/label/input"));
        soyad.sendKeys("Soyad");
        Thread.sleep(2000);
        System.out.println("Kişi Soyad Adımı");
        MobileElement telefonno = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[4]/div/div/label/input"));
        telefonno.click();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].value = 5377892083;", telefonno);
        Thread.sleep(2000);
        System.out.println("Cep Telefonu Adımı");
        MobileElement ilsec = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[1]/div/label/div/select/option[2]"));
        ilsec.click();
        Thread.sleep(2000);
        System.out.println("İl Sec Adımı");
        MobileElement ilcesec = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[2]/div/label/div/select/option[29]"));
        ilcesec.click();
        Thread.sleep(2000);
        System.out.println("İlce Sec Adımı");
        MobileElement mahallesec = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[6]/label/div/select/option[32]"));
        mahallesec.click();
        Thread.sleep(2000);
        System.out.println("Mahalle Sec Adımı");
        MobileElement adresyaz = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[7]/label/textarea"));
        adresyaz.sendKeys("istanbul artterrterr seeyhli mah");
        Thread.sleep(2000);
        System.out.println("Adres Yaz Adımı");
        MobileElement kaydet = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/button[1]"));
        kaydet.click();
        Thread.sleep(2000);
        System.out.println("Adres Kaydet Adımı");
        MobileElement kaydetvedevamet = driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button"));
        kaydetvedevamet.click();
        Thread.sleep(2000);
        System.out.println("Kaydet ve Devam Et Adımı");
        MobileElement kartadsoyad = driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[1]/label/input"));
        kartadsoyad.sendKeys("Adim Soyadim");
        Thread.sleep(2000);
        System.out.println("Kart AD SOYAD Adımı");
        MobileElement kartno = driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[2]/label/input[1]"));
        kartno.click();
        kartno.sendKeys("123456789101234567");
        Thread.sleep(2000);
        System.out.println("Kart No Adımı");
        MobileElement kartaysec = driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[2]/select/option[2]"));
        kartaysec.click();
        Thread.sleep(2000);
        System.out.println("Kart Ay Sec Adımı");
        MobileElement kartyilsec = driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[3]/select/option[6]"));
        kartyilsec.click();
        Thread.sleep(2000);
        System.out.println("Kart Yıl sec Adımı");
        MobileElement kartcvc = driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[4]/label/input"));
        kartcvc.sendKeys("476");
        Thread.sleep(2000);
        System.out.println("Kart CVC Adımı");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)","");
        Thread.sleep(2000);
        System.out.println("Ekran Aşağı Adımı");
        MobileElement sozlesme = driver.findElement(By.xpath("//*[@id=\"agrement2\"]"));
        executor.executeScript("arguments[0].click();", sozlesme);
        Thread.sleep(2000);
        System.out.println("Sözlesme Adımı");
        MobileElement siparistamam = driver.findElement(By.xpath("//*[@id=\"js-orders-complete-button\"]/button/span[1]/img"));
        executor.executeScript("arguments[0].click();", siparistamam);
        System.out.println("Siparisi Tamamlama Adımı");

    }
}
package Testler;

import Utility.BaseDriverParametr;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US_03_Negatif_Pozitif_Login_Kombinasyonlari  {
    public static WebDriver driver;
    @Test(dataProvider = "UserData",priority = 1)
    @Parameters({"browserTipi"})
    public void loginkombinasyonlari(String username, String password) {

        driver.get("https://demo.nopcommerce.com/");
        MyFunc.Bekle(1);
        WebElement loginLinkButton = driver.findElement(By.xpath("//a[text()='Log in']"));
        loginLinkButton.click();

        WebElement emailInput = driver.findElement(By.xpath("//*[@id='Email']"));
        emailInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='Password']"));
        passwordInput.sendKeys(password);

        WebElement logInButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        logInButton.click();

        WebElement unsuccessfulElement = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String unsuccessfulElementText = unsuccessfulElement.getText();
        MyFunc.Bekle(1);

          SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(unsuccessfulElementText.contains("unsuccessful"),"Basarili giris yapilmistir.");
        MyFunc.Bekle(1);
        // Assert all the conditions
       softAssert.assertAll();

        MyFunc.Bekle(1);
        //

    }
    @DataProvider
    public Object[][] UserData() {
        Object[][] data = {
                {"username1@gmail.com", "pw1"},
                {"username2@gmail.com", "pw2"},
                {"username3@gmail.com", "pw3"},
                {"username4@gmail.com", "pw4"},
                {"username5@gmail.com", "pw5"},
                {"username6@gmail.com", "pw6"},

        };
        return data;
    }
    @Test(priority = 2)
    @Parameters("browserTipi")
    public void LoginLogout() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Ana sayfaya gidin
        driver.get("https://demo.nopcommerce.com/");

        // "Log in" bağlantısını tıklayın
        WebElement loginLinkButton = driver.findElement(By.linkText("Log in"));
        loginLinkButton.click();

        // Kullanıcı adı ve şifre girişi
        WebElement emailInput = driver.findElement(By.id("Email"));
        emailInput.sendKeys("team57@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("Password"));
        passwordInput.sendKeys("techno123");

        // Giriş yap düğmesini tıklayın
        WebElement logInButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        logInButton.click();

        // "Log out" bağlantısının görünürlüğünü kontrol edin
        WebElement logoutLink = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        Assert.assertTrue(logoutLink.isDisplayed(), "Giriş başarısız.");

        // Oturumu kapatın
        logoutLink.click();

        // Oturum kapatma başarılı mı kontrol edin
       // WebElement loginLinkAfterLogout = driver.findElement(By.linkText("Log in"));
        //Assert.assertTrue(loginLinkAfterLogout.isDisplayed(), "Oturum kapatma başarısız.");

        driver.quit();
    }

// bu user story i calistirmadan once us 01 de ki e mail adresi register edilmis olmasi gerekmektedir. sonra bu
    // class i run edersek hata almiyoruz.

//    @Test (priority = 2)
//    @Parameters("browserTipi")
//    public void login() {
//        driver.get("https://demo.nopcommerce.com/");
//        MyFunc.Bekle(1);
//        WebElement loginLinkButton = driver.findElement(By.xpath("//a[text()='Log in']"));
//        loginLinkButton.click();
//
//        WebElement emailInput = driver.findElement(By.xpath("//*[@id='Email']"));
//        emailInput.sendKeys("team17@gmail.com");
//
//        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='Password']"));
//        passwordInput.sendKeys("techno123");
//
//        WebElement logInButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
//        logInButton.click();
//
//        WebElement logout=driver.findElement(By.linkText("Log out"));
//        Assert.assertTrue(logout.isDisplayed(),"Basarisiz giris denemesi.");
//
//        driver.quit();

    }



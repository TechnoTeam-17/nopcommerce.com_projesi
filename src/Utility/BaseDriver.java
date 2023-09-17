package Utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;

    @BeforeClass
    public void baslangicIslemleri() {
        Logger logger = Logger.getLogger(""); // output yapılan logları al.
        logger.setLevel(Level.SEVERE); // sadece ERROR ları göster

        driver = new ChromeDriver(); // jenkins deyken : sen head olmadan yani hafızada çalış
        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

      login(); //her testin baslangicinda login yapilmadigi icin simdilik yoruma alindi

    }

    public void logout() {
        //   WebElement logouta = driver.findElement(By.xpath("//a[@href='/openmrs/appui/header/logout.action?successUrl=openmrs']"));
        //  logouta.click();

    }

    public void login() {
        driver.get("https://demo.nopcommerce.com/");
        MyFunc.Bekle(1);
        WebElement loginLinkButton = driver.findElement(By.xpath("//a[text()='Log in']"));
        loginLinkButton.click();

        WebElement emailInput = driver.findElement(By.xpath("//*[@id='Email']"));
        emailInput.sendKeys("aliveli123@gmail.com");

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='Password']"));
        passwordInput.sendKeys("techno123");

        WebElement logInButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        logInButton.click();



    }

    @AfterClass
    public void bitisIslemleri() { // tearDown

        MyFunc.Bekle(2);
        //driver.quit();
    }

}

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static Utility.BaseDriver.driver;

public class KullanıcıKaydıOluşturma extends BaseDriver {

    @Test
    public void kukkaniciKayidi(){

       driver.get("https://demo.nopcommerce.com/");

       WebElement registrButton=driver.findElement(By.xpath("//class[@hewf='/register?returnUrl=%2F']"));
       registrButton.click();

        WebElement gender=driver.findElement(By.xpath(""));
        gender.click();

        WebElement firsName=driver.findElement(By.xpath(""));
        firsName.sendKeys();

        WebElement lastName=driver.findElement(By.xpath(""));
        registrButton.sendKeys();

        WebElement day=driver.findElement(By.xpath(""));
        day.sendKeys();

        WebElement month=driver.findElement(By.xpath(""));
        month.sendKeys();

        WebElement year=driver.findElement(By.xpath(""));
        year.sendKeys();

        WebElement email=driver.findElement(By.xpath(""));
        email.sendKeys();

        WebElement kaydolButton=driver.findElement(By.xpath(""));
        kaydolButton.click();
    }

    }


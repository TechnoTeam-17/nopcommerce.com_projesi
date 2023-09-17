import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_01_Reg_KullanıcıKaydı_Register_Oluşturma extends BaseDriver {

    @Test
    public void kukkaniciKayidi(){

       driver.get("https://demo.nopcommerce.com/");

       WebElement registrButton=driver.findElement(By.xpath("//a[@class='ico-register']"));
       registrButton.click();
        MyFunc.Bekle(1);

        WebElement gender=driver.findElement(By.id("gender-female"));
        gender.click();

        WebElement firsName=driver.findElement(By.id("FirstName"));
        firsName.sendKeys("Admin");
        MyFunc.Bekle(1);

        WebElement lastName=driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Techno");
        MyFunc.Bekle(1);


        WebElement day=driver.findElement(By.name("DateOfBirthDay"));
        day.sendKeys("1");
        MyFunc.Bekle(1);

        WebElement month=driver.findElement(By.name("DateOfBirthMonth"));
        month.sendKeys("January");
        MyFunc.Bekle(1);

      //JavascriptExecutor js=(JavascriptExecutor) driver;

      //js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // sayfanının sonuna gider.
      //MyFunc.Bekle(2);
      //js.executeScript("window.scrollTo(0, 0);"); // sayfanın en üstüne git.


        WebElement year=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        year.sendKeys("2000");
        MyFunc.Bekle(1);

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("technoadmin@gmail.com"+ Keys.ENTER);
        MyFunc.Bekle(1);

        WebElement password= driver.findElement(By.id("Password"));
        password.sendKeys("techno123");


        WebElement confirmpassword= driver.findElement(By.id("ConfirmPassword"));
        confirmpassword.sendKeys("techno123");

        WebElement kaydolButton=driver.findElement(By.xpath("//button[@id='register-button']"));
        kaydolButton.click();

        WebElement completed = driver.findElement(By.xpath("//div[@class='result']"));
        String complet=completed.getText();
        Assert.assertTrue(complet.contains("logged"));


        MyFunc.Bekle(4);
        driver.quit();



    }

    }


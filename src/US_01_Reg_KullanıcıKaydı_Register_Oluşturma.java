
import Utility.MyFunc;
import Utility.nopElements;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.text.normalizer.Utility;

import static Utility.BaseDriver.wait;

public class US_01_Reg_KullanıcıKaydı_Register_Oluşturma {

  public static WebDriver driver;
  nopElements elements = new nopElements();
  @Test
  public void kullaniciKayidi() {
    driver = new ChromeDriver();
    driver.get("https://demo.nopcommerce.com/");

    elements.registrButton.click();
    elements.gender.click();
    elements.firsName.sendKeys("Admin");
    elements.lastName.sendKeys("Techno");
    elements.day.sendKeys("1");
    elements.month.sendKeys("January");
    elements.year.sendKeys("2000");
    elements.email.sendKeys("technoadmin123@gmail.com" + Keys.ENTER);
    elements.password.sendKeys("techno123");
    elements.confirmpassword.sendKeys("techno123");
    elements.kaydolButton.click();
    elements.completed.getText();

    wait.until(ExpectedConditions.urlContains("success"));


    Assert.assertTrue(elements.msg.equals("Your"));


  }
}



// WebElement registrButton=driver.findElement(By.xpath("//a[@class='ico-register']"));
// registrButton.click();
// MyFunc.Bekle(1);

// WebElement gender=driver.findElement(By.id("gender-female"));
//   gender.click();

//   WebElement firsName=driver.findElement(By.id("FirstName"));
//   firsName.sendKeys("Admin");
//   MyFunc.Bekle(1);

//   WebElement lastName=driver.findElement(By.xpath("//input[@id='LastName']"));
//   lastName.sendKeys("Techno");
//   MyFunc.Bekle(1);


//   WebElement day=driver.findElement(By.name("DateOfBirthDay"));
//   day.sendKeys("1");
//   MyFunc.Bekle(1);

//   WebElement month=driver.findElement(By.name("DateOfBirthMonth"));
//   month.sendKeys("January");
//   MyFunc.Bekle(1);

//   WebElement year=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
//   year.sendKeys("2000");
//   MyFunc.Bekle(1);

//   WebElement email=driver.findElement(By.id("Email"));
//   email.sendKeys("technoadmin123@gmail.com"+ Keys.ENTER);
//   MyFunc.Bekle(1);

//   WebElement password= driver.findElement(By.id("Password"));
//   password.sendKeys("techno123");


//   WebElement confirmpassword= driver.findElement(By.id("ConfirmPassword"));
//   confirmpassword.sendKeys("techno123");

//   WebElement kaydolButton=driver.findElement(By.xpath("//button[@id='register-button']"));
//   kaydolButton.click();

//   WebElement completed = driver.findElement(By.xpath("//div[@class='result']"));
//   String complet=completed.getText();
//   Assert.assertTrue(complet.contains("Your"));


//   MyFunc.Bekle(4);
//   driver.close();



//




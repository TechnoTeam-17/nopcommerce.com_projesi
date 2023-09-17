package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class nopElements {
    public nopElements() {
            PageFactory.initElements(BaseDriver.driver, this);
        }

       // @FindBy(xpath="//a[@class='zak-button']")
       // public WebElement demobuton;
    @FindBy(xpath = "//a[@class='ico-register']")
               public WebElement registrButton;

    @FindBy(id ="gender-female" )
            public WebElement gender;
    @FindBy(id = "FirstName")
            public WebElement   firsName;
    @FindBy(xpath = "//input[@id='LastName']\"")
    public WebElement   lastName;

    @FindBy(name = "DateOfBirthDay")
    public WebElement day  ;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement month;

    //JavascriptExecutor js=(JavascriptExecutor) driver;

    //js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // sayfanının sonuna gider.
    //MyFunc.Bekle(2);
    //js.executeScript("window.scrollTo(0, 0);"); // sayfanın en üstüne git.

    @FindBy(name = "//select[@name='DateOfBirthYear']")
    public WebElement  year;

    @FindBy(id = "Email")
    public WebElement  email;

    @FindBy(id = "Password")
    public WebElement  password;

    @FindBy(id = "ConfirmPassword")
    public WebElement  confirmpassword;

    @FindBy(xpath = "//button[@id='register-button']")
    public WebElement kaydolButton;

    @FindBy(xpath = "//div[@class='result']")
    public WebElement completed;



   // WebElement completed = driver.findElement(By.xpath(""));


    }












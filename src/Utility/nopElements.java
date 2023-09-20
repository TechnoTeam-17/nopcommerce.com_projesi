package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class nopElements {
    public String msg;

    public nopElements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[@class='ico-register']")
    public WebElement registrButton;
    @FindBy(id = "gender-female")
    public WebElement gender;
    @FindBy(id = "FirstName")
    public WebElement firsName;
    @FindBy(xpath = "//input[@id='LastName']")
    public WebElement lastName;
    @FindBy(name = "DateOfBirthDay")
    public WebElement day;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement month;
    @FindBy(name = "//select[@name='DateOfBirthYear']")
    public WebElement year;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(id = "ConfirmPassword")
    public WebElement confirmpassword;
    @FindBy(xpath = "//button[@id='register-button']")
    public WebElement kaydolButton;
    @FindBy(xpath = "//div[@class='result']")
    public WebElement completed;
    @FindBy(xpath = "//form[@id='small-search-box-form']/input")
    public WebElement searchBox;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButton;

     @FindBy(xpath = "//h2[@class='product-title']/a")
    public List<WebElement> searchList;




    //US_02_Login

    //US_03_Negatif_Pozitif_Login_Kombinasyonlari

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLinkButton;
    @FindBy(xpath = "//*[@id='Email']")
    public WebElement emailInput;
    @FindBy(xpath = "//*[@id='Password']")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    public WebElement logInButton;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    public WebElement unsuccessfulElement;

    //US_04_Tab_Menu_Kontrolu
    //US_04_TabMenu02
    //US_05_Hediye_Sipariş_Verme_İşlemi
    //US_06_Bilgisayar_Siparişi_Verme_İşlemi


}












package Testler;

import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class US_05_Hediye_Sipariş_Verme_İşlemi  extends BaseDriver {
    // public static WebDriver driver;

  // @BeforeClass
  // public void setUp() {

        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        //  driver = new ChromeDriver();
        // driver.manage().window().maximize();


    @Test
    public void testGiftSelectionAndAddToCart() {

        driver.get("https://demo.nopcommerce.com/");


        WebElement giftsTab = driver.findElement(By.linkText("Gift Cards"));
        giftsTab.click();

        List<WebElement> physicalGiftCards = driver.findElements(By.xpath(".//a[contains(text(),'Physical')]"));
        physicalGiftCards.get(((int) (Math.random() * physicalGiftCards.size()))).click();


        WebElement recipientName = driver.findElement(By.className("recipient-name"));
        Actions actions = new Actions(driver);
        Action action = actions.
                moveToElement(recipientName).
                click().
                sendKeys("Recipient's name").
                keyDown(Keys.TAB).
                keyUp(Keys.TAB).
                sendKeys("My name").
                keyDown(Keys.TAB).
                keyUp(Keys.TAB).
                sendKeys("My message").
                build();
        action.perform();

        WebElement addToCart = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
        addToCart.click();

        WebElement verificationMessage = driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));

        Assert.assertEquals(verificationMessage.getText(), "The product has been added to your shopping cart");
    }

}



   // WebElement randomGift =  driver.findElement(By.linkText("Computers"));
     //   randomGift.click();

       // WebElement giftCards = driver.findElement(By.xpath("(//ul[@class='top-menu notmobile']/li)[7]"));
      //  giftCards.click();


 //  WebElement addToCartButton = driver.findElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']"));
 //  addToCartButton.click();

    //  WebElement recipientNameErrorMessage = driver.findElement(By.id("recipientNameError"));
    //  WebElement senderNameErrorMessage = driver.findElement(By.id("senderNameError"));

      //  Assert.assertEquals(recipientNameErrorMessage.getText(), "Enter valid recipient name");
      //  Assert.assertEquals(senderNameErrorMessage.getText(), "Enter valid sender name");


   //  WebElement recipientNameInput = driver.findElement(By.id("recipientNameInput"));
   //  WebElement senderNameInput = driver.findElement(By.id("senderNameInput"));
   //  WebElement messageInput = driver.findElement(By.id("messageInput"));

      //recipientNameInput.sendKeys("Random Recipient");
      //senderNameInput.sendKeys("Random Sender");
      //messageInput.sendKeys("Random Message");


        //addToCartButton.click();


      //  WebElement successMessage = driver.findElement(By.id("successMessage"));
      //  Assert.assertEquals(successMessage.getText(), "The product has been added to your shopping cart");


 // @AfterClass
 // public void tearDown() {
 //     if (driver != null) {
 //         driver.quit();



import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class US_05_Hediye_Sipariş_Verme_İşlemi {
    public static WebDriver driver;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testGiftSelectionAndAddToCart() {

        driver.get("https://demo.nopcommerce.com/");


        WebElement giftsTab = driver.findElement(By.linkText("Gift Cards"));
        giftsTab.click();


        WebElement randomGift =  driver.findElement(By.linkText("Computers"));
        randomGift.click();


        WebElement addToCartButton = driver.findElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']"));
        addToCartButton.click();

        WebElement recipientNameErrorMessage = driver.findElement(By.id("recipientNameError"));
        WebElement senderNameErrorMessage = driver.findElement(By.id("senderNameError"));

        Assert.assertEquals(recipientNameErrorMessage.getText(), "Enter valid recipient name");
        Assert.assertEquals(senderNameErrorMessage.getText(), "Enter valid sender name");


        WebElement recipientNameInput = driver.findElement(By.id("recipientNameInput"));
        WebElement senderNameInput = driver.findElement(By.id("senderNameInput"));
        WebElement messageInput = driver.findElement(By.id("messageInput"));

        recipientNameInput.sendKeys("Random Recipient");
        senderNameInput.sendKeys("Random Sender");
        messageInput.sendKeys("Random Message");


        addToCartButton.click();


        WebElement successMessage = driver.findElement(By.id("successMessage"));
        Assert.assertEquals(successMessage.getText(), "The product has been added to your shopping cart");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


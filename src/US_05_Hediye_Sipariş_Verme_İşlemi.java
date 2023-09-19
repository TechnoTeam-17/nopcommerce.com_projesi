import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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

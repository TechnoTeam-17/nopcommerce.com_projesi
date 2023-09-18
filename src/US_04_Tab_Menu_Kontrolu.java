import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class US_04_Tab_Menu_Kontrolu extends BaseDriver {

    @Test(priority = 1)
    public void menuList(){
        List<String> expectedMenuList = new ArrayList<>();
        expectedMenuList.add("Computers");
        expectedMenuList.add("Electronics");
        expectedMenuList.add("Apparel");
        expectedMenuList.add("Digital Downloads");
        expectedMenuList.add("Books");
        expectedMenuList.add("Jevelry");
        expectedMenuList.add("Gift Cards");



        // JavaScript ile metinleri çekmek için kullanılacak liste
        List<String> actualMenuList = new ArrayList<>();
        System.out.println("expectedMenuList = " + expectedMenuList);


        // JavascriptExecutor kullanarak elementlerin içeriğini çekin ve Java tarafında saklayın
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);

        WebElement ComputersBtn = driver.findElement(By.linkText("Computers"));
        actions.moveToElement(ComputersBtn).perform();
        ComputersBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("Computers"));
        driver.navigate().back();

        WebElement ElectronicsBtn = driver.findElement(By.linkText("Electronics"));
        actions.moveToElement(ElectronicsBtn).perform();
        ElectronicsBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("Electronics"));
        driver.navigate().back();

        WebElement ApparelBtn = driver.findElement(By.linkText("Apparel"));
        actions.moveToElement(ApparelBtn).perform();
        ApparelBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("Apparel"));
        driver.navigate().back();

        WebElement DigitalDownloadsBtn = driver.findElement(By.linkText("Digital Downloads"));
        actions.moveToElement(DigitalDownloadsBtn).perform();
        DigitalDownloadsBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("Digital Downloads"));

        WebElement BooksBtn = driver.findElement(By.linkText("Books"));
        actions.moveToElement(BooksBtn).perform();
        BooksBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("Books"));

        WebElement JewelryBtn = driver.findElement(By.linkText("Jewelry"));
        actions.moveToElement(JewelryBtn).perform();
        JewelryBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("Jewelry"));

        WebElement GiftCardsBtn = driver.findElement(By.linkText("Gift Cards"));
        actions.moveToElement(GiftCardsBtn).perform();
        GiftCardsBtn.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("Gift Cards"));


    }
}





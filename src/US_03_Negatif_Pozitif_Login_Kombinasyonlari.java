import Utility.BaseDriverParametr;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US_03_Negatif_Pozitif_Login_Kombinasyonlari extends BaseDriverParametr {

    @Test(dataProvider = "UserData")
    @Parameters("browserTipi")
    public void loginkombinasyonlari(String username, String password) {

        driver.get("https://demo.nopcommerce.com/");
        MyFunc.Bekle(1);
        WebElement loginLinkButton = driver.findElement(By.xpath("//a[text()='Log in']"));
        loginLinkButton.click();

        WebElement emailInput = driver.findElement(By.xpath("//*[@id='Email']"));
        emailInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='Password']"));
        passwordInput.sendKeys(password);

        WebElement logInButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        logInButton.click();

        WebElement unsuccessfulElement = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String unsuccessfulElementText = unsuccessfulElement.getText();


          SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(unsuccessfulElementText.contains("unsuccessful"),"Basarili giris yapilmistir.");

        // Assert all the conditions
       softAssert.assertAll();



    }

    @DataProvider
    public Object[][] UserData() {
        Object[][] data = {
                {"username1@gmail.com", "pw1"},
                {"username2@gmail.com", "pw2"},
                {"username3@gmail.com", "pw3"},
                {"username4@gmail.com", "pw4"},
                {"username5@gmail.com", "pw5"},
                {"username6@gmail.com", "pw6"},

        };
        return data;
    }
}

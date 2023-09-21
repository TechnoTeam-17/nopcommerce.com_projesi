package Testler;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class US_04_TabMenu02 {
    private WebDriver driver;

    @Test
    public void t1() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
        
       // int n=tabs.size();
        ArrayList<ArrayList<String>> tl=new ArrayList<ArrayList<String>>();
        ArrayList<String> tn=new ArrayList<String>();
        
            List<WebElement> tabs = driver.findElements(By.cssSelector("[class='top-menu notmobile']>li"));
        for (int i = 0; i < tabs.size(); i++) {
            System.out.println("tabs = " + tabs.get(i).getText());
            tn.add(tabs.get(i).getText());

            tabs.get(i).click();
            MyFunc.Bekle(1);

                List<WebElement> uruns = driver.findElements(By.xpath("//*[@class='sub-category-item']/h2"));
            for (int j = 0; j < uruns.size(); j++) {
             System.out.println("   b.getText() = " + uruns.get(j).getText());
             tn.add(uruns.get(j).getText());

             uruns.get(j).click();

                     List<WebElement> urunler = driver.findElements(By.xpath("//*[@class='details']/h2"));
                 for (int k = 0; k < urunler.size(); k++) {

                     System.out.println("       c.getText() = " + urunler.get(k).getText());
                     tn.add(urunler.get(k).getText());

                    urunler = driver.findElements(By.xpath("//*[@class='details']/h2"));

            }
        driver.navigate().back();
        uruns = driver.findElements(By.xpath("//*[@class='sub-category-item']/h2"));

            }
        driver.navigate().back();
        tabs = driver.findElements(By.cssSelector("[class='top-menu notmobile']>li"));
            }
        System.out.println("tn = " + tn);

driver.quit();
            }
        }








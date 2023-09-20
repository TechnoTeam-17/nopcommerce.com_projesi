package Testler;

import Utility.BaseDriver;
import Utility.nopElements;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;


public class US_07_SearchByParameter_ParametreliArama extends BaseDriver {

    @Test
    @Parameters("searchText")
    public void searchTest(String aranacakKelime) {

        nopElements nop=new nopElements();


        nop.searchBox.sendKeys(aranacakKelime);

        nop.searchButton.click();

        List<WebElement> productNameList=nop.searchList;


        for (WebElement e:productNameList  ) {
            Assert.assertTrue(e.getText().toLowerCase().contains(aranacakKelime.toLowerCase()), "Eşleşme Sağlanamadı");

        }


        //h2[@class='product-title']/a



        //Adobe Photoshop CS4


    }

}

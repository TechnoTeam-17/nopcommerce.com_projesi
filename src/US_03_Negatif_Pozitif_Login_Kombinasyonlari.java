import Utility.BaseDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class US_03_Negatif_Pozitif_Login_Kombinasyonlari extends BaseDriver {

    @Test(dataProvider = "UserData")
    public void loginkombinasyonlari(){




    }

    @DataProvider
    public Object[][] UserData() {
        Object[][] data = {
                {"username1", "pw1"},
                {"username2", "pw2"},
                {"username3", "pw3"},
                {"username4", "pw4"},
                {"username5", "pw5"},
                {"username6", "pw6"},
        };
        return data;
    }
}

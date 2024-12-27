import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;


public class TestNGExample {
    public static String user_name = "Lesha";
    public static String user_password = "123";

    @Test(enabled = false)
    public void simple_calc_test() {
        assertEquals(2 + 2, 4, "Wrong number");
    }

    @Test(enabled = false)
    @Parameters({"name", "password"})
    public void authorization_test(String name, String password) {
        assertEquals(name, user_name, "Wrong username");
        assertEquals(password, user_password, "Wrong password");
    }

    @Test(dataProvider = "credits")
    public void data_provider_test(String name, String password) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(name, user_name, "Wrong username");
        softAssert.assertEquals(password, user_password, "Wrong password");
        softAssert.assertAll();
    }

    @DataProvider(name = "credits")
    public static Object[][] CreditsProveder() {
        return new Object[][] {
                {"Lesha", "123"},
                {"Oleg", "123456"},
                {"Lesha", "1234"}
        };
    }

}

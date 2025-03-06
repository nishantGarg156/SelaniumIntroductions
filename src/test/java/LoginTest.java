import org.example.Base;
import org.example.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends Base {




    @Test
    public void testValidLogin(){
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
}

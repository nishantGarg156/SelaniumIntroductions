import org.example.Base;
import org.example.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    private LoginPage loginPage;

    @BeforeClass
    @Override
    public void setup() {
        super.setup();
        loginPage = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @Test
    public void testValidLogin(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
}

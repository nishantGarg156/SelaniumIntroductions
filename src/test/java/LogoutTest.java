import org.example.Base;
import org.example.LogOutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends Base {

    @Test
    public void testLogout() {
        LogOutPage logoutPage = new LogOutPage(getDriver());
        var isLogout = logoutPage.logOut();

        Assert.assertTrue(isLogout);
    }
}

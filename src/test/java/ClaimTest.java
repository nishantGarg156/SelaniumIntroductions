import org.example.Base;
import org.example.ClaimPage;
import org.example.DashBoardPage;
import org.example.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClaimTest extends Base {
    DashBoardPage dashBoardPage;
    ClaimPage claimPage;


    @Test
    public void testValidationClaim(){
        dashBoardPage = new DashBoardPage(getDriver());
        claimPage = new ClaimPage(getDriver());
        dashBoardPage.clickClaim();
        claimPage.submitClaim();
        claimPage.selectEvent();
        claimPage.selectCurrenecy();
        claimPage.enterRemark("Nishant");
        claimPage.clickCreateButton();
        String refId = claimPage.fetchRefernceId();
        Assert.assertTrue(!refId.isEmpty());
    }
}

package ABPageTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ABTestingPage;

import static org.testng.Assert.*;

public class ABTestPageTests extends BaseTest {

    @Test
    public void TestABTestPage(){
        ABTestingPage abTestingPage = homePage.clickABTestingLink();
        String title = abTestingPage.GetPageTitle();
        assertEquals(title, "A/B Test Control");
    }
}

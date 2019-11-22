package dynamicloading;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample1Page;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTest {

    @Test
    public void testExample1(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        DynamicLoadingExample1Page example1Page = dynamicLoadingPage.clickExample1Link();
        example1Page.clickStartButton();
        assertEquals(example1Page.getLoadedText(), "Hello World!", "Loaded text is incorrect");
    }
}

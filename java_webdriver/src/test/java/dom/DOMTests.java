package dom;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeAndDeepDOM;

public class DOMTests extends BaseTest {

    @Test
    public void testScrollToTable() {
        LargeAndDeepDOM largeAndDeepDOM = homePage.clickLargeAndDeepDOMLink();
        largeAndDeepDOM.scrollDownToBigTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScrollLink();
        infiniteScrollPage.scrollToParagrah(5);
    }

}

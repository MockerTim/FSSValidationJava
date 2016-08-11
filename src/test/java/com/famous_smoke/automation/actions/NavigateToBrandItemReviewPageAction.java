package test.java.com.famous_smoke.automation.actions;

import test.java.com.famous_smoke.automation.data.BrandItemPageData;
import test.java.com.famous_smoke.automation.data.BrandItemReviewPageData;
import test.java.com.famous_smoke.automation.pageobjects.BrandItemPage;
import test.java.com.famous_smoke.automation.pageobjects.BrandItemReviewPage;

import org.apache.log4j.Logger;

/**
 * <p>Executes the Navigation to a Brand page.</p>
 */
public class NavigateToBrandItemReviewPageAction {

    private static final Logger logger = Logger.getLogger(NavigateToBrandItemPageAction.class);
    /**
     * Navigates to the URL setup in the
     * Hooks class and initializes
     * the PageObjects.
     * @return the BrandPageData of the
     * current page.
     */
    public static BrandItemReviewPageData execute() {
        logger.debug("Executes the Navigation to a Brand page");
        NavigateToTestUrlAction.execute();
        return BrandItemReviewPage.getItemData();
    }
}

package test.java.com.famous_smoke.automation.actions;

import test.java.com.famous_smoke.automation.data.BrandPageData;
import test.java.com.famous_smoke.automation.data.BrandReviewPageData;
import test.java.com.famous_smoke.automation.pageobjects.BrandPage;
import test.java.com.famous_smoke.automation.pageobjects.BrandReviewPage;

import org.apache.log4j.Logger;

/**
 * <p>Executes the Navigation to a Brand page.</p>
 */
public class NavigateToBrandReviewPageAction {

    private static final Logger logger = Logger.getLogger(NavigateToBrandReviewPageAction.class);
    /**
     * Navigates to the URL setup in the
     * Hooks class and initializes
     * the PageObjects.
     * @return the BrandPageData of the
     * current page.
     */
    public static BrandReviewPageData execute() {
        logger.debug("Executes the Navigation to a Brand review page");
        NavigateToTestUrlAction.execute();
        return BrandReviewPage.getBrandReviewData();
    }
}

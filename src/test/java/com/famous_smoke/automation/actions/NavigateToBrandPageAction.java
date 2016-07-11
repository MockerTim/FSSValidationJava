package com.famous_smoke.automation.actions;

import com.famous_smoke.automation.data.BrandPageData;
import com.famous_smoke.automation.pageobjects.BrandPage;
import org.apache.log4j.Logger;

/**
 * <p>Executes the Navigation to a Brand page.</p>
 */
public class NavigateToBrandPageAction {

    private static final Logger logger = Logger.getLogger(NavigateToBrandPageAction.class);
    /**
     * Navigates to the URL setup in the
     * Hooks class and initializes
     * the PageObjects.
     * @return the BrandPageData of the
     * current page.
     */
    public static BrandPageData execute() {
        logger.debug("Executes the Navigation to a Brand page");
        NavigateToTestUrlAction.execute();
        return BrandPage.getBrandData();
    }
}

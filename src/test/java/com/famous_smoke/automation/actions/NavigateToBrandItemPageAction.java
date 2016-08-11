package test.java.com.famous_smoke.automation.actions;

import test.java.com.famous_smoke.automation.data.BrandItemPageData;
import test.java.com.famous_smoke.automation.pageobjects.BrandItemPage;
import org.apache.log4j.Logger;

/**
 * <p>Executes the Navigation to a Brand page.</p>
 */
public class NavigateToBrandItemPageAction {

    private static final Logger logger = Logger.getLogger(NavigateToBrandItemPageAction.class);
    /**
     * Navigates to the URL setup in the
     * Hooks class and initializes
     * the PageObjects.
     * @return the BrandPageData of the
     * current page.
     */
    public static BrandItemPageData execute() {
        logger.debug("Executes the Navigation to a Brand page");
        NavigateToTestUrlAction.execute();
        return BrandItemPage.getItemData();
    }
}

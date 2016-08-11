package test.java.com.famous_smoke.automation.actions;

import test.java.com.famous_smoke.automation.Hooks;
import test.java.com.famous_smoke.automation.data.BasePageData;
import test.java.com.famous_smoke.automation.navigation.Navigator;
import test.java.com.famous_smoke.automation.pageobjects.BasePage;
import org.apache.log4j.Logger;

/**
 * <p>Executes the Navigation to a Brand page.</p>
 */
public class NavigateToTestUrlAction {

    private static final Logger logger = Logger.getLogger(NavigateToTestUrlAction.class);

    /**
     * Navigates to the URL setup in the
     * Hooks class and initializes
     * the PageObjects.
     * @return the BrandPageData of the
     * current page.
     */
    public static BasePageData execute() {
        logger.debug("Executes the Navigation to a Brand page");
        Navigator.goUrl(Hooks.testUrl);
        Navigator.initializePages();
        return BasePage.getBasePageData();
    }
}

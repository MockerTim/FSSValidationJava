package com.famous_smoke.automation.navigation;

import com.famous_smoke.automation.pageobjects.BasePage;
import com.famous_smoke.automation.pageobjects.BrandItemPage;
import com.famous_smoke.automation.pageobjects.BrandPage;
import com.famous_smoke.automation.pageobjects.BrandListPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * <p>Handles the navigation of the Framework passing orders
 * to the Selenium WebDriver.</p>
 */
public class Navigator {

    private static final Logger logger = Logger.getLogger(Navigator.class);

    /**
     * The WebDriver that is instantiated in each
     * test run.
     */
    public static WebDriver driver;

    /**
     * Navigates to the specified URL
     * @param url the URL which
     *            we are going to get.
     */
    public static void goUrl(final String url) {
        logger.debug("Driver run page by url: " + url);
        driver.get(url);
       /** try {
	*		Thread.sleep(20000);
	*	} catch (InterruptedException e) {
	*		// TODO Auto-generated catch block
	*		e.printStackTrace();
	*/	}
    }

    /**
     * Moves the WebDriver to the
     * previous page.
     */
    public static void goBack(){
        logger.debug("Driver navigates back");
        driver.navigate().back();
    }

    /**
     * Initializes the WebElements
     * of the Selenium PageObjects
     * we have defined in the
     * pageobjects package.
     */
    public static void initializePages() {
        Navigator.initializePage(BrandListPage.class);
        Navigator.initializePage(BrandPage.class);
        Navigator.initializePage(BrandItemPage.class);
    }

    /**
     * Retrieves the HTML source of the
     * current WebDriver location.
     * @return the HTML Source.
     */
    public static String getPageSource() {
        return driver.getPageSource();
    }

    /**
     * Closes and nullifies the
     * current WebDriver.
     */
    public static void closeNavigator() {
       logger.debug("Closing driver ...");
        driver.quit();
        driver = null;
    }

    /**
     * Initializes the WebElements of a
     * PageObject Class that inherits
     * from the BasePage class.
     * @param page the BasePage class.
     */
    private static void initializePage(final Class<? extends BasePage> page){
        logger.debug("Initialize page by name: "  + page.getName());
        PageFactory.initElements(driver, page);
    }

}

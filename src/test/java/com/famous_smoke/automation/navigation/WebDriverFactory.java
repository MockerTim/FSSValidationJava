package com.famous_smoke.automation.navigation;

import com.famous_smoke.automation.util.TestConfigReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * <p>Creates the different types of Selenium
 * WebDrivers supported by the Framework
 * through an static factorial method.</p>
 *
 * <p>An implementation of the Factory pattern.</p>
 */
public final class WebDriverFactory {

    private static Logger logger = Logger.getLogger(WebDriverFactory.class);

    private WebDriverFactory() {
        // not called
    }

    /**
     * Creates a new WebDriver objects, according
     * to the enumerator value given as a parameter.
     * @param driver the type of WebDriver to create.
     * @return the Selenium WebDriver.
     */
    public static WebDriver createDriver(final SupportedWebDrivers driver) {
        switch (driver) {
            case LOCAL_CHROME: return createLocalChromeDriver();
            case LOCAL_FIREFOX: return createLocalFirefoxDriver();
            case LOCAL_HTMLUNIT: return createLocalHTMLUnitDriver();
            case REMOTE_CHROME: return createRemoteChromeDriver();
            case REMOTE_FIREFOX: return createRemoteFirefoxDriver();
            case REMOTE_BROWSERSTACK: {return createBrowserStackDriver();}
            default: return createLocalHTMLUnitDriver();
        }
    }

    /**
     * Creates a HTMLUnit WebDriver using Selenium
     * as an standalone run.
     * @return the HTMLUnit WebDriver.
     */
    private static WebDriver createLocalHTMLUnitDriver() {
        return new HtmlUnitDriver();
    }

    /**
     * Creates a Chrome WebDriver using Selenium
     * as an standalone run.
     *
     * We need to have the Chrome WebDriver executable
     * in our PATH environment for this to work.
     * @return the Chrome WebDriver.
     */
    private static WebDriver createLocalChromeDriver() { System.setProperty( "webdriver.chrome.driver", "C:\\chromedriver.exe"); return new ChromeDriver(); }

    /**
     * Creates a Firefox WebDriver using Selenium
     * as an standalone run.
     *
     * We need to have the Firefox WebDriver executable
     * in our PATH environment for this to work.
     * @return the Firefox WebDriver.
     */
    private static WebDriver createLocalFirefoxDriver() {
        return new FirefoxDriver();
    }

    /**
     * Creates a Chrome WebDriver connecting to
     * a Selenium Grid.
     *
     * We need to be able to communicate to
     * the Grid to be able to run this.
     * @return the remote Chrome WebDriver.
     */
    public static WebDriver createRemoteChromeDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        return createRemoteDriver(capabilities);
    }

    /**
     * Creates a Firefox WebDriver connecting to
     * a Selenium Grid.
     *
     * We need to be able to communicate to
     * the Grid to be able to run this.
     * @return the remote Firefox WebDriver.
     */
    public static WebDriver createRemoteFirefoxDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        return createRemoteDriver(capabilities);
    }

    /**
     * Creates a new Remote WebDriver through a
     * SeleniumGrid.
     *
     * It uses the TestConfigReader to determine
     * the Grid Server Hostname and Port.
     *
     * Hence you need to have this configured in
     * the TestConfig.properties.
     * @param capabilities the desired WebDriver
     *                     capabilities.
     * @return the Remote WebDriver.
     */
    private static WebDriver createRemoteDriver(final DesiredCapabilities capabilities) {
        logger.debug("Starting Remote Driver by Url: " +"http://"
                + TestConfigReader.getSeleniumServerHost()
                + ":"
                + TestConfigReader.getSeleniumServerPort()
                + "/wd/hub" );

        URL seleniumServerUrl = null;
        try {
             seleniumServerUrl = new URL("http://"
                    + TestConfigReader.getSeleniumServerHost()
                    + ":"
                    + TestConfigReader.getSeleniumServerPort()
                    + "/wd/hub"
            );
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return new RemoteWebDriver(seleniumServerUrl, capabilities);
    }

/*    private static WebDriver createBrowserstackDriver(final DesiredCapabilities capabilities) {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "IE");
        caps.setCapability("browser_version", "7.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "XP");
        caps.setCapability("browserstack.debug", "true");

        WebDriver driver = new RemoteWebDriver(caps);
        driver.get("http://www.google.com");

        return driver;
    }*/

    public static WebDriver createBrowserStackDriver(){
        String USERNAME = TestConfigReader.getBrowserStackUsername();
        String AUTOMATE_KEY = TestConfigReader.getBrowserStackKey();
        String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", TestConfigReader.getBrowserStackBrowser());
        caps.setCapability("browser_version", TestConfigReader.getBrowserStackBrowserVersion());
        caps.setCapability("os", TestConfigReader.getBrowserStackOs());
        caps.setCapability("os_version", TestConfigReader.getBrowserStackOsVersion());
        caps.setCapability("browserstack.debug", "true");
        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(URL), caps);
        }
        catch (MalformedURLException ex) {
            logger.error(ex.getMessage());
        }
        return driver;
    }

}

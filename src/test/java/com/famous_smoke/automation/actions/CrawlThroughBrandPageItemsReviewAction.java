package test.java.com.famous_smoke.automation.actions;

import test.java.com.famous_smoke.automation.Hooks;
import static test.java.com.famous_smoke.automation.util.SeleniumFinder.findElementByXPath;
import test.java.com.famous_smoke.automation.data.BrandItemPageData;
import test.java.com.famous_smoke.automation.data.BrandItemReviewPageData;
import test.java.com.famous_smoke.automation.navigation.Navigator;
import test.java.com.famous_smoke.automation.pageobjects.BrandItemPage;
import test.java.com.famous_smoke.automation.pageobjects.BrandPage;
import test.java.com.famous_smoke.automation.util.SeleniumFinder;
import test.java.com.famous_smoke.automation.validators.UrlValidators;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Crawls through the different Brand links
 * of the BrandListPage.</p>
 */
public class CrawlThroughBrandPageItemsReviewAction {

    private static final Logger logger = Logger.getLogger(CrawlThroughBrandPageItemsAction.class);
    /**
     * Goes through the Brand Items list of the
     * Brand page, one link at a time.
     *
     * Due to the flakiness of the WebElements
     * we cannot use complex iterations of object
     * so we must iterate using a FOR cycle.
     *
     * It's important to check if the Promo is
     * enabled and close it in each iteration
     * as it would prevent interacting with the
     * BrandPage.
     * @return the BrandPageData list of all the
     * iterated BrandPages.
     * @throws Throwable
     */
    public static List<BrandItemReviewPageData> execute() throws Throwable {
        logger.debug("Crawls through the different Brand links of the BrandListPage");
        List<BrandItemReviewPageData> itemsData = new ArrayList<>();
        String url = BrandPage.getBrandData().getURL();
        if (UrlValidators.isBrandPage(url)) {
           //List<String> itemsURLs = BrandPage.getItemsURLs();
           
            int we=BrandPage.getItemsCount();
            List<String> li=BrandPage.getItemsLink();
            List<WebElement> reviewItem=BrandPage.getItemsBlock();
           System.out.println("test");
           
           System.out.println(SeleniumFinder.findElementByXPath(reviewItem.get(1), "//*[@class='brandvotes']").getText());
           
           int count=0;
           for (String itemURL : li){
        	   
        	   String previousURL = Hooks.testUrl;
               Hooks.testUrl = itemURL;
               System.out.println(itemURL);
               try {
                   logger.info("SCRAPPING DATA FROM " + Hooks.testUrl);
                   itemsData.add(NavigateToBrandItemReviewPageAction.execute());
                   Navigator.goBack();
               } catch (Exception ex) {
                   String message = "FAILED TO SCRAP DATA FROM " + Hooks.testUrl + "\n"
                                  + "EXCEPTION MESSAGE IS: " + ex.getMessage();
                   logger.error(message);
                   Hooks.testUrl = previousURL;
                   NavigateToTestUrlAction.execute();
               }
              // count=count+1;
              // if(count==we){
            	  // break;
               //}
        	   
           }
           
          /*  for (String itemURL : itemsURLs) {
                String previousURL = Hooks.testUrl;
                Hooks.testUrl = itemURL;
                try {
                    logger.info("SCRAPPING DATA FROM " + Hooks.testUrl);
                    itemsData.add(NavigateToBrandItemPageAction.execute());
                    Navigator.goBack();
                } catch (Exception ex) {
                    String message = "FAILED TO SCRAP DATA FROM " + Hooks.testUrl + "\n"
                                   + "EXCEPTION MESSAGE IS: " + ex.getMessage();
                    logger.error(message);
                    Hooks.testUrl = previousURL;
                    NavigateToTestUrlAction.execute();
                }
            }*/
        }
        return itemsData;
    }

}

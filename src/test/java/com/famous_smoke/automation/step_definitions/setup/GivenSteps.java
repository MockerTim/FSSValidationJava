package test.java.com.famous_smoke.automation.step_definitions.setup;

import test.java.com.famous_smoke.automation.Hooks;
import test.java.com.famous_smoke.automation.actions.ScrapBrandItemsDataFromBrandListPageAction;
import test.java.com.famous_smoke.automation.actions.NavigateToTestUrlAction;
import test.java.com.famous_smoke.automation.actions.ScrapBrandItemsReviewDataFromBrandListPageAction;
import test.java.com.famous_smoke.automation.actions.ScrapBrandsReviewDataFromBrandPagesAction;
import test.java.com.famous_smoke.automation.util.FeaturesProcessor;
import test.java.com.famous_smoke.automation.util.TestConfigReader;
import test.java.com.famous_smoke.automation.actions.ScrapBrandsDataFromBrandListPageAction;
import cucumber.api.java.en.Given;


/**
 * Created by drew on 27-12-2015.
 */
public class GivenSteps {

    @Given("^I need to Setup the Features for the Brands$")
    public void i_need_to_Setup_the_Features_for_the_Brands() throws Throwable {
        Hooks.testSetupNeeded = FeaturesProcessor.needToProcessBrands();
    }

    @Given("^I need to Setup the Features for the Items$")
    public void i_need_to_Setup_the_Features_for_the_Items() throws Throwable {
    	Hooks.testSetupNeeded = FeaturesProcessor.needToProcessItems();
    }

    @Given("^I navigate to the page \"([^\"]*)\"$")
    public void i_navigate_to_the_page(final String url) throws Throwable {
        if (Hooks.testSetupNeeded) {
            Hooks.testUrl = url;
            Hooks.testMaximumCrawls = TestConfigReader.getMaximumCrawls();
            NavigateToTestUrlAction.execute();
        }
    }

    @Given("^I crawl through the brands list$")
    public void i_crawl_through_the_brands_list() throws Throwable {
        if (Hooks.testSetupNeeded) {
            Hooks.testBrandPagesData = ScrapBrandsDataFromBrandListPageAction.execute();
           
        }
    }
    
    
    
    @Given("^I crawl through the brand review page of each brand$")
    public void i_crawl_through_the_brand_review_page_of_each_brand() throws Throwable {
        if (Hooks.testSetupNeeded) {
            Hooks.testBrandReviewPagesData=ScrapBrandsReviewDataFromBrandPagesAction.execute();
        }
    }
    

    @Given("^I crawl through the items of each brand$")
    public void i_crawl_through_the_items_of_each_brand() throws Throwable {
        if (Hooks.testSetupNeeded) {
            Hooks.testBrandItemPagesData = ScrapBrandItemsDataFromBrandListPageAction.execute();
        }
    }
    
    @Given("^I crawl through the item review page of each brand$")
    public void i_crawl_through_the_item_review_page_of_each_brand() throws Throwable {
        if (Hooks.testSetupNeeded) {
            Hooks.testBrandItemReviewPagesData = ScrapBrandItemsReviewDataFromBrandListPageAction.execute();
        }
    }
	
	

}

package test.java.com.famous_smoke.automation.step_definitions.seo;

import test.java.com.famous_smoke.automation.Hooks;
import test.java.com.famous_smoke.automation.actions.NavigateToBrandItemPageAction;
import test.java.com.famous_smoke.automation.actions.NavigateToBrandItemReviewPageAction;
import test.java.com.famous_smoke.automation.actions.NavigateToBrandPageAction;
import test.java.com.famous_smoke.automation.actions.NavigateToBrandReviewPageAction;
import test.java.com.famous_smoke.automation.actions.NavigateToPageAction;
import cucumber.api.java.en.When;

/**
 * Created by drew on 12-01-2016.
 */
public class WhenSteps {

    @When("^I navigate to the page$")
    public void i_navigate_to_the_page() throws Throwable {
        Hooks.testBasePageData = NavigateToPageAction.execute();
    }

    @When("^I navigate to the brand page$")
    public void i_navigate_to_the_brand_page() throws Throwable {
        Hooks.testBrandPageData = NavigateToBrandPageAction.execute();
    }
    
    @When("^I navigate to the brand review page$")
    public void i_navigate_to_the_brand_review_page() throws Throwable {
        Hooks.testBrandReviewPageData = NavigateToBrandReviewPageAction.execute();
    }

    @When("^I navigate to the item page$")
    public void i_navigate_to_the_item_page() throws Throwable {
        Hooks.testBrandItemPageData = NavigateToBrandItemPageAction.execute();
    }
    
    @When("^I navigate to the item review page$")
    public void i_navigate_to_the_item_review_page() throws Throwable {
        Hooks.testBrandItemReviewPageData = NavigateToBrandItemReviewPageAction.execute();
    }

}

package test.java.com.famous_smoke.automation.step_definitions.setup;

import test.java.com.famous_smoke.automation.Hooks;
import test.java.com.famous_smoke.automation.data.DataWorkbook;
import cucumber.api.java.en.When;

/**
 * Created by drew on 27-12-2015.
 */
public class WhenSteps {

    @When("^I store the extracted brands data$")
    public void i_store_the_extracted_brands_data() throws Throwable {
        if (Hooks.testSetupNeeded) {
            DataWorkbook workbook = DataWorkbook.getTestDataWorkbook();
            workbook.writeBrandPages(Hooks.testBrandPagesData);
            
        }
    }
    
    @When("^I store the extracted brands review data$")
    public void i_store_the_extracted_brands_review_data() throws Throwable {
        if (Hooks.testSetupNeeded) {
            DataWorkbook workbook = DataWorkbook.getTestDataWorkbook();
            workbook.writeBrandReviewPages(Hooks.testBrandReviewPagesData);
        }
    }

    @When("^I store the extracted items data$")
    public void i_store_the_extracted_items_data() throws Throwable {
        if (Hooks.testSetupNeeded) {
            DataWorkbook workbook = DataWorkbook.getTestDataWorkbook();
            workbook.writeBrandItemPages(Hooks.testBrandItemPagesData);
        }
    }
    
    @When("^I store the extracted items review data$")
    public void i_store_the_extracted_items_review_data() throws Throwable {
    	if (Hooks.testSetupNeeded) {
            DataWorkbook workbook = DataWorkbook.getTestDataWorkbook();
            workbook.writeBrandItemReviewPages(Hooks.testBrandItemReviewPagesData);
        }
    }

}

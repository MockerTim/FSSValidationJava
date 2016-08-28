package test.java.com.famous_smoke.automation.step_definitions.setup;

import test.java.com.famous_smoke.automation.Hooks;
import test.java.com.famous_smoke.automation.util.FeaturesProcessor;
import cucumber.api.java.en.Then;

import static test.java.com.famous_smoke.automation.assertions.FamousSmokeAssertions.fail;

/**
 * Created by drew on 27-12-2015.
 */
public class ThenSteps {

    @Then("^I should process the base features templates$")
    public void i_should_process_the_base_features_templates() throws Throwable {
        if (Hooks.testSetupNeeded) {
            FeaturesProcessor.processBaseFeatures(Hooks.getBasePagesData());
        }
    }

    @Then("^I should process the brands features templates$")
    public void i_should_process_the_brands_features_templates() throws Throwable {
        if (Hooks.testSetupNeeded) {
            FeaturesProcessor.processBrandFeatures(Hooks.testBrandPagesData);
        }
    }

    @Then("^I should process the items features templates$")
    public void i_should_process_the_items_features_templates() throws Throwable {
        if (Hooks.testSetupNeeded) {
            FeaturesProcessor.processItemsFeatures(Hooks.testBrandItemPagesData);
        }
    }
    
    @Then("^I should process the brands review features templates$")
    public void i_should_process_the_brand_review_features_templates() throws Throwable {
        if (Hooks.testSetupNeeded) {
            FeaturesProcessor.processBrandReviewFeatures(Hooks.testBrandReviewPagesData);
        }
    }
    
    @Then("^I should process the items review features templates$")
    public void i_should_process_the_items_review_features_templates() throws Throwable {
        if (Hooks.testSetupNeeded) {
            FeaturesProcessor.processBrandItemsReviewFeatures(Hooks.testBrandItemReviewPagesData);
        }
    }

}

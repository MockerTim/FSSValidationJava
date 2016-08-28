package test.java.com.famous_smoke.automation.step_definitions.validation;


import test.java.com.famous_smoke.automation.Hooks;
import test.java.com.famous_smoke.automation.pageobjects.BrandItemPage;

import cucumber.api.java.en.Then;
import static test.java.com.famous_smoke.automation.assertions.FamousSmokeAssertions.assertThat;


/**
 * Created by drew on 11-01-2016.
 */
public class ThenSteps {

    @Then("^the brand identification should be visible$")
    public void the_brand_identification_should_be_visisble() throws Throwable {
        assertThat(Hooks.testBrandPageData).isIdentified();
    }

    @Then("^the item identification should be visible$")
    public void the_item_identification_should_be_visible() throws Throwable {
        assertThat(Hooks.testBrandItemPageData).isIdentified();
    }

    @Then("^the brand page should not be a placeholder image url ending in na.gif$")
    public void the_brand_page_does_not_have_any_na_gif_image() throws Throwable {
        assertThat(Hooks.testBrandPageData).isNaGif();
    }

    @Then("^the item page should not be a placeholder image url ending in na.gif$")
    public void the_item_page_does_not_have_any_na_gif_image() throws Throwable {
        assertThat(Hooks.testBrandItemPageData).isIdentified();
    }
    
    @Then("^the item review page should not be a placeholder image url ending in na.gif$")
    public void the_item_review_page_does_not_have_any_na_gif_image() throws Throwable {
        assertThat(Hooks.testBrandItemReviewPageData).isIdentified();
    }
}

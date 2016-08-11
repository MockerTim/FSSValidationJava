package test.java.com.famous_smoke.automation.step_definitions.actionvalidation;

import test.java.com.famous_smoke.automation.Hooks;
import test.java.com.famous_smoke.automation.actions.NavigateToBrandPageAction;
import cucumber.api.java.en.Given;

import static test.java.com.famous_smoke.automation.assertions.FamousSmokeAssertions.assertThat;


/**
 * Created by drew on 12-01-2016.
 */
public class GivenSteps {

    @Given("^I want to check the breadcrumbs of \"([^\"]*)\"$")
    public void i_want_to_check_the_breadcrumbs_of(final String url) throws Throwable {
        Hooks.testUrl = url;
        Hooks.testBasePageData = NavigateToBrandPageAction.execute();
        assertThat(Hooks.testBasePageData).hasBreadcrumbs();
        Hooks.testBasePageData = null;
    }
}

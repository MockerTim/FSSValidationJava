package test.java.com.famous_smoke.automation.assertions;

import test.java.com.famous_smoke.automation.data.BasePageData;
import test.java.com.famous_smoke.automation.data.BrandItemPageData;
import test.java.com.famous_smoke.automation.data.BrandItemReviewPageData;
import test.java.com.famous_smoke.automation.data.BrandPageData;
import test.java.com.famous_smoke.automation.data.BrandReviewPageData;

import org.assertj.core.api.Assertions;


/**
 * <p>Entry point to the FEST Assertions.</p>
 *
 * <p>It extends from the Assertions class, so it
 * inherits all the static <strong>assertThat</strong>
 * functions defined on it.</p>
 *
 * <p>Besides the bulk of the inherited assertions
 * we have created two new assertion functions to override
 * the assertions of Strings and to assert BrandPageData objects.</p>
 */
public class FamousSmokeAssertions extends Assertions {

    public static BasePageDataAssert assertThat(final BasePageData actual) {
        return new BasePageDataAssert(actual);
    }

    /**
     * Asserts BrandPageData objects.
     * @param actual the BrandPageData to assert.
     * @return the BrandPageAssert object.
     */
    public static BrandPageDataAssert assertThat(final BrandPageData actual) {
        return new BrandPageDataAssert(actual);
    }
    
    public static BrandReviewPageDataAssert assertThat(final BrandReviewPageData actual) {
        return new BrandReviewPageDataAssert(actual);
    }

    public static BrandItemPageDataAssert assertThat(final BrandItemPageData actual) {
        return new BrandItemPageDataAssert(actual);
    }
    
    public static BrandItemReviewPageDataAssert assertThat(final BrandItemReviewPageData actual) {
        return new BrandItemReviewPageDataAssert(actual);
    }
    
   

    /**
     * Asserts String objects.
     * @param actual the String to assert
     * @return the StringAssert object.
     */
    public static StringAssert assertThat(final String actual) {
        return new StringAssert(actual);
    }
}

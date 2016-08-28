package test.java.com.famous_smoke.automation.assertions;

import java.util.List;

import org.assertj.core.api.AbstractAssert;

import test.java.com.famous_smoke.automation.data.BrandPageData;
import test.java.com.famous_smoke.automation.data.BrandReviewPageData;

public class BrandReviewPageDataAssert extends AbstractAssert<BrandReviewPageDataAssert, BrandReviewPageData> {

    private static final String COLLECTION_SEPARATOR = ",";

    /**
     * Constructor matching the one requested by
     * AbstractAssert.
     * @param actual the BrandPageData object we are going
     *               to evaluate.
     */
    public BrandReviewPageDataAssert(final BrandReviewPageData actual) {
        super(actual, BrandReviewPageDataAssert.class);
    }

    /**
     * Checks if the header one field is not empty.
     * @return the current Assert object; this is done
     * to allow chain assertions.
     */
    public BrandReviewPageDataAssert hasHeader1() {
        return isNotEmpty(BrandReviewPageData.HEADER1_FIELD_NAME, actual.getHeader1());
    }

    /**
     * Compares the header one against a value
     * passed as parameter.
     * @param expected the value to which we'll compare.
     * @return the current Assert object; this is done
     * to allow chain assertions
     */
    public BrandReviewPageDataAssert hasHeader1EqualTo(final String expected){
        return isEqualTo(BrandReviewPageData.HEADER1_FIELD_NAME, actual.getHeader1(), expected);
    }

    /**
     * Checks if the description field is not empty.
     * @return the current Assert object; this is done
     * to allow chain assertions.
     */
    

    /**
     * Performs the FEST Assertion to check
     * if the value is not empty.
     *
     * It overrides the error message with
     * the one defined as a constant in
     * AssertionMessages.
     * @param fieldName the field name
     * @param field the field value
     * @return the current Assert object; this is done
     * to allow chain assertions.
     */
    private BrandReviewPageDataAssert isNotEmpty(final String fieldName,
                                           final String field) {
        FamousSmokeAssertions
                .assertThat(field)
                .overridingErrorMessage(
                        AssertionMessages.FIELD_IS_EMPTY,
                        fieldName,
                        actual.getURL())
                .isNotEmpty();
        return this;
    }


    /**
     * Performs the FEST Assertion to check
     * if the value is equal to an expected
     * value.
     *
     * It overrides the error message with
     * the one defined as a constant in
     * AssertionMessages.
     * @param fieldName the field name.
     * @param field the field value.
     * @return the current Assert object; this is done
     * to allow chain assertions.
     */
    private BrandReviewPageDataAssert isEqualTo(final String fieldName,
                                          final String field,
                                          final String expected) {
        FamousSmokeAssertions
                .assertThat(field)
                .overridingErrorMessage(
                        AssertionMessages.FIELD_NOT_MATCHING,
                        fieldName,
                        actual.getURL(),
                        field,
                        expected)
                .isEqualTo(expected);
        return this;
    }

    /**
     * Converts a list of Strings
     * to a single string separated by the constant.
     *
     * This is done through the Stream API using
     * a reduce operation, which is an accumulative
     * function that concatenates all the values of
     * the list together.
     * @param strings the strings list.
     * @return the String representation of the
     * strings list.
     */
    private String reduceCollectionToString(final List<String> strings) {
        return strings
                .stream()
                .reduce("", (a, b) -> a + COLLECTION_SEPARATOR + b);
    }

    /**
     * Checks if the na gif field is false.
     * @return the current Assert object; this is done
     * to allow chain assertions.
     */
   }

package com.famous_smoke.automation.assertions;

import com.famous_smoke.automation.data.BrandPageData;
import org.assertj.core.api.AbstractAssert;

import java.util.List;

/**
 * <p>Custom <strong>FEST Assert</strong> class for the
 * BrandPageData objects.</p>
 *
 * <p>We use this class through the FamousSmokeAssertions
 * class in order to make our assertions more readable when
 * they are used in the steps definitions.</p>
 *
 * <p>This class must extend the AbstractAssert class.</p>
 */
public class BrandPageDataAssert extends AbstractAssert<BrandPageDataAssert, BrandPageData> {

    private static final String COLLECTION_SEPARATOR = ",";

    /**
     * Constructor matching the one requested by
     * AbstractAssert.
     * @param actual the BrandPageData object we are going
     *               to evaluate.
     */
    public BrandPageDataAssert(final BrandPageData actual) {
        super(actual, BrandPageDataAssert.class);
    }

    /**
     * Checks if the header one field is not empty.
     * @return the current Assert object; this is done
     * to allow chain assertions.
     */
    public BrandPageDataAssert hasHeader1() {
        return isNotEmpty(BrandPageData.HEADER1_FIELD_NAME, actual.getHeader1());
    }

    /**
     * Compares the header one against a value
     * passed as parameter.
     * @param expected the value to which we'll compare.
     * @return the current Assert object; this is done
     * to allow chain assertions
     */
    public BrandPageDataAssert hasHeader1EqualTo(final String expected){
        return isEqualTo(BrandPageData.HEADER1_FIELD_NAME, actual.getHeader1(), expected);
    }

    /**
     * Checks if the description field is not empty.
     * @return the current Assert object; this is done
     * to allow chain assertions.
     */
    public BrandPageDataAssert hasDescription() {
        return isNotEmpty(BrandPageData.DESCRIPTION_FIELD_NAME, actual.getDescription());
    }

    /**
     * Compares the description against a value
     * passed as parameter.
     * @param expected the value to which we'll compare.
     * @return the current Assert object; this is done
     * to allow chain assertions
     */
    public BrandPageDataAssert hasDescriptionEqualTo(final String expected){
        return isEqualTo(BrandPageData.DESCRIPTION_FIELD_NAME, actual.getDescription(), expected);
    }

    /**
     * Checks if the identified field is true.
     * @return the current Assert object; this is done
     * to allow chain assertions.
     */
    public BrandPageDataAssert isIdentified() {
        FamousSmokeAssertions
                .assertThat(actual.getIdentified())
                .overridingErrorMessage(AssertionMessages.BRAND_NOT_IDENTIFIED, actual.getURL())
                .isTrue();
        return this;
    }

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
    private BrandPageDataAssert isNotEmpty(final String fieldName,
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
    private BrandPageDataAssert isEqualTo(final String fieldName,
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
    public BrandPageDataAssert isNaGif() {
        FamousSmokeAssertions
                .assertThat(actual.getNaGif())
                .overridingErrorMessage(AssertionMessages.PLACEHOLDER_NA_GIF, actual.getURL())
                .isFalse();
        return this;
    }
}

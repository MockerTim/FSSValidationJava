package com.famous_smoke.automation.pageobjects;

import static com.famous_smoke.automation.util.SeleniumFinder.findElementByCss;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.famous_smoke.automation.data.BrandPageData;
import com.famous_smoke.automation.data.DataFactory;

/**
 * <p>Represents the Brand pages of the site.</p>
 *
 * <p>The BrandPage extends from BasePage</p>
 */
public class BrandPage extends BasePage {

    /**
     * The Header One.
     */
    @FindBy(css = PageConstants.BRAND_HEADER1_CSS)
    private static WebElement header1;
    /**
     * The Description/SEO Paragraph.
     */
    @FindBy(css = PageConstants.BRAND_DESCRIPTION_CSS)
    private static WebElement description;
    /**
     * The Brand Logo.
     */
    @FindBy(css = PageConstants.BRAND_LOGO_CSS)
    private static WebElement logo;
    /**
     * The BrandVideo.
     */
    @FindBy(css = PageConstants.BRAND_VIDEO_CSS)
    private static WebElement video;
    /**
     * The Brand Items
     */
    @FindBy(css = PageConstants.BRAND_ITEM_BOX_CSS)
    private static List<WebElement> items;
    /**
     * The MetaIndex.
     */
    @FindBy(xpath = PageConstants.META_INDEX)
    private static WebElement metaIndex;
    
    @FindBy(css = PageConstants.BRAND_ALT_TAG_CSS)
    private static WebElement altTag;

    /**
     * Gets the amount of items associated
     * with this brand.
     * @return the count of item pages
     * associated with this brand.
     */
    public static Integer getItemsCount() {
        return items.size();
    }

    /**
     * Navigates to the Item in the
     * items list associated with the
     * index.
     * @param itemIndex the index for
     *                  the items list.
     */
    public static void goToItem(final Integer itemIndex) {
        logger.debug("Go to item by index:" + itemIndex);
        WebElement item = items.get(itemIndex);
        waitUntilElementIsClickable(
                findElementByCss(item, PageConstants.BRAND_ITEM_LINK_CSS)
        ).click();
    }

    public static List<String> getItemsURLs() {
        return items
                .stream()
                .map(item -> findElementByCss(item, PageConstants.BRAND_ITEM_LINK_CSS))
                .map(item -> extractElementAttribute(item, PageConstants.ATTRIBUTE_HREF, true))
                .collect(Collectors.toList());
    }

    /**
     * Creates the BrandPageData by a mixture
     * of the BasePageData and the WebElements
     * of the BrandPage.
     * @return the BrandPageData object with the
     * information of the current BrandPage.
     */
    public static BrandPageData getBrandData() {
        String header1Text = extractElementText(header1, hasHeader1());
        String descriptionText = extractElementText(description, hasDescription());
        String altTagText = extractElementAttribute(altTag, PageConstants.ATTRIBUTE_ALT, hasAltTag());
        String metaIndexContent = extractElementAttribute(
                metaIndex,
                PageConstants.ATTRIBUTE_CONTENT,
                hasMetaIndex()
        );
        return DataFactory.createBrandPage(getBasePageData(), header1Text, descriptionText, isIdentified(), isNaGif(), metaIndexContent, altTagText);
    }

    /**
     * Evaluates if the page has a header one.
     * @return true if there are elements found
     * with the CSS of the header one.
     */
    public static boolean hasHeader1() {
        return hasCSSElement(PageConstants.BRAND_HEADER1_CSS);
    }

    /**
     * Evaluates if the page has a description.
     * @return true if there are elements found
     * with the CSS of the description.
     */
    public static boolean hasDescription() {
        return hasCSSElement(PageConstants.BRAND_DESCRIPTION_CSS);
    }

    /**
     * Evaluates if the page has a meta index.
     * @return true if there are elements found
     * with the XPATH of the meta index.
     */
    public static boolean hasMetaIndex() {
        return hasXPATHElement(PageConstants.META_INDEX);
    }

    /**
     * Evaluates if the page has a logo.
     * @return true if there are elements found
     * with the CSS of the logo.
     */
    public static boolean hasLogo() {
        return hasCSSElement(PageConstants.BRAND_LOGO_CSS);
    }

    /**
     * Evaluates if the page has a video.
     * @return true if there are elements found
     * with the CSS of the video.
     */
    public static boolean hasVideo() {
        return hasCSSElement(PageConstants.BRAND_VIDEO_CSS);
    }

    /**
     * Evaluates if the page is identified either
     * by a Logo or a Video.
     * @return true if the BrandPage has Logo or
     * Video.
     */
    public static boolean isIdentified() {
        return hasLogo() || hasVideo();
    }

    public static boolean hasAltTag() {
        return hasCSSElement(PageConstants.BRAND_ALT_TAG_CSS);
    }

    /**
     * Evaluates if the page is identified either
     * by a Placeholder
     * @return true if the BrandPage Placeholder
     * Video.
     */
    public static boolean isNaGif()
    {
        return hasXPATHElement(PageConstants.NA_IMAGE);
    }
}

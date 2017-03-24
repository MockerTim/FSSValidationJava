package com.famous_smoke.automation.pageobjects;

/**
 * <p>Contains the filter values that the Page
 * Objects use to find the WebElements.</p>
 */
public final class PageConstants {

    public static final String ATTRIBUTE_CONTENT     = "content";
    public static final String ATTRIBUTE_HREF        = "href";
    public static final String ATTRIBUTE_SRC         = "src";
    public static final String ATTRIBUTE_ALT         = "alt";

    public static final String META_DESCRIPTION_NAME = "description";
    public static final String BREADCRUMBS_CSS       = ".breadcrumb";
    public static final String PROMO_FORM_NAME       = "emailcollection";
    public static final String PROMO_CLOSE_LINK_CSS  = ".closebutton.trackEvent";
    public static final String BREADCRUMBS_LINKS_CSS = ".link";
    public static final String CANONICAL_XPATH       = "//link[@rel='canonical']";
    public static final String BRAND_HEADER1_CSS     = ".title.oswald";
    public static final String BRAND_DESCRIPTION_CSS = "p[itemprop='description']";
    public static final String BRAND_LOGO_CSS        = ".full.nopad";
    public static final String BRAND_VIDEO_CSS       = ".minivideo";
    public static final String BRAND_ITEM_BOX_CSS    = ".brandnewbox";
    public static final String BRAND_ITEM_LINK_CSS   = ".brandtitle";
    public static final String BRAND_ALT_TAG_CSS     = "div.brandtop div.brandband img";
    public static final String META_INDEX            = ".//meta[@name='robots']";

    public static final String ITEM_HEADER1_CSS      = "input[name='product_id-div']:checked + div.ic .title.oswald";
    public static final String ITEM_PRICING_CSS      = "input[name='product_id-div']:checked + div.ic .subtitle.oswald.cblack.itemprice";
    public static final String ITEM_SPECS_CSS        = ".itemspecs.spacer.cdkgray";
    public static final String ITEM_SPECS_TEXT_CSS   = ".left";
    public static final String ITEM_DESCRIPTION_CSS  = ".p-copy";
    public static final String ITEM_RATING_CSS       = ".badge";
    public static final String ITEM_IMAGE_CSS        = ".mainimg.imgzoom";
    public static final String ITEM_VIDEO_CSS        = ".minivideo";
    public static final String ITEM_ALT_TAG_CSS      = "div.pagecore.home div div.flexrow.ic:nth-of-type(1) div.flexitembox.tac.nopad img";

    public static final String CATEGORIES_BRANDS_CSS = ".brand";

    public static final String PAGE_HEADER_CSS       = ".pagebar";

    //Added by drew as na.gif validator
    //deleted @itemprop
    public static final String NA_IMAGE = "//div[@class = 'brandband']/img[contains(@src,'na.gif')]";

    private PageConstants() {
        //not called
    }
}

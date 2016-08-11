package test.java.com.famous_smoke.automation.data;

/**
 * <p>The Data representation of the BrandPage
 * Page Object.</p>
 *
 * <p>It extends the BasePagaData class, and
 * its constructor requires a BrasePageData
 * instance.</p>
 */
public class BrandPageData extends BasePageData {

    public static final String HEADER1_FIELD_NAME     = "HEADER 1";
    public static final String DESCRIPTION_FIELD_NAME = "SEO PARAGRAPH";
    public static final String IDENTIFIED_FIELD_NAME  = "IDENTIFIED";
    public static final String IDENTIFIED_REVIEW_COUNT= "REVIEW COUNT";
    public static final String IDENTIFIED_REVIEW_LINK ="REVIEW PAGE LINK";

    private final String header1;
    private final String description;
    private final String reviewCount;
    private final String reviewLink;
    private final Boolean identified;
    private final Boolean naGif;

    public BrandPageData(final BasePageData basePageData,
                         final String header1,
                         final String description,
                         final String reviewCount,
                         final String reviewLink,
                         final Boolean identified,
                         final Boolean naGif) {
        super(
                basePageData.getURL(),
                basePageData.getCanonical(),
                basePageData.getTitle(),
                basePageData.getMetaDescription(),
                basePageData.getBreadcrumbsText(),
                basePageData.getBreadcrumbsLinks()
        );
        this.header1 = header1;
        this.description = description;
        this.reviewCount=reviewCount;
        this.reviewLink=reviewLink;
        this.identified = identified;
        this.naGif = naGif;
    }

    public String getHeader1() {
        return header1;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getIdentified() {
        return identified;
    }

    public Boolean getNaGif() {
        return naGif;
    }
    
    public String getReviewCount() {
        return reviewCount;
    }
    
    public String getReviewLink() {
        return reviewLink;
    }
}

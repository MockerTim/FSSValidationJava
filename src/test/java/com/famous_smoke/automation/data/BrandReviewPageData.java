package test.java.com.famous_smoke.automation.data;

public class BrandReviewPageData extends BasePageData {

    public static final String HEADER1_FIELD_NAME     = "HEADER 1";
   /* public static final String DESCRIPTION_FIELD_NAME = "SEO PARAGRAPH";
    public static final String IDENTIFIED_FIELD_NAME  = "IDENTIFIED";
    public static final String IDENTIFIED_REVIEW_COUNT= "REVIEW COUNT";*/

    private final String header1;
    //private final String description;
    //private final String reviewCount;
    //private final Boolean identified;
    //private final Boolean naGif;

    public BrandReviewPageData(final BasePageData basePageData,
                         final String header1
                         //final String description,
                         //final String reviewCount,
                         //final Boolean identified,
                         //final Boolean naGif
                         ) {
        super(
                basePageData.getURL(),
                basePageData.getCanonical(),
                basePageData.getTitle(),
                basePageData.getMetaDescription(),
                basePageData.getBreadcrumbsText(),
                basePageData.getBreadcrumbsLinks()
        );
        this.header1 = header1;
        //this.description = description;
       // this.reviewCount=reviewCount;
        //this.identified = identified;
        //this.naGif = naGif;
    }

    public String getHeader1() {
        return header1;
    }

    /*public String getDescription() {
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
    } */
}

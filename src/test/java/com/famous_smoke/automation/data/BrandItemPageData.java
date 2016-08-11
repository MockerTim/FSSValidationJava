package test.java.com.famous_smoke.automation.data;

//import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Collection;
import java.util.List;

/**
 * Created by drew on 15-02-2016.
 */
public class BrandItemPageData extends BasePageData {

    public final static String HEADER1_FIELD_NAME     = "HEADER ONE";
    public final static String DESCRIPTION_FIELD_NAME = "SEO PARAGRAPH";
    public final static String SPECS_FIELD_NAME       = "SPECS";
    public final static String PRICING_FIELD_NAME     = "PRICING";
    public final static String RATING_FIELD_NAME      = "USER RATINGS";
    public final static String IDENTIFIED_FIELD_NAME  = "IDENTIFIED";

    private final String header1;
    private final String description;
    private final Collection<String> specs;
    private final String pricing;
    private final String rating;
    private final Boolean identified;
    private final Boolean naGif;

    public BrandItemPageData(final BasePageData basePageData,
                             final String header1,
                             final String description,
                             final Collection<String> specs,
                             final String pricing,
                             final String rating,
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
        this.specs = specs;
        this.pricing = pricing;
        this.rating = rating;
        this.identified = identified;
        this.naGif = naGif;
    }

    public String getHeader1() {
        return header1;
    }

    public String getDescription() {
        return description;
    }

    public Collection<String> getSpecs() {
        return specs;
    }

    public String getPricing() {
        return pricing;
    }

    public String getRating() {
        return rating;
    }

    public Boolean getIdentified() {
        return identified;
    }

    public Boolean getNaGif() {
        return naGif;
    }
}

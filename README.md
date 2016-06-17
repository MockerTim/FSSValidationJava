cucumberjvm-selenium-pageObject
=====================

Page Object Framework using cucumber jvm (java) and Selenium java.<br><br><br>

http://morty.fam***-*****.com:8585<br><br><br>

Brand_Setup - Generates information from website brand pages and extracts it to xlsx spreadsheet <br>
Item_Setup - Generates information from website brand and item pages and extracts to xlsx spreadsheet. <br><br>

The following is data driven:<br><br>

Brands_ActionValidation - Feature: In every Page all breadcrumbs must go to correct links  [https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageBreadcrumbs.template]<br>
Items_ActionValidation - Feature: In every Page all breadcrumbs must go to correct links  [https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageBreadcrumbs.template]<br>

Items_SEO1 - Feature: The breadcrumbs of all the Pages should match the .xlsx which was generated by Items_Setup [https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageValidBreadcrumbs.template]<br>
Brands_SEO1 - Feature: The breadcrumbs of all the Pages should match the .xlsx which was generated by Brands_Setup [https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageValidBreadcrumbs.template]<br>
Items_SEO1 - Feature: The Canonical URL of all the Pages should match the .xlsx which was generated by Items_Setup [https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageValidCanonical.template]<br>
Brands_SEO1 - Feature: The Canonical URL of all the Pages should match the .xlsx which was generated by Brands_Setup [https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageValidCanonical.template]<br>
Items_SEO1 - Feature: The title of all pages should match the .xlsx which was generated by Items_Setup [ https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageValidTitle.template ]<br>
Brands_SEO1 - Feature: The title of all pages should match the .xlsx which was generated by Brands_Setup [ https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageValidTitle.template ]<br>
Brands_SEO1 - Feature: The brand group pages has an SEO paragraph matching the .xlsx which was generated by Brands_Setup [https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/brands/BrandGroupValidCopy.template]<br>
Brands_SEO1 - Feature: The brand group pages have an H1 tag that matches the .xlsx generated by Brands_Setup [ https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/brands/BrandGroupValidHeaderOne.template]<br><br>

Items_SEO2 - Feature: The MetaDescription of all pages should match the .xlsx which was generated by Items_Setup [https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageValidMetaDescription.template]<br>
Brands_SEO2 - Feature: The MetaDescription of all pages should match the .xlsx which was generated by Brands_Setup [https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageValidMetaDescription.template]<br>
Items_SEO2 - Feature: The Meta Description length of all pages is between 1 and 185 characters. [https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageValidMetaDescriptionLength.template]<br>
Brands_SEO2 - Feature: The Meta Description length of all pages is between 1 and 185 characters. [https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageValidMetaDescriptionLength.template]<br>
Items_SEO2 - Feature:  The title length of all pages should be under 70 characters. [ https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageValidTitleLength.template ]<br>
Brands_SEO2 - Feature:  The title length of all pages should be under 70 characters. [ https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/base/PageValidTitleLength.template ]<br><br>


Brands_Validation - Feature: The brand pages should have a visible logo or video.<br> [https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/brands/BrandValidLogoOrVideo.template]<br>
Items_Validation - Feature: The item pages should have a visible logo or video. [https://github.com/drewbroc/FSSValidationJava/blob/master/src/test/resources/features-templates/items/ItemValidLogoOrVideo.template]
<br>




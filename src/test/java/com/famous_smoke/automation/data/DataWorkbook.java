package test.java.com.famous_smoke.automation.data;

import test.java.com.famous_smoke.automation.util.TestConfigReader;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>Handles the interaction with the TestData Workbook.</p>
 */
public final class DataWorkbook {

    /**
     * The Singleton representing the TestData Workbook
     * configured in the TestConfig.propertiesfile.
     */
    private static final DataWorkbook TESTDATA_WORKBOOK  = new DataWorkbook(TestConfigReader.getTestDataWorkbookPath());

    private static final String COLLECTION_SEPARATOR = ",";

    /**
     * The name of the sheet with the BrandPageData
     * information.
     *
     * This sheet has to exist in the XLSX even if
     * it's blank.
     */
    private static final String BRANDPAGEDATA_SHEET_NAME = "BrandPageData";

    /**
     * The name of the sheet with the BrandItemPageData
     * information.
     *
     * This sheet has to exist in the XLSX even if
     * it's blank.
     */
    private static final String BRANDITEMPAGEDATA_SHEET_NAME = "BrandItemPageData";
   
    /**
    * The name of the sheet with the BrandItemPageData
    * information.
    *
    * This sheet has to exist in the XLSX even if
    * it's blank.
    */
    
    private static final String BRANDREVIEWPAGEDATA_SHEET_NAME = "BrandReviewPageData";
    
    private static final String BRANDITEMREVIEWPAGEDATA_SHEET_NAME="BrandItemReviewPagaData";
    
    private static final int HEADER_ROW = 0;
    
    /**
     * The header row information for the BrandPage
     * Data Sheet.
     */ 
    private static final String BRAND_URL_HEADER               = BrandPageData.URL_FIELD_NAME;
    private static final String BRAND_CANONICAL_HEADER         = BrandPageData.CANONICAL_FIELD_NAME;
    private static final String BRAND_TITLE_HEADER             = BrandPageData.TITLE_FIELD_NAME;
    private static final String BRAND_META_DESCRIPTION_HEADER  = BrandPageData.METADESCRIPTION_FIELD_NAME;
    private static final String BRAND_HEADER1_HEADER           = BrandPageData.HEADER1_FIELD_NAME;
    private static final String BRAND_DESCRIPTION_HEADER       = BrandPageData.DESCRIPTION_FIELD_NAME;
    private static final String BRAND_BREADCRUMBS_TEXT_HEADER  = BrandPageData.BREADCRUMBS_TEXT_FIELD_NAME;
    private static final String BRAND_BREADCRUMBS_LINKS_HEADER = BrandPageData.BREADCRUMBS_LINKS_FIELD_NAME;
    private static final String BRAND_IDENTIFIED_HEADER        = BrandPageData.IDENTIFIED_FIELD_NAME;
    private static final String BRAND_REVIEW_COUNT             = BrandPageData.IDENTIFIED_REVIEW_COUNT;
    private static final String BRAND_REVIEW_LINK              = BrandPageData.IDENTIFIED_REVIEW_LINK;
    
    
    
    /**
     * The header row information for the BrandReviewPage
     * Data Sheet.
     */
    private static final String BRANDREVIEW_URL_HEADER               = BrandReviewPageData.URL_FIELD_NAME;
    private static final String BRANDREVIEW_CANONICAL_HEADER         = BrandReviewPageData.CANONICAL_FIELD_NAME;
    private static final String BRANDREVIEW_TITLE_HEADER             = BrandReviewPageData.TITLE_FIELD_NAME;
    private static final String BRANDREVIEW_META_DESCRIPTION_HEADER  = BrandReviewPageData.METADESCRIPTION_FIELD_NAME;
    private static final String BRANDREVIEW_HEADER1_HEADER           = BrandReviewPageData.HEADER1_FIELD_NAME;
    private static final String BRANDREVIEW_BREADCRUMBS_TEXT_HEADER  = BrandReviewPageData.BREADCRUMBS_TEXT_FIELD_NAME;
    private static final String BRANDREVIEW_BREADCRUMBS_LINKS_HEADER = BrandReviewPageData.BREADCRUMBS_LINKS_FIELD_NAME;
    

    /**
     * The header row information for the BrandItemPage
     * Data Sheet.
     */
    private static final String ITEM_URL_HEADER               = BrandItemPageData.URL_FIELD_NAME;
    private static final String ITEM_CANONICAL_HEADER         = BrandItemPageData.CANONICAL_FIELD_NAME;
    private static final String ITEM_TITLE_HEADER             = BrandItemPageData.TITLE_FIELD_NAME;
    private static final String ITEM_META_DESCRIPTION_HEADER  = BrandItemPageData.METADESCRIPTION_FIELD_NAME;
    private static final String ITEM_HEADER1_HEADER           = BrandItemPageData.HEADER1_FIELD_NAME;
    private static final String ITEM_DESCRIPTION_HEADER       = BrandItemPageData.DESCRIPTION_FIELD_NAME;
    private static final String ITEM_BREADCRUMBS_TEXT_HEADER  = BrandItemPageData.BREADCRUMBS_TEXT_FIELD_NAME;
    private static final String ITEM_BREADCRUMBS_LINKS_HEADER = BrandItemPageData.BREADCRUMBS_LINKS_FIELD_NAME;
    private static final String ITEM_SPECS_HEADER             = BrandItemPageData.SPECS_FIELD_NAME;
    private static final String ITEM_PRICING_HEADER           = BrandItemPageData.PRICING_FIELD_NAME;
    private static final String ITEM_RATING_HEADER            = BrandItemPageData.RATING_FIELD_NAME;
    private static final String ITEM_IDENTIFIED_HEADER        = BrandItemPageData.IDENTIFIED_FIELD_NAME;
    
    /**
     * The column placements of the BrandPageData elements
     * in the XLSX sheet.
     */
    private static final int BRAND_URL_COLUMN               = 0;
    private static final int BRAND_CANONICAL_COLUMN         = 1;
    private static final int BRAND_TITLE_COLUMN             = 2;
    private static final int BRAND_META_DESCRIPTION_COLUMN  = 3;
    private static final int BRAND_HEADER1_COLUMN           = 4;
    private static final int BRAND_DESCRIPTION_COLUMN       = 5;
    private static final int BRAND_BREADCRUMBS_TEXT_COLUMN  = 6;
    private static final int BRAND_BREADCRUMBS_LINKS_COLUMN = 7;
    private static final int BRAND_IDENTIFIED_COLUMN        = 8;
    private static final int BRAND_REVIEW_COUNT_COLUMN      = 9;
    private static final int BRAND_REVIEW_LINK_COLUMN       =10;
    private static final int BRAND_NAGIF_COLUMN             = 11;

    private static final int ITEM_URL_COLUMN               = 0;
    private static final int ITEM_CANONICAL_COLUMN         = 1;
    private static final int ITEM_TITLE_COLUMN             = 2;
    private static final int ITEM_META_DESCRIPTION_COLUMN  = 3;
    private static final int ITEM_HEADER1_COLUMN           = 4;
    private static final int ITEM_DESCRIPTION_COLUMN       = 5;
    private static final int ITEM_BREADCRUMBS_TEXT_COLUMN  = 6;
    private static final int ITEM_BREADCRUMBS_LINKS_COLUMN = 7;
    private static final int ITEM_SPECS_COLUMN             = 8;
    private static final int ITEM_PRICING_COLUMN           = 9;
    private static final int ITEM_RATING_COLUMN            = 10;
    private static final int ITEM_IDENTIFIED_COLUMN        = 11;
    private static final int ITEM_NAGIF_COLUMN             = 12;

    private static final int BRANDREVIEW_URL_COLUMN               = 0;
    private static final int BRANDREVIEW_CANONICAL_COLUMN         = 1;
    private static final int BRANDREVIEW_TITLE_COLUMN             = 2;
    private static final int BRANDREVIEW_META_DESCRIPTION_COLUMN  = 3;
    private static final int BRANDREVIEW_HEADER1_COLUMN           = 4;
    private static final int BRANDREVIEW_BREADCRUMBS_TEXT_COLUMN  = 5;
    private static final int BRANDREVIEW_BREADCRUMBS_LINKS_COLUMN = 6;
    /**
     * The location of the XLSX File.
     */
    private final String location;

    /**
     * This constructor is only accessed privately
     * by the Singleton.
     * @param location the XLSX File location.
     */
    private DataWorkbook(final String location) {
        this.location = location;
    }

    /**
     * The static accesor to the TestData Workbook
     * Singleton.
     * @return the DataWorkbook singleton.
     */
    public static DataWorkbook getTestDataWorkbook() {
        return TESTDATA_WORKBOOK;
    }
    
    
    /**
     * Writes the Collection of BrandPageData in the
     * BrandPageData as a table.
     *
     * The elements of the BrandPageData objects are
     * placed in specific columns of the table, this
     * is determined by a DataMap which pairs each
     * element with a column.
     *
     * If the BrandPageData Sheet already exists, it
     * is overwritten with only the values passed as
     * parameters.
     * @param datas the Collection of BrandPageData
     *              to write.
     * @return the current DataWorkbook object,
     * this allows chained calls.
     * @throws IOException
     */
    public DataWorkbook writeBrandReviewPages(final Collection<BrandReviewPageData> datas) throws IOException {
        Workbook workbook = openWorkBook(location);
        Sheet sheet = createBrandReviewPageDataSheet(workbook);

        int row = 1;
        for (BrandReviewPageData data : datas) {
            Row brandRow = sheet.createRow(row);

            CellStyle dataStyle = createDataStyle(workbook);
            getBrandReviewDataMap(data).forEach((column, value) -> {
                Cell cell = createCell(brandRow, column, dataStyle);
                cell.setCellValue(value);
                sheet.autoSizeColumn(cell.getColumnIndex());
            });

            ++row;
        }

        writeWorkBook(workbook, location);
        workbook.close();
        return this;
    }

    /**
     * Writes the Collection of BrandPageData in the
     * BrandPageData as a table.
     *
     * The elements of the BrandPageData objects are
     * placed in specific columns of the table, this
     * is determined by a DataMap which pairs each
     * element with a column.
     *
     * If the BrandPageData Sheet already exists, it
     * is overwritten with only the values passed as
     * parameters.
     * @param datas the Collection of BrandPageData
     *              to write.
     * @return the current DataWorkbook object,
     * this allows chained calls.
     * @throws IOException
     */
    public DataWorkbook writeBrandPages(final Collection<BrandPageData> datas) throws IOException {
        Workbook workbook = openWorkBook(location);
        Sheet sheet = createBrandPageDataSheet(workbook);

        int row = 1;
        for (BrandPageData data : datas) {
            Row brandRow = sheet.createRow(row);

            CellStyle dataStyle = createDataStyle(workbook);
            getBrandDataMap(data).forEach((column, value) -> {
                Cell cell = createCell(brandRow, column, dataStyle);
                cell.setCellValue(value);
                sheet.autoSizeColumn(cell.getColumnIndex());
            });

            ++row;
        }

        writeWorkBook(workbook, location);
        workbook.close();
        return this;
    }
    
    
    

    
    
    /**
     * Writes the Collection of the BrandItemPageData
     * as a table.
     *
     * The elements of the BrandItemPageData objects
     * are placed in specific columns of the table,
     * this is determined by a DataMap which pairs
     * each element with a column.
     *
     * If the BrandItemPageData Sheet already exists,
     * it is overwritten with only the values passed
     * as parameters.
     * @param datas the Collection of BrandItemPageData
     *              to write.
     * @return the current DataWorkbook object,
     * this allows chained calls.
     * @throws IOException
     */
    public DataWorkbook writeBrandItemPages(final Collection<BrandItemPageData> datas) throws IOException {
        Workbook workbook = openWorkBook(location);
        Sheet sheet = createBrandItemPageDataSheet(workbook);

        int row = 1;
        for (BrandItemPageData data : datas) {
            Row brandRow = sheet.createRow(row);

            CellStyle dataStyle = createDataStyle(workbook);
            getBrandItemDataMap(data).forEach((column, value) -> {
                Cell cell = createCell(brandRow, column, dataStyle);
                cell.setCellValue(value);
                sheet.autoSizeColumn(cell.getColumnIndex());
            });

            ++row;
        }

        writeWorkBook(workbook, location);
        workbook.close();
        return this;
    }
    
    
    public DataWorkbook writeBrandItemReviewPages(final Collection<BrandItemReviewPageData> datas) throws IOException {
        Workbook workbook = openWorkBook(location);
        Sheet sheet = createBrandItemReviewPageDataSheet(workbook);

        int row = 1;
        for (BrandItemReviewPageData data : datas) {
            Row brandRow = sheet.createRow(row);

            CellStyle dataStyle = createDataStyle(workbook);
            getBrandItemReviewDataMap(data).forEach((column, value) -> {
                Cell cell = createCell(brandRow, column, dataStyle);
                cell.setCellValue(value);
                sheet.autoSizeColumn(cell.getColumnIndex());
            });

            ++row;
        }

        writeWorkBook(workbook, location);
        workbook.close();
        return this;
    }

    /**
     * Reads the BrandPageData table in the BrandPageData
     * Sheet, and returns the values in a Collection.
     * @return the Collection with the BrandPageData
     * in the Sheet.
     * @throws IOException
     */
    public Collection<BrandPageData> readBrandPages() throws IOException {
        HashSet<BrandPageData> brands = new HashSet<>();

        Workbook workbook = openWorkBook(location);

        Sheet sheet = getBrandPageDataSheet(workbook);
        for (int row = 1; row <= sheet.getLastRowNum(); ++row) {
            Row dataRow = sheet.getRow(row);

            String url = getCellValue(dataRow, BRAND_URL_COLUMN);
            String canonical = getCellValue(dataRow, BRAND_CANONICAL_COLUMN);
            String title = getCellValue(dataRow, BRAND_TITLE_COLUMN);
            String metaDescription = getCellValue(dataRow, BRAND_META_DESCRIPTION_COLUMN);
            String header1 = getCellValue(dataRow, BRAND_HEADER1_COLUMN);
            String description = getCellValue(dataRow, BRAND_DESCRIPTION_COLUMN);
            String breadcrumbsText = getCellValue(dataRow, BRAND_BREADCRUMBS_TEXT_COLUMN);
            String breadcrumbsLinks = getCellValue(dataRow, BRAND_BREADCRUMBS_LINKS_COLUMN);
            String identified = getCellValue(dataRow, BRAND_IDENTIFIED_COLUMN);
            String reviewCount = getCellValue(dataRow, BRAND_REVIEW_COUNT_COLUMN);
            String reviewLink = getCellValue(dataRow, BRAND_REVIEW_LINK_COLUMN);
            String naGif = getCellValue(dataRow, BRAND_NAGIF_COLUMN);

            brands.add(DataFactory.createBrandPage(
                    DataFactory.createBasePage(
                            url, title, canonical,
                            metaDescription, breadcrumbsText,
                            Arrays.asList(breadcrumbsLinks.split(COLLECTION_SEPARATOR))
                    ),
                    header1,
                    description,
                    reviewCount,
                    reviewLink,
                    Boolean.valueOf(identified),
                    Boolean.valueOf(naGif)));
        }
        return brands;
    }
    
    
    public Collection<BrandReviewPageData> readBrandReviewPages() throws IOException {
        HashSet<BrandReviewPageData> brandsReview = new HashSet<>();

        Workbook workbook = openWorkBook(location);

        Sheet sheet = getBrandReviewPageDataSheet(workbook);
        for (int row = 1; row <= sheet.getLastRowNum(); ++row) {
            Row dataRow = sheet.getRow(row);

            String url = getCellValue(dataRow, BRANDREVIEW_URL_COLUMN);
            String canonical = getCellValue(dataRow, BRANDREVIEW_CANONICAL_COLUMN);
            String title = getCellValue(dataRow, BRANDREVIEW_TITLE_COLUMN);
            String metaDescription = getCellValue(dataRow, BRANDREVIEW_META_DESCRIPTION_COLUMN);
            String header1 = getCellValue(dataRow, BRANDREVIEW_HEADER1_COLUMN);
            String breadcrumbsText = getCellValue(dataRow, BRANDREVIEW_BREADCRUMBS_TEXT_COLUMN);
            String breadcrumbsLinks = getCellValue(dataRow, BRANDREVIEW_BREADCRUMBS_LINKS_COLUMN);
            
            brandsReview.add(DataFactory.createBrandReviewPage(
                    DataFactory.createBasePage(
                            url, title, canonical,
                            metaDescription, breadcrumbsText,
                            Arrays.asList(breadcrumbsLinks.split(COLLECTION_SEPARATOR))
                    ),
                    header1));
                   
                    
                   // Boolean.valueOf(identified),
                    //Boolean.valueOf(naGif)));
        }
        return brandsReview;
    }

    public Collection<BrandItemPageData> readBrandItemPages() throws IOException {
        HashSet<BrandItemPageData> items = new HashSet<>();

        Workbook workbook = openWorkBook(location);

        Sheet sheet = getBrandItemPageDataSheet(workbook);
        for (int row = 1; row <= sheet.getLastRowNum(); ++row) {
            Row dataRow = sheet.getRow(row);

            String url = getCellValue(dataRow, ITEM_URL_COLUMN);
            String canonical = getCellValue(dataRow, ITEM_CANONICAL_COLUMN);
            String title = getCellValue(dataRow, ITEM_TITLE_COLUMN);
            String metaDescription = getCellValue(dataRow, ITEM_META_DESCRIPTION_COLUMN);
            String header1 = getCellValue(dataRow, ITEM_HEADER1_COLUMN);
            String description = getCellValue(dataRow, ITEM_DESCRIPTION_COLUMN);
            String breadcrumbsText = getCellValue(dataRow, ITEM_BREADCRUMBS_TEXT_COLUMN);
            String breadcrumbsLinks = getCellValue(dataRow, ITEM_BREADCRUMBS_LINKS_COLUMN);
            String identified = getCellValue(dataRow, ITEM_IDENTIFIED_COLUMN);
            String specs = getCellValue(dataRow, ITEM_SPECS_COLUMN);
            String pricing = getCellValue(dataRow, ITEM_PRICING_COLUMN);
            String rating = getCellValue(dataRow, ITEM_RATING_COLUMN);
            String naGif = getCellValue(dataRow, ITEM_NAGIF_COLUMN);

            items.add(DataFactory.createBrandItemPage(
                    DataFactory.createBasePage(
                            url, title, canonical,
                            metaDescription, breadcrumbsText,
                            Arrays.asList(breadcrumbsLinks.split(COLLECTION_SEPARATOR))
                    ),
                    header1,
                    description,
                    Arrays.asList(specs.split(COLLECTION_SEPARATOR)),
                    pricing,
                    rating,
                    Boolean.valueOf(identified),
                    Boolean.valueOf(naGif)));
        }
        return items;
    }
    
    
    
    public Collection<BrandItemReviewPageData> readBrandItemReviewPages() throws IOException {
        HashSet<BrandItemReviewPageData> itemsReview = new HashSet<>();

        Workbook workbook = openWorkBook(location);

        Sheet sheet = getBrandItemReviewPageDataSheet(workbook);
        for (int row = 1; row <= sheet.getLastRowNum(); ++row) {
            Row dataRow = sheet.getRow(row);

            String url = getCellValue(dataRow, ITEM_URL_COLUMN);
            String canonical = getCellValue(dataRow, ITEM_CANONICAL_COLUMN);
            String title = getCellValue(dataRow, ITEM_TITLE_COLUMN);
            String metaDescription = getCellValue(dataRow, ITEM_META_DESCRIPTION_COLUMN);
            String header1 = getCellValue(dataRow, ITEM_HEADER1_COLUMN);
            String description = getCellValue(dataRow, ITEM_DESCRIPTION_COLUMN);
            String breadcrumbsText = getCellValue(dataRow, ITEM_BREADCRUMBS_TEXT_COLUMN);
            String breadcrumbsLinks = getCellValue(dataRow, ITEM_BREADCRUMBS_LINKS_COLUMN);
            String identified = getCellValue(dataRow, ITEM_IDENTIFIED_COLUMN);
            String specs = getCellValue(dataRow, ITEM_SPECS_COLUMN);
            String pricing = getCellValue(dataRow, ITEM_PRICING_COLUMN);
            String rating = getCellValue(dataRow, ITEM_RATING_COLUMN);
            String naGif = getCellValue(dataRow, ITEM_NAGIF_COLUMN);

            itemsReview.add(DataFactory.createBrandItemReviewPage(
                    DataFactory.createBasePage(
                            url, title, canonical,
                            metaDescription, breadcrumbsText,
                            Arrays.asList(breadcrumbsLinks.split(COLLECTION_SEPARATOR))
                    ),
                    header1,
                    description,
                    Arrays.asList(specs.split(COLLECTION_SEPARATOR)),
                    pricing,
                    rating,
                    Boolean.valueOf(identified),
                    Boolean.valueOf(naGif)));
        }
        return itemsReview;
    }


    /**
     * Opens the XLSX Workbook specified in the location.
     * @param location the location of the Workbook.
     * @return the Workbook as an Apache POI object.
     * @throws IOException
     */
    private static Workbook openWorkBook(final String location) throws IOException {
        File dataFile = new File(location);
        FileInputStream inputStream = new FileInputStream(dataFile);
        return new XSSFWorkbook(inputStream);
    }

    /**
     * Writes the changes made in the workbook
     * in the specified location.
     * @param workbook the modified Workbook.
     * @param location the location of the XLSX file.
     * @return the written Workbook.
     * @throws IOException
     */
    private static Workbook writeWorkBook(final Workbook workbook,
                                   final String location) throws IOException {
        File dataFile = new File(location);
        FileOutputStream outputStream = new FileOutputStream(dataFile);
        workbook.write(outputStream);
        return workbook;
    }

    /**
     * Retrieves the BrandPageData Sheet of the given
     * Workbook.
     * @param workbook The Workbook with the information.
     * @return the BrandPageDataSheet as an Apache POI
     * object.
     */
    private static Sheet getBrandPageDataSheet(final Workbook workbook) {
        return getSheet(workbook, BRANDPAGEDATA_SHEET_NAME);
    }
    
    private static Sheet getBrandReviewPageDataSheet(final Workbook workbook) {
        return getSheet(workbook, BRANDREVIEWPAGEDATA_SHEET_NAME);
    }


    private static Sheet getBrandItemPageDataSheet(final Workbook workbook) {
        return getSheet(workbook, BRANDITEMPAGEDATA_SHEET_NAME);
    }
    
    private static Sheet getBrandItemReviewPageDataSheet(final Workbook workbook) {
        return getSheet(workbook, BRANDITEMREVIEWPAGEDATA_SHEET_NAME);
    }

    private static Sheet getSheet(final Workbook workbook,
                                  final String sheetName) {
        return workbook.getSheet(sheetName);
    }
    
    
    /**
     * Creates a new BrandReviewPageData Sheet in the Workbook,
     * if there is already a sheet, it is deleted in order
     * to create a new one.
     *
     * The Sheet is created with a Header row with the
     * identifiers of the BrandPageData columns.
     * @param workbook the Workbook where the Sheet will
     *                 be created.
     * @return the new BrandPageData Sheet as an Apache
     * POI object.
     */
    private static Sheet createBrandReviewPageDataSheet(final Workbook workbook) {
        if (getBrandReviewPageDataSheet(workbook) != null) {
            deleteSheet(workbook, getBrandReviewPageDataSheet(workbook));
        }
        Sheet sheet = workbook.createSheet(BRANDREVIEWPAGEDATA_SHEET_NAME);
        Row header = sheet.createRow(HEADER_ROW);
        CellStyle style = createHeaderStyle(workbook);

        getBrandReviewHeaderMap().forEach((column, value) -> {
            Cell cell = createCell(header, column, style);
            cell.setCellValue(value);
            sheet.autoSizeColumn(cell.getColumnIndex());
        });

        return sheet;
    }


    /**
     * Creates a new BrandPageData Sheet in the Workbook,
     * if there is already a sheet, it is deleted in order
     * to create a new one.
     *
     * The Sheet is created with a Header row with the
     * identifiers of the BrandPageData columns.
     * @param workbook the Workbook where the Sheet will
     *                 be created.
     * @return the new BrandPageData Sheet as an Apache
     * POI object.
     */
    private static Sheet createBrandPageDataSheet(final Workbook workbook) {
        if (getBrandPageDataSheet(workbook) != null) {
            deleteSheet(workbook, getBrandPageDataSheet(workbook));
        }
        Sheet sheet = workbook.createSheet(BRANDPAGEDATA_SHEET_NAME);
        Row header = sheet.createRow(HEADER_ROW);
        CellStyle style = createHeaderStyle(workbook);

        getBrandHeaderMap().forEach((column, value) -> {
            Cell cell = createCell(header, column, style);
            cell.setCellValue(value);
            sheet.autoSizeColumn(cell.getColumnIndex());
        });

        return sheet;
    }

    private static Sheet createBrandItemPageDataSheet(final Workbook workbook) {
        if (getBrandItemPageDataSheet(workbook) != null) {
            deleteSheet(workbook, getBrandItemPageDataSheet(workbook));
        }
        Sheet sheet = workbook.createSheet(BRANDITEMPAGEDATA_SHEET_NAME);
        Row header = sheet.createRow(HEADER_ROW);
        CellStyle style = createHeaderStyle(workbook);

        getBrandItemHeaderMap().forEach((column, value) -> {
            Cell cell = createCell(header, column, style);
            cell.setCellValue(value);
            sheet.autoSizeColumn(cell.getColumnIndex());
        });

        return sheet;
    }

    private static Sheet createBrandItemReviewPageDataSheet(final Workbook workbook) {
        if (getBrandItemReviewPageDataSheet(workbook) != null) {
            deleteSheet(workbook, getBrandItemReviewPageDataSheet(workbook));
        }
        Sheet sheet = workbook.createSheet(BRANDITEMREVIEWPAGEDATA_SHEET_NAME);
        Row header = sheet.createRow(HEADER_ROW);
        CellStyle style = createHeaderStyle(workbook);

        getBrandItemReviewHeaderMap().forEach((column, value) -> {
            Cell cell = createCell(header, column, style);
            cell.setCellValue(value);
            sheet.autoSizeColumn(cell.getColumnIndex());
        });

        return sheet;
    }
    /**
     * Deletes a Sheet from a Workbook.
     * @param workbook the Workbook.
     * @param sheet the Sheet to delete.
     */
    private static void deleteSheet(final Workbook workbook,
                                    final Sheet sheet) {
        workbook.removeSheetAt(workbook.getSheetIndex(sheet));
    }
    
    
    
    /**
     * Creates a map of the BrandReviewPageData Sheet
     * table headers specifying in which column
     * goes each header.
     * @return the Map with the Column and Header.
     */
    private static Map<Integer, String> getBrandReviewHeaderMap() {
        return Arrays.stream(new Object[][] {
                {BRANDREVIEW_URL_COLUMN , BRANDREVIEW_URL_HEADER },
                {BRANDREVIEW_CANONICAL_COLUMN, BRANDREVIEW_CANONICAL_HEADER},
                {BRANDREVIEW_TITLE_COLUMN , BRANDREVIEW_TITLE_HEADER},
                {BRANDREVIEW_META_DESCRIPTION_COLUMN,BRANDREVIEW_META_DESCRIPTION_HEADER},
                {BRANDREVIEW_HEADER1_COLUMN , BRANDREVIEW_HEADER1_HEADER},
                {BRANDREVIEW_BREADCRUMBS_TEXT_COLUMN, BRANDREVIEW_BREADCRUMBS_TEXT_HEADER},
                {BRANDREVIEW_BREADCRUMBS_LINKS_COLUMN, BRANDREVIEW_BREADCRUMBS_LINKS_HEADER}
                
        }).collect(Collectors.toMap(kv -> (Integer) kv[0], kv -> (String) kv[1]));
    }

    /**
     * Creates a map of the BrandPageData Sheet
     * table headers specifying in which column
     * goes each header.
     * @return the Map with the Column and Header.
     */
    private static Map<Integer, String> getBrandHeaderMap() {
        return Arrays.stream(new Object[][] {
                {BRAND_URL_COLUMN, BRAND_URL_HEADER},
                {BRAND_CANONICAL_COLUMN, BRAND_CANONICAL_HEADER},
                {BRAND_TITLE_COLUMN, BRAND_TITLE_HEADER},
                {BRAND_META_DESCRIPTION_COLUMN, BRAND_META_DESCRIPTION_HEADER},
                {BRAND_HEADER1_COLUMN, BRAND_HEADER1_HEADER},
                {BRAND_DESCRIPTION_COLUMN, BRAND_DESCRIPTION_HEADER},
                {BRAND_BREADCRUMBS_TEXT_COLUMN, BRAND_BREADCRUMBS_TEXT_HEADER},
                {BRAND_BREADCRUMBS_LINKS_COLUMN, BRAND_BREADCRUMBS_LINKS_HEADER},
                {BRAND_IDENTIFIED_COLUMN, BRAND_IDENTIFIED_HEADER},
                {BRAND_REVIEW_COUNT_COLUMN, BRAND_REVIEW_COUNT},
                {BRAND_REVIEW_LINK_COLUMN, BRAND_REVIEW_LINK}
        }).collect(Collectors.toMap(kv -> (Integer) kv[0], kv -> (String) kv[1]));
    }

    private static Map<Integer, String> getBrandItemHeaderMap() {
        return Arrays.stream(new Object[][] {
                {ITEM_URL_COLUMN, ITEM_URL_HEADER},
                {ITEM_CANONICAL_COLUMN, ITEM_CANONICAL_HEADER},
                {ITEM_TITLE_COLUMN, ITEM_TITLE_HEADER},
                {ITEM_META_DESCRIPTION_COLUMN, ITEM_META_DESCRIPTION_HEADER},
                {ITEM_HEADER1_COLUMN, ITEM_HEADER1_HEADER},
                {ITEM_DESCRIPTION_COLUMN, ITEM_DESCRIPTION_HEADER},
                {ITEM_SPECS_COLUMN, ITEM_SPECS_HEADER},
                {ITEM_PRICING_COLUMN, ITEM_PRICING_HEADER},
                {ITEM_RATING_COLUMN, ITEM_RATING_HEADER},
                {ITEM_BREADCRUMBS_TEXT_COLUMN, ITEM_BREADCRUMBS_TEXT_HEADER},
                {ITEM_BREADCRUMBS_LINKS_COLUMN, ITEM_BREADCRUMBS_LINKS_HEADER},
                {ITEM_IDENTIFIED_COLUMN, ITEM_IDENTIFIED_HEADER}
        }).collect(Collectors.toMap(kv -> (Integer) kv[0], kv -> (String) kv[1]));
    }
    
    
    private static Map<Integer, String> getBrandItemReviewHeaderMap() {
        return Arrays.stream(new Object[][] {
                {ITEM_URL_COLUMN, ITEM_URL_HEADER},
                {ITEM_CANONICAL_COLUMN, ITEM_CANONICAL_HEADER},
                {ITEM_TITLE_COLUMN, ITEM_TITLE_HEADER},
                {ITEM_META_DESCRIPTION_COLUMN, ITEM_META_DESCRIPTION_HEADER},
                {ITEM_HEADER1_COLUMN, ITEM_HEADER1_HEADER},
                {ITEM_DESCRIPTION_COLUMN, ITEM_DESCRIPTION_HEADER},
                {ITEM_SPECS_COLUMN, ITEM_SPECS_HEADER},
                {ITEM_PRICING_COLUMN, ITEM_PRICING_HEADER},
                {ITEM_RATING_COLUMN, ITEM_RATING_HEADER},
                {ITEM_BREADCRUMBS_TEXT_COLUMN, ITEM_BREADCRUMBS_TEXT_HEADER},
                {ITEM_BREADCRUMBS_LINKS_COLUMN, ITEM_BREADCRUMBS_LINKS_HEADER},
                {ITEM_IDENTIFIED_COLUMN, ITEM_IDENTIFIED_HEADER}
        }).collect(Collectors.toMap(kv -> (Integer) kv[0], kv -> (String) kv[1]));
    }
    
    
    
    /**
     * Creates a map of the BrandReviewPageData Sheet
     * table rows specifying in which column
     * goes each BrandPageData field.
     * @param data the BrandPageData instance
     * @return the Map with the Column and
     * BrandPageData fields.
     */
    private static Map<Integer, String> getBrandReviewDataMap(final BrandReviewPageData data) {
        return Arrays.stream(new Object[][] {
                {BRANDREVIEW_URL_COLUMN, data.getURL()},
                {BRANDREVIEW_CANONICAL_COLUMN, data.getCanonical()},
                {BRANDREVIEW_TITLE_COLUMN , data.getTitle()},
                {BRANDREVIEW_META_DESCRIPTION_COLUMN, data.getMetaDescription()},
                {BRANDREVIEW_HEADER1_COLUMN, data.getHeader1()},
                {BRANDREVIEW_BREADCRUMBS_TEXT_COLUMN, data.getBreadcrumbsText()},
                {BRANDREVIEW_BREADCRUMBS_LINKS_COLUMN, reduceCollectionToString(data.getBreadcrumbsLinks())}
                }).collect(Collectors.toMap(kv -> (Integer) kv[0], kv -> (String) kv[1]));
    }

    /**
     * Creates a map of the BrandPageData Sheet
     * table rows specifying in which column
     * goes each BrandPageData field.
     * @param data the BrandPageData instance
     * @return the Map with the Column and
     * BrandPageData fields.
     */
    private static Map<Integer, String> getBrandDataMap(final BrandPageData data) {
        return Arrays.stream(new Object[][] {
                {BRAND_URL_COLUMN, data.getURL()},
                {BRAND_CANONICAL_COLUMN, data.getCanonical()},
                {BRAND_TITLE_COLUMN, data.getTitle()},
                {BRAND_META_DESCRIPTION_COLUMN, data.getMetaDescription()},
                {BRAND_HEADER1_COLUMN, data.getHeader1()},
                {BRAND_DESCRIPTION_COLUMN, data.getDescription()},
                {BRAND_BREADCRUMBS_TEXT_COLUMN, data.getBreadcrumbsText()},
                {BRAND_BREADCRUMBS_LINKS_COLUMN, reduceCollectionToString(data.getBreadcrumbsLinks())},
                {BRAND_IDENTIFIED_COLUMN, data.getIdentified().toString()},
                {BRAND_REVIEW_COUNT_COLUMN,data.getReviewCount().toString()},
                {BRAND_REVIEW_LINK_COLUMN,data.getReviewLink().toString()}
        }).collect(Collectors.toMap(kv -> (Integer) kv[0], kv -> (String) kv[1]));
    }

    /**
     * Creates a map of the BrandItemPageData Sheet
     * table rows specifying in which column
     * goes each BrandItemPageData field.
     * @param data the BrandItemPageData instance
     * @return the Map with the Column and
     * BrandItemPageData fields.
     */
    private static Map<Integer, String> getBrandItemDataMap(final BrandItemPageData data) {
        return Arrays.stream(new Object[][] {
                {ITEM_URL_COLUMN, data.getURL()},
                {ITEM_CANONICAL_COLUMN, data.getCanonical()},
                {ITEM_TITLE_COLUMN, data.getTitle()},
                {ITEM_META_DESCRIPTION_COLUMN, data.getMetaDescription()},
                {ITEM_HEADER1_COLUMN, data.getHeader1()},
                {ITEM_DESCRIPTION_COLUMN, data.getDescription()},
                {ITEM_SPECS_COLUMN, reduceCollectionToString(data.getSpecs())},
                {ITEM_PRICING_COLUMN, data.getPricing()},
                {ITEM_RATING_COLUMN, data.getRating()},
                {ITEM_BREADCRUMBS_TEXT_COLUMN, data.getBreadcrumbsText()},
                {ITEM_BREADCRUMBS_LINKS_COLUMN, reduceCollectionToString(data.getBreadcrumbsLinks())},
                {ITEM_IDENTIFIED_COLUMN, data.getIdentified().toString()}
        }).collect(Collectors.toMap(kv -> (Integer) kv[0], kv -> (String) kv[1]));
    }
    
    
    
    private static Map<Integer, String> getBrandItemReviewDataMap(final BrandItemReviewPageData data) {
        return Arrays.stream(new Object[][] {
                {ITEM_URL_COLUMN, data.getURL()},
                {ITEM_CANONICAL_COLUMN, data.getCanonical()},
                {ITEM_TITLE_COLUMN, data.getTitle()},
                {ITEM_META_DESCRIPTION_COLUMN, data.getMetaDescription()},
                {ITEM_HEADER1_COLUMN, data.getHeader1()},
                {ITEM_DESCRIPTION_COLUMN, data.getDescription()},
                {ITEM_SPECS_COLUMN, reduceCollectionToString(data.getSpecs())},
                {ITEM_PRICING_COLUMN, data.getPricing()},
                {ITEM_RATING_COLUMN, data.getRating()},
                {ITEM_BREADCRUMBS_TEXT_COLUMN, data.getBreadcrumbsText()},
                {ITEM_BREADCRUMBS_LINKS_COLUMN, reduceCollectionToString(data.getBreadcrumbsLinks())},
                {ITEM_IDENTIFIED_COLUMN, data.getIdentified().toString()}
        }).collect(Collectors.toMap(kv -> (Integer) kv[0], kv -> (String) kv[1]));
    }

    /**
     * Creates the Cell Style to be applied
     * to the Header cells.
     * @param workbook the Workbook in which
     *                 the Style is going to
     *                 be created.
     * @return the Cell Style as an Apache
     * POI object.
     */
    private static CellStyle createHeaderStyle(final Workbook workbook) {
        CellStyle style = workbook.createCellStyle();
        style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        style.setAlignment(CellStyle.ALIGN_CENTER);
        style.setFillForegroundColor(HSSFColor.AQUA.index);
        style.setBorderBottom(CellStyle.BORDER_THIN);
        style.setBorderLeft(CellStyle.BORDER_THIN);
        style.setBorderTop(CellStyle.BORDER_THIN);
        style.setBorderRight(CellStyle.BORDER_THIN);
        return style;
    }

    /**
     * Creates the Cell Style to be applied
     * to the Data cells.
     * @param workbook the Workbook in which
     *                 the Style is going to
     *                 be created.
     * @return the Cell Style as an Apache
     * POI object.
     */
    private static CellStyle createDataStyle(final Workbook workbook) {
        CellStyle style = workbook.createCellStyle();
        style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        style.setBorderBottom(CellStyle.BORDER_THIN);
        style.setBorderLeft(CellStyle.BORDER_THIN);
        style.setBorderTop(CellStyle.BORDER_THIN);
        style.setBorderRight(CellStyle.BORDER_THIN);
        style.setWrapText(true);
        return style;
    }

    /**
     * Creates a new Cell in the given Row.
     * @param row the Row where the Cell is
     *            going to be placed.
     * @param column the Column where the Cell
     *               will be created.
     * @param style the Style to be applied to
     *              the Cell.
     * @return the new Cell as an Apache POI
     * object.
     */
    private static Cell createCell(final Row row, final int column, final CellStyle style){
        Cell cell = row.createCell(column);
        cell.setCellStyle(style);
        return cell;
    }

    /**
     * Retrieves the value of a Cell
     * as a String object.
     * @param row the Row where the Cell
     *            is located.
     * @param column the column of the Cell.
     * @return the String value of the Cell.
     */
    private static String getCellValue(final Row row, final int column) {
        return row.getCell(column, Row.CREATE_NULL_AS_BLANK).getStringCellValue();
    }

    /**
     * Transforms the Collection of Strings
     * to a Single String
     * @param strings the String Collection.
     * @return the reduced String with all
     * values of the collection.
     */
    private static String reduceCollectionToString(final Collection<String> strings) {
        return strings
                .stream()
                .reduce("", (a, b) -> a + COLLECTION_SEPARATOR + b)
                .replaceFirst(COLLECTION_SEPARATOR, "");
    }


}

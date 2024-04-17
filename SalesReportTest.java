import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalesReportTest {

    @Test
    public void SampleTest() {
        String[] items = {"платье1 5", "сумка32 2", "платье1 1", "сумка23 2", "сумка128 4"};
        String[] sort = {"платье1 6", "сумка128 4", "сумка23 2", "сумка32 2"};
        assertArrayEquals(sort,SalesReport.ShopOLAP(items.length,items));
    }

    @Test
    public void MyTest() {
        String[] items = {"сумка3 3", "шапка2 1", "платье1 1", "платье3 12", "шапка2 4"};
        String[] sort = {"платье3 12", "шапка2 5", "сумка3 3", "платье1 1"};
        assertArrayEquals(sort,SalesReport.ShopOLAP(items.length,items));
    }

    @Test
    public void PupsTest() {
        String[] items = {"Платье3 7", "Сумка12 9", "Платье35 2", "Платье3 7", "Сумка24 4"};
        String[] sort = {"Платье3 14", "Сумка12 9", "Сумка24 4", "Платье35 2"};
        assertArrayEquals(sort,SalesReport.ShopOLAP(items.length,items));
    }

    @Test
    public void SameItemsTest() {
        String[] items = {"Платье3 7", "Сумка12 9", "Платье32 7", "Платье23 7", "Сумка24 9", "Сумка12 9"};
        String[] sort = {"Сумка12 18", "Сумка24 9", "Платье23 7", "Платье3 7", "Платье32 7"};
        assertArrayEquals(sort,SalesReport.ShopOLAP(items.length,items));
    }

    @Test
    public void AllSamesItemsTest() {
        String[] items = {"Платье3 1", "Сумка12 9", "Платье3 7", "Платье3 3", "Сумка12 2", "Сумка12 9"};
        String[] sort = {"Сумка12 20", "Платье3 11"};
        assertArrayEquals(sort,SalesReport.ShopOLAP(items.length,items));
    }


}
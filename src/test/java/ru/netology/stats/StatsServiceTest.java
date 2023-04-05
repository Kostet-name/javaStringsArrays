package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.amountSales(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSales(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void numberMonthsSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonthSales = 5;
        int actualMinMonthSales = service.getMinMonth(sales);
        Assertions.assertEquals(expectedMinMonthSales, actualMinMonthSales);
    }

    @Test
    public void numberMonthsSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonthSales = 5;
        int actualMaxMonthSales = service.getMaxMonth(sales);
        Assertions.assertEquals(expectedMaxMonthSales, actualMaxMonthSales);
    }
}

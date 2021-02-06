package ru.netology.statistica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCalculateServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        SalesCalculateService service = new SalesCalculateService();
        long actual = service.calculateSum(sales);
        long expected = 180;
        assertEquals(expected, actual);
    }


    @Test
    void calculateAverage() {
        SalesCalculateService service = new SalesCalculateService();
        long actual = service.calculateAverage(sales);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void monthWithMaxSales() {
        SalesCalculateService service = new SalesCalculateService();
        long actual = service.monthWithMaxSales(sales);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void monthWithMinSales() {
        SalesCalculateService service = new SalesCalculateService();
        long actual = service.monthWithMinSales(sales);
        long expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void numberBelowAverage() {
        SalesCalculateService service = new SalesCalculateService();
        long actual = service.numberBelowAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void numberUpAverage() {
        SalesCalculateService service = new SalesCalculateService();
        long actual = service.numberUpAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }
}
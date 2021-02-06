package ru.netology.statistica;

public class Main {
    public static void main(String[] args) {
        SalesCalculateService service = new SalesCalculateService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long sumOfAllSales = service.calculateSum(sales);
        System.out.println(sumOfAllSales);

        long averageOfSales = service.calculateAverage(sales);
        System.out.println(averageOfSales);

        int monthMaxSales = service.monthWithMaxSales(sales);
        System.out.println(monthMaxSales);

        int monthMinSales = service.monthWithMinSales(sales);
        System.out.println(monthMinSales);

        int numberMonthsBelowAverage = service.numberBelowAverage(sales);
        System.out.println(numberMonthsBelowAverage);

        int numberMonthsUpAverage = service.numberUpAverage(sales);
        System.out.println(numberMonthsUpAverage);

        }
    }


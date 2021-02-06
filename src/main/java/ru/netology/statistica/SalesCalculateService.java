package ru.netology.statistica;

public class SalesCalculateService {

    // подсчет общей суммы продаж за все месяцы
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // расчет среднемесячной суммы продаж
    public long calculateAverage(long[] sales) {
        long length = sales.length;
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long averageSales = sum / length;
        return averageSales;
    }

    // поиск месяца с наибольшим объемом продаж
    public int monthWithMaxSales(long[] sales) {
        int month = 0;
        int monthMax = 0;
        long currentMax = sales[0];

        for (long sale : sales) {
            month = month + 1;
            if (currentMax <= sale) {
                currentMax = sale;
                monthMax = month;
            }
        }
        return monthMax;
    }

    // поиск месяца с наименьшим объемом продаж
    public int monthWithMinSales(long[] sales) {
        int month = 0;
        int monthMin = 0;
        long currentMin = sales[0];

        for (long sale : sales) {
            month = month + 1;
            if (currentMin >= sale) {
                currentMin = sale;
                monthMin = month;
            }
        }
        return monthMin;
    }


    // подсчет количества месяцев с продажами ниже среднего
    public int numberBelowAverage(long[] sales) {
        int month = 0;
        int numberMonths = 0;
        long AverageSale = calculateAverage(sales);

        for (long sale : sales) {
            month = month + 1;
            if (AverageSale > sale) {
                numberMonths = numberMonths + 1;
            }
        }
        return numberMonths;

    }

    // подсчет количества месяцев с продажами выше среднего
    public int numberUpAverage(long[] sales) {
        int month = 0;
        int numberMonths = 0;
        long AverageSale = calculateAverage(sales);

        for (long sale : sales) {
            month = month + 1;
            if (AverageSale < sale) {
                numberMonths = numberMonths + 1;
            }
        }
        return numberMonths;

    }

}






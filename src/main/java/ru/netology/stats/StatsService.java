package ru.netology.stats;

public class StatsService {

    // сумма всех продаж
    public int amountSales(int[] sales) {
        int amountSales = 0; // начальная сумма продаж
        for (int i = 0; i < sales.length; i++) {
            amountSales = amountSales + sales[i];
        }
        return amountSales;
    }

    // средняя сумма продаж в месяц
    public int averageSales(int[] sales) {
        int result = amountSales(sales) / sales.length;
        return result;
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*
    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // количество месяцев, в которых продажи были ниже среднего (см. п.2)
    public int getMinMonth(int[] sales) {
        int lotMinMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) { // значит, в рассматриваемом i-м месяце продаж меньше среднего
                lotMinMonth++;
            }
        }
        return lotMinMonth;
    }

    // количество месяцев, в которых продажи были выше среднего (см. п.2)
    public int getMaxMonth(int[] sales) {
        int lotMaxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) { // значит, в рассматриваемом i-м месяце продаж выше среднего
                lotMaxMonth++;
            }
        }
        return lotMaxMonth;
    }
}

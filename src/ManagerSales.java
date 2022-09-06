public class ManagerSales {
    protected long[] sales;

    public ManagerSales(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (max < sale) {
                max = sale;
            }
        }
        return max;
    }

    private long min() {
        long min = Long.MAX_VALUE;
        for (long sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        return min;
    }

    public long cutAverage() {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (sum - min() - max()) / (sales.length - 2);
    }

}

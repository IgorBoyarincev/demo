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
}

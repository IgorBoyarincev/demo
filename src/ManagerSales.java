public class ManagerSales {
    protected int[] sales;

    public ManagerSales(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (max < sale) {
                max = sale;
            }
        }
        return max;
    }
}

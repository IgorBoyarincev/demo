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

    private int min() {
        int min = Integer.MAX_VALUE;
        for (int sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        return min;
    }

    public int cutAverage() {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return (sum - min() - max()) / (sales.length - 2);
    }

}

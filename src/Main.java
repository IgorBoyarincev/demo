public class Main {
    public static void main(String[] args) {
        long[] sales = {40, 15, 35, 12, 4, 88, 56, 77, 23, 66};
        ManagerSales sale = new ManagerSales(sales);

        long max = sale.max();
        System.out.println(max);

        long cutAverage = sale.cutAverage();
        System.out.println(cutAverage);
    }
}

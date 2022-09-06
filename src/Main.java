public class Main {
    public static void main(String[] args) {
        int[] sales = {40, 15, 35, 12, 4, 88, 56, 77, 23, 66};
        ManagerSales sale = new ManagerSales(sales);

        int max = sale.max();
        System.out.println(max);

        int cutAverage = sale.cutAverage();
        System.out.println(cutAverage);
    }
}

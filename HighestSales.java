public class HighestSales {
    public static void main(String[] args) {
        int[] sales = {120, 340, 560, 980, 450, 230, 980};
        int maxDay = 0; 
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[maxDay]) {
                maxDay = i; 
            }
        }
        System.out.println("The highest sales were on Day " + (maxDay + 1));
    }
}
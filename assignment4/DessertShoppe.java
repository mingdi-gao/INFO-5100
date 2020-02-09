public class DessertShoppe {
    public static String ShopName = "M & M Dessert Shoppe(Stephen)";
    public static double taxRate = 0.065;
    public static int maxSizeOfItemName = 25;
    public static String maxWidth = "10";

    public static String cents2dollarsAndCents(int num) {
        double result = num / 100.00;
        return String.valueOf(result);
    }


}

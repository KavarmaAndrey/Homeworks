package kavarma;

public class ShopOnline {
    public static void main(String[] args) {
        byte number = 1;
        String product = "smartphone";
        byte days = 5;
        double allArrived = 12153.41;
        double dayArrived = allArrived / (double) days;
        double result = (double) Math.round(dayArrived * 100.0) / 100.0;
        System.out.println("Product № " + number + ": " + product + ",");
        System.out.println("total sales for " + days + " days is EUR " + allArrived + ",");
        System.out.println("sales by day is EUR " + result + ".");
        System.out.println();

        number++;
        product = "laptop";
        days = 7;
        allArrived = 10486.85;
        dayArrived = allArrived / (double) days;
        System.out.println("Product № " + number + ": " + product + ",");
        System.out.println("total sales for " + days + " days is EUR " + allArrived + ",");
        System.out.printf("sales by day is EUR %2.2f", dayArrived);
        System.out.println(".");
    }
}




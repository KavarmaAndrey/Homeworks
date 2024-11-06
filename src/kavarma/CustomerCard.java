package kavarma;

public class CustomerCard {
    public static void main(String[] args) {
        byte order = 1;
        String name = "Alice";
        String product = "smartphone";
        String currency = "EUR";
        double price = 305.99;
        String street = "Moon Street";
        int number = 10;

        System.out.println("Order № " + order + " Client: " + name + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price " + currency + " " + price);
        System.out.println("Adrress: " + street + "," + " " + number + ".");

        order++;
        name = "Tom";
        product = "laptop";
        price = 570.95;
        street = "Terra Street";
        number = 17;

        System.out.println("Order № " + order + " Client: " + name + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price " + currency + " " + price);
        System.out.println("Adrress: " + street + "," + " " + number + ".");

        order++;
        name = "Ilon";
        product = "Tesla";
        currency = "USD";
        price = 70000;
        street = "Beverly Hills";
        number = 67888;

        System.out.println("Order № " + order + " Client: " + name + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price " + currency + " " + price);
        System.out.println("Adrress: " + street + "," + " " + number + ".");
    }
}


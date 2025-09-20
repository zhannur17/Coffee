import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CoffeeMethods methods = new CoffeeMethods();
        Scanner scanner = new Scanner(System.in);


        System.out.print("Select Coffee Shop (Starbucks/Costa): ");
        String coffee_shop = scanner.nextLine().trim().toUpperCase();

        methods.ChooseCoffeeShop(coffee_shop);

        System.out.print("Choose coffee (Espresso/Latte/Cappuccino): ");
        String choice = scanner.nextLine().trim().toUpperCase();

        methods.ChooseCoffee(choice);

        methods.getCoffee().prepare();
    }
}

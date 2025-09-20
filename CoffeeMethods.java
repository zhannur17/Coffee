public class CoffeeMethods {


    private CoffeeShop factory;

    private Coffee coffee;

    public void ChooseCoffeeShop(String coffee_shop){
        switch (coffee_shop) {
            case "STARBUCKS":
                factory = new Starbucks();
                break;
            case "COSTA":
                factory = new Costa();
                break;
            default:
                System.out.println("Invalid coffee shop.");
                return;
        }
    }

    public void ChooseCoffee(String choice){
        switch (choice) {
            case "ESPRESSO":
                coffee = factory.createEspresso();
                break;
            case "LATTE":
                coffee = factory.createLatte();
                break;
            case "CAPPUCCINO":
                coffee = factory.createCappuccino();
                break;
            default:
                System.out.println("Invalid coffee type.");
                return;
        }
    }

    public Coffee getCoffee() {
        return coffee;
    }
}

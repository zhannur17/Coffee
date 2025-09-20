public class Starbucks implements CoffeeShop {
     @Override
     public Coffee createEspresso() {
         return new Espresso();
     }

     @Override
     public Coffee createLatte() {
         return new Latte();
     }

     @Override
     public Coffee createCappuccino() {
         return new Cappuccino();
     }
 }

 public class Start {
    public static void main(String[] args) {
        Burger burger1 = new Burger(); 
        burger1.setValue("Cheeseburger");
        burger1.setPrice(5.99);
        burger1.setNumberOfParties(1);
        
        Burger burger2 = new Burger(2, 7.99, "Double Cheeseburger"); 

        
        Pizza pizza1 = new Pizza(); 
        pizza1.setValue("Margherita");
        pizza1.setPrice(9.99);
        pizza1.setSize("Large");
        
        Pizza pizza2 = new Pizza("Small", 6.99, "Pepperoni"); 

        
        System.out.println("Demonstrating Burger methods:");
        System.out.println("Burger 1 Name: " + burger1.getName());
        System.out.println("Burger 1 Price: $" + burger1.getPrice());
        System.out.println("Burger 1 Patties: " + burger1.getNumberOfPraises());
        burger1.setPrice(6.49);
        System.out.println("Burger 1 New Price: $" + burger1.getPrice());
        System.out.println();

        System.out.println("Demonstrating Pizza methods:");
        System.out.println("Pizza 1 Name: " + pizza1.getName());
        System.out.println("Pizza 1 Price: $" + pizza1.getPrice());
        System.out.println("Pizza 1 Size: " + pizza1.getSize());
        pizza1.setSize("Medium");
        System.out.println("Pizza 1 New Size: " + pizza1.getSize());
        System.out.println();

        
        System.out.println("Showing details of all food items:");
        burger1.showDetails();
        burger2.showDetails();
        pizza1.showDetails();
        pizza2.showDetails();
    }
}
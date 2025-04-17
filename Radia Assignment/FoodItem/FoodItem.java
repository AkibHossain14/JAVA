public class FoodItem {
    private double price;
    private String name;

    public FoodItem() {
        this.price = 0.0;
        this.name = "Unknown";
    }

    public FoodItem(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void setPrice(double price) {
		
        this.price = price;
		
    }

    public void setValue(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void showDetails() {
        System.out.println("Food Item: " + name);
        System.out.println("Price: $" + price);
    }
}
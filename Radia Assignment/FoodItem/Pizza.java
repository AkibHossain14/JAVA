public class Pizza extends FoodItem {
    private String size;

    public Pizza() {
        super();
        this.size = "Medium";
    }

    public Pizza(String size, double price, String name) {
        super(price, name);
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    
    public void showDetails() {
        super.showDetails();
        System.out.println("Type: Pizza");
        System.out.println("Size: " + size);
        System.out.println();
    }
}

public class Burger extends FoodItem {
    private int numberOfPraises;

    public Burger() {
        super();
        this.numberOfPraises = 0;
    }

    public Burger(int numberOfPraises, double price, String name) {
        super(price, name);
        this.numberOfPraises = numberOfPraises;
    }

    public void setNumberOfParties(int numberOfPraises) {
        this.numberOfPraises = numberOfPraises;
    }

    public int getNumberOfPraises() {
        return numberOfPraises;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Type: Burger");
        System.out.println("Number of Patties: " + numberOfPraises);
        System.out.println();
    }
}
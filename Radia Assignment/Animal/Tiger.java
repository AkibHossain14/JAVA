 public class Tiger extends Animal {
    private String color;
    private double kilometerPerHour;

    public Tiger(String name, int age, String color, double kilometerPerHour) {
        super(name, age);
        this.color = color;
        this.kilometerPerHour = kilometerPerHour;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getKilometerPerHour() {
        return kilometerPerHour;
    }

    public void setKilometerPerHour(double kilometerPerHour) {
        this.kilometerPerHour = kilometerPerHour;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
        System.out.println("Speed: " + kilometerPerHour + " km/h");
        System.out.println("Type: Tiger");
        System.out.println();
    }
}
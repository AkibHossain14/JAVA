public class Vehicle {
    private String make;
    private int year;

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
    }
}
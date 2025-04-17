public class Car extends Vehicle {
    private int doors;
    private String model;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public String getModel() {
        return model;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + doors);
        System.out.println("Model: " + model);
        System.out.println("Type: Car");
        System.out.println();
    }
}
class Bus extends Vehicle {
    private int capacity;
    private boolean wheelDrive;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setWheelDrive(boolean wheelDrive) {
        this.wheelDrive = wheelDrive;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isWheelDrive() {
        return wheelDrive;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Passenger capacity: " + capacity);
        System.out.println("Four-wheel drive: " + (wheelDrive ? "Yes" : "No"));
        System.out.println("Type: Bus");
        System.out.println();
    }
}
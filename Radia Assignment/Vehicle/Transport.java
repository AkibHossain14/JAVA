public class Transport {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Toyota");
        car.setYear(2022);
        car.setDoors(4);
        car.setModel("Camry");

        Bus bus = new Bus();
        bus.setMake("Volvo");
        bus.setYear(2020);
        bus.setCapacity(50);
        bus.setWheelDrive(true);

        System.out.println("Vehicle Information:");
        System.out.println("-------------------");
        car.displayInfo();
        bus.displayInfo();
    }
}
public class Forest {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Royal Bengal", 5, "Orange with black stripes", 65.5);
        Lion lion = new Lion("African Lion", 8, 190.5, "Male");

        System.out.println("Animal Information:");
        System.out.println("------------------");
        tiger.displayInfo();
        lion.displayInfo();
    }
}
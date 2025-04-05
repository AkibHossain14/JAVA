
public class Start {
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle();
        t1.setX(3);
        t1.setY(3);
        t1.setZ(3);
        System.out.println("Triangle 1 Info:");
        t1.showInfo();
        t1.testTriangle();

       
        Triangle t2 = new Triangle(4, 4, 5);
        System.out.println("\nTriangle 2 Info:");
        t2.showInfo();
        t2.testTriangle();
    }
}


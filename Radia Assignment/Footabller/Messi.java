public class Messi extends Footballer {
    private int age;
    private double weight;

    public Messi() {
        super();
        this.age = 0;
        this.weight = 0.0;
    }

    public Messi(int age, double weight, String name, String nation) {
        super(name, nation);
        this.age = age;
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    
    public void show() {
        super.show(); // Calls Footballer's show() first
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
    }
}

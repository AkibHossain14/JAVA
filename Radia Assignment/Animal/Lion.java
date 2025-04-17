public class Lion extends Animal {
    private double weight;
    private String gender;

    public Lion(String name, int age, double weight, String gender) {
        super(name, age);
        this.weight = weight;
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Gender: " + gender);
        System.out.println("Type: Lion");
        System.out.println();
    }
}
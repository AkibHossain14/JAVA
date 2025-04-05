
public class Start {
    public static void main(String[] args) {
       
        Student s1 = new Student();
        s1.setName("Akib");
        s1.setId("CSE123");
        s1.setDepartment("CSE");
        s1.setCgpa(3.75f);
        System.out.println("Student 1 Info:");
        s1.showInfo();

        
        Student s2 = new Student("Maisha", "CSE124", "CSE", 3.90f);
        System.out.println("\nStudent 2 Info:");
        s2.showInfo();
    }
}

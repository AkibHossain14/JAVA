
public class Start {
    public static void main(String[] args) {
      
        Contact c1 = new Contact();
        c1.setPersonName("Akib");
        c1.setPersonId("C123");
        c1.setAge(22);
        c1.setMobileNumber("01712345678");
        c1.setGender('M');

    
        Contact c2 = new Contact("Maisha", "C124", 21, "01887654321", 'F');
        Contact c3 = new Contact("Rahim", "C125", 25, "01656789012", 'M');
        Contact c4 = new Contact("Karim", "C126", 30, "01923456789", 'M');

    
        System.out.println("Contact 1:");
        c1.showDetails();
        c1.showOperator();

        System.out.println("\nContact 2:");
        c2.showDetails();
        c2.showOperator();

        System.out.println("\nContact 3:");
        c3.showDetails();
        c3.showOperator();

        System.out.println("\nContact 4:");
        c4.showDetails();
        c4.showOperator();
    }
}

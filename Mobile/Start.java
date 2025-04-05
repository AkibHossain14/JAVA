public class Start {
    public static void main(String[] args) {
       
        Mobile m1 = new Mobile("Akib", "01712345678", 100.0, "Android", false);
        Mobile m2 = new Mobile("Maisha", "01887654321", 50.0, "iOS", true);
        Mobile m3 = new Mobile("Rahim", "01656789012", 200.0, "Android", false);
        Mobile m4 = new Mobile("Karim", "01923456789", 300.0, "iOS", true);

        
        System.out.println("Mobile 1:");
        m1.showDetails();
        m1.recharge(50);
        m1.adjustAfterCall(5, 2);

        System.out.println("\nMobile 2:");
        m2.showDetails(); 
        m2.recharge(100); 

        System.out.println("\nMobile 3:");
        m3.showDetails();
        m3.adjustAfterCall(10, 3); 

        System.out.println("\nMobile 4:");
        m4.showDetails(); 
    }
}

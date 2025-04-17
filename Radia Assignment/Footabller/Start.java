public class Start {
    public static void main(String[] args) {
        Footballer player1 = new Footballer("Ronaldo", "Portugal");
        System.out.println("Footballer show():");
        player1.show();
        System.out.println();

        Messi player2 = new Messi(36, 70.5, "Messi", "Argentina");
        System.out.println("Messi show():");
        player2.show();
    }
}
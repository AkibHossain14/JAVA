public class Footballer {
    private String name;
    private String nation;

    public Footballer() {
        this.name = "Unknown";
        this.nation = "Unknown";
    }

    public Footballer(String name, String nation) {
        this.name = name;
        this.nation = nation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public String getNation() {  
        return nation;
    }
	public void show() {
        System.out.println("Player Information:");
        System.out.println("Name: " + name);
        System.out.println("Nation: " + nation);
    }
}
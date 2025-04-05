
public class Student {
    private String name;
    private String id;
    private String department;
    private float cgpa;

   
    public Student() {}

    
    public Student(String name, String id, String department, float cgpa) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.cgpa = cgpa;
    }

    
    public void setName(String name) {
		this.name = name; }
	public String getName() { 
	    return name; }
    public void setId(String id) { 
	    this.id = id; }
	public String getId() {
		return id; }
    public void setDepartment(String department) { 
	    this.department = department; }
	public String getDepartment() {
		return department; }
    public void setCgpa(float cgpa) { 
	    this.cgpa = cgpa; }
    public float getCgpa() { 
	    return cgpa; }



    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
    }
}

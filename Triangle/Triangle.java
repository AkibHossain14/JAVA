
public class Triangle {
    private int x;
    private int y;
    private int z;

  
    public Triangle() {}


    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void setX(int x) { 
	    this.x = x; }
	public int getX() {
		return x; }
    public void setY(int y) { 
	    this.y = y; }
	public int getY() { 
	    return y; }
    public void setZ(int z) { 
	    this.z = z; }
    public int getZ() { 
	    return z; }


    public void showInfo() {
        System.out.println("Side X: " + x);
        System.out.println("Side Y: " + y);
        System.out.println("Side Z: " + z);
    }


    public void testTriangle() {
        if (x == y && y == z) {
            System.out.println("This is an Equilateral Triangle.");
        } else if (x == y || y == z || x == z) {
            System.out.println("This is an Isosceles Triangle.");
        } else {
            System.out.println("This is a Scalene Triangle.");
        }
    }
}

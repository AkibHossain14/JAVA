public class AirTransporter{
	
	
	private String manufacturer;
	private double maxAltitude;
	private double maxSpeed ;
	
	public AirTransporter() {} 
	public AirTransporter(String manufacturer,double maxAltitude ,double maxSpeed) {
		setManufacturer(manufacturer);
		setMaxAltitude(maxAltitude);
		setMaxSpeed(maxSpeed);
		
		
	} 
	public void setManufacturer ( String manufacturer ) {
	if ( manufacturer.length()>2 ) {
		this.manufacturer = manufacturer ;
	}
	else {
		System.out.println ("invalid manufacturer company ");
	}
	}
	
	public String getManufacturer () { return manufacturer ;}
	
	
	public void setMaxAltitude (double maxAltitude ) {
		if ( maxAltitude>0 ) {
			this.maxAltitude= maxAltitude ;
		}
		else {
			System.out.println("invalid max altitude");
		}
	}
	
	public double getMaxAltitude () { return maxAltitude;}
	
	public void setMaxSpeed (double maxSpeed){
		if ( maxSpeed > 0 ) {
			this.maxSpeed =maxSpeed ; 
		}
		else {
			System.out.println ("invalid max speed ");
		}
	}
	
	public double getMaxSpeed() { return maxSpeed;}
	
	public void showDetails() {
		System.out.println("Air Transporter Details ");
		System.out.println("Manufacturer: " + getManufacturer());
		System.out.println("Maximum Altitude : " + getMaxAltitude()+"ft");
		System.out.println("MAximum Speed: " + getMaxSpeed() +"KM/Hr");
	}
	
	
	
	
	
	
}
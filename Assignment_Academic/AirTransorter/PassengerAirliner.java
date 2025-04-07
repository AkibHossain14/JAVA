public class PassengerAirliner extends AirTransporter{
	
	private int passengerCapacity ;
	
	public PassengerAirliner ( String manufacturer , double maxAltitude, double maxSpeed , int passengerCapacity){
		super ( manufacturer , maxAltitude , maxSpeed ) ;
		setPassengerCapacity(passengerCapacity);
	}
	
	
	public void setPassengerCapacity(int passengerCapacity ){
    if (passengerCapacity>0 ) {
	this.passengerCapacity = passengerCapacity; }
    else {
        System.out.println ( "invalid passenger capacity");
	   }
	}	
	
	public int getPassengerCapacity ( ) { return passengerCapacity ; }
	public void showDetails () {
		super.showDetails() ;
		System.out.println( "passenger capacity :" + getPassengerCapacity());
	}
}
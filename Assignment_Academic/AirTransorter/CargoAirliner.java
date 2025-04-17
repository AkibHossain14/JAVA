public class CargoAirliner extends AirTransporter{
	private int maxCargoWeight ; 
	
	public CargoAirliner(){} ;
	public CargoAirliner( String manufacturer , double maxAltitude , double maxSpeed, int maxCargoWeight ) {
		super (manufacturer,maxAltitude,maxSpeed ) ;
		
		setmaxCargoWeight(maxCargoWeight);
	}
	
	public void setmaxCargoWeight ( int maxCargoWeight) {
		if ( maxCargoWeight>0 ) {
			this.maxCargoWeight= maxCargoWeight ; 
		}
		else {
			System.out.println( "invalid cargo weight ");
		}
	}
	
	public int getmaxCargoWeight() { return maxCargoWeight;}
	public void showDetails () {
		super.showDetails() ;
		System.out.println ("max weight capacity:" + getmaxCargoWeight());
	}




	
}

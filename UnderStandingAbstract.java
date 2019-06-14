abstract class Vehicle{
	int a=9;
	public abstract int hasWheels();
}
class Bike extends Vehicle{
	public int  hasWheels(){
		return 2;
	} 
}
class Truck extends Vehicle{
	public int  hasWheels(){
		return 8;
	}
}
public class UnderStandingAbstract {
	 public static void main(String[] args) {
     Vehicle bike=new Bike();
     System.out.println("Bike has "+bike.hasWheels()+" Wheels   ");
     Vehicle truck=new Truck();
     System.out.println("Truck has "+truck.hasWheels()+" Wheels");}
}

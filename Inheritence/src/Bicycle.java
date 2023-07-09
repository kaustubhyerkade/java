//base
public class Bicycle {
public int gear;
public int speed;

public Bicycle(int gear, int speed) {
	super();
	this.gear = gear;
	this.speed = speed;
}


public void applyBreak(int decrement){
	speed-= decrement;
	
}

public void speedUp(int decrement){
	
	speed+=decrement;
}
	
public String toString(){
	
	return("No of gear"+gear+"\n"+"Speed of bike is"+speed);
}
}

class MountainBike extends Bicycle{
	public int seatHeight;

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}
	
	public void setHeight(int newValue){
		seatHeight = newValue;
	}
	
	public String toString(){
	return(super.toString()+"\nseat height is "+seatHeight);
	}

}




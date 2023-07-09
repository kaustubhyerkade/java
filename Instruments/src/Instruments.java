public abstract interface Instruments {
	
	public abstract void play();
	
}

abstract interface Piano extends Instruments
{
	System.out.println("tun tun tun");
}

abstract interface Flute extends Instruments
{

	System.out.rintln("Toot toot toot ");	

}

abstract interface Guitar extends Instruments
{
	System.out.rintln("Tin tin tin ");

}
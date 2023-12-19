package polymorphism;

public class Bicycle
{
	// the Bicycle class has three fields
	private int cadence;
	private int gear;
	private int speed;

	// the Bicycle class has one constructor
	public Bicycle(int startCadence, int startSpeed, int startGear)
	{
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	public int getCadence()
	{
		return cadence;
	}

	public int getGear()
	{
		return gear;
	}

	public int getSpeed()
	{
		return speed;
	}

	// the Bicycle class has four methods
	public void setCadence(int newValue)
	{
		cadence = newValue;
	}

	public void setGear(int newValue)
	{
		gear = newValue;
	}

	public void applyBrake(int decrement)
	{
		speed -= decrement;
	}

	public void speedUp(int increment)
	{
		speed += increment;
	}

	public void printDescription()
	{
		System.out.println("\nBike is " + "in gear " + this.gear
			+ " with a cadence of " + this.cadence +
			" and travelling at a speed of " + this.speed + ". ");
	}
}

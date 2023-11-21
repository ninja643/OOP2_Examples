package polymorphism;

public class RoadBike extends Bicycle
{
	private int tireWidth;

	public RoadBike(int startCadence, int startSpeed, int startGear, int tireWidth)
	{
		super(startCadence, startSpeed, startGear);
		this.tireWidth = tireWidth;
	}

	public int getTireWidth()
	{
		return tireWidth;
	}

	public void setTireWidth(int tireWidth)
	{
		this.tireWidth = tireWidth;
	}

	@Override
	public void printDescription()
	{
		super.printDescription();
		System.out.println("The RoadBike" + " has " + getTireWidth() + " MM tires.");
	}
}

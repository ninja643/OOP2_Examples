package polymorphism;

public class MountainBike extends Bicycle
{
	private final String suspension;

	public MountainBike(int startCadence, int startSpeed, int startGear, String suspensionType)
	{
		super(startCadence, startSpeed, startGear);
		suspension = suspensionType;
	}

	public String getSuspension()
	{
		return suspension;
	}

	@Override
	public void printDescription()
	{
		super.printDescription();
		System.out.println("The " + "MountainBike has a " + getSuspension() + " suspension.");
	}
}

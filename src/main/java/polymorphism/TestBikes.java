package polymorphism;

public class TestBikes
{
	public static void printBicycleDescription(final Bicycle bicycle)
	{
		bicycle.printDescription();
	}

	public static void main(String[] args)
	{
		final Bicycle bike01 = new Bicycle(20, 10, 1);
		final Bicycle bike02 = new MountainBike(20, 10, 5, "Dual");
		final Bicycle bike03 = new RoadBike(40, 20, 8, 23);

//		printBicycleDescription(bike01);

		printBicycleDescription(bike02);


//		printBicycleDescription(bike03);

//		bike01.printDescription();
//		bike02.printDescription();
//		bike03.printDescription();
	}
}

package students.statistics;

import students.Student;

public class StudentCountStatistics extends Statistics
{
	private int firstYearCount;
	private int secondYearCount;
	private int thirdYearCount;
	private int fourthYearCount;

	@Override
	protected void initialize()
	{
		firstYearCount = 0;
		secondYearCount = 0;
		thirdYearCount = 0;
		fourthYearCount = 0;
	}

	@Override
	protected void handle(final Student student)
	{
		switch (student.yearOfStudy())
		{
		case 1 -> firstYearCount++;
		case 2 -> secondYearCount++;
		case 3 -> thirdYearCount++;
		case 4 -> fourthYearCount++;
		default -> System.out.println("Unknown year!");
		}
	}

	@Override
	public void printStatistics()
	{
		System.out.println("Year 1: " + firstYearCount);
		System.out.println("Year 2: " + secondYearCount);
		System.out.println("Year 3: " + thirdYearCount);
		System.out.println("Year 4: " + fourthYearCount);
	}
}

package students.statistics;

import students.Gender;
import students.Student;

public class GenderStatistics extends Statistics
{
	private int maleCnt;
	private int femaleCnt;

	@Override
	protected void initialize()
	{
		maleCnt = 0;
		femaleCnt = 0;
	}

	@Override
	protected void handle(final Student student)
	{
		if (student.gender() == Gender.MALE)
		{
			maleCnt++;
		}
		else
		{
			femaleCnt++;
		}
	}

	@Override
	public void printStatistics()
	{
		System.out.println("Males: " + maleCnt);
		System.out.println("Females: " + femaleCnt);
	}
}

package students;

import students.statistics.*;
import students.storage.DatabaseStudentStorage;
import students.storage.LocalStudentStorage;

public class StatisticsDemo
{
	public static void main(String[] args)
	{
		final StatisticsCalculator statisticsCalculator =
			new StatisticsCalculator(new DatabaseStudentStorage());

		final Statistics statistics = statisticsCalculator.calculate(new StudentCountStatistics());

		statistics.printStatistics();
	}
}

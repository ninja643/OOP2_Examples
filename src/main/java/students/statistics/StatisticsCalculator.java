package students.statistics;

import java.util.List;
import lombok.RequiredArgsConstructor;
import students.Student;
import students.storage.StudentStorage;

@RequiredArgsConstructor
public class StatisticsCalculator
{
	private final StudentStorage studentStorage;

	public Statistics calculate(final Statistics statistics)
	{
		final List<Student> students = studentStorage.getStudents();

		statistics.initialize();

		for (final Student student : students)
		{
			statistics.handle(student);
		}

		return statistics;
	}
}

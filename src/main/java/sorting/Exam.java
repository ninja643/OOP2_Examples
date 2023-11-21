package sorting;

public record Exam(String courseName, Student student, int grade)
	implements Comparable<Exam>
{
	@Override
	public int compareTo(final Exam other)
	{
		if (courseName.equals(other.courseName))
		{
			if (grade == other.grade)
			{
				return student.compareTo(other.student);
			}
			if (grade < other.grade)
			{
				return 1;
			}
			return -1;
		}

		return courseName.compareTo(other.courseName);
	}
}

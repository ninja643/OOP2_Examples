package sorting.comparators;

import java.util.Comparator;
import sorting.Exam;

public class CourseNameComparator implements Comparator<Exam>
{
	@Override
	public int compare(final Exam o1, final Exam o2)
	{
		return o1.courseName().compareTo(o2.courseName());
	}
}

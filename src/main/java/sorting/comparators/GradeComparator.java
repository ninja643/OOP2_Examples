package sorting.comparators;

import java.util.Comparator;
import sorting.Exam;

public class GradeComparator implements Comparator<Exam>
{
	@Override
	public int compare(final Exam o1, final Exam o2)
	{
		return Integer.compare(o1.grade(), o2.grade());
	}
}

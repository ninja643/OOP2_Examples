package sorting;

import java.util.*;
import sorting.comparators.CourseNameComparator;
import sorting.comparators.GradeComparator;

public class SortingDemo
{
	public static void main(String[] args)
	{
		final List<Exam> exams = new ArrayList<>(ExamRepository.getExams());
		//		System.out.println("Original list:");
		//		Collections.shuffle(exams);
		//		printList(exams);
		//
		//		System.out.println("Sorted list:");
		//		Collections.sort(exams); // Default sorts
		//		printList(exams);

		Comparator<Exam> gradeComparator = new GradeComparator();
		Comparator<Exam> courseNameComparator = new CourseNameComparator();

		System.out.println("Custom comparators: ");
		//		Collections.sort(exams, gradeComparator);
		exams.sort(courseNameComparator
				.thenComparing(gradeComparator.reversed()));
		printList(exams);
	}

	private static void printList(final List<Exam> exams)
	{
		for (final Exam exam : exams)
		{
			System.out.println(exam);
		}
	}
}

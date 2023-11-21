package sorting;

import static sorting.StudentRepository.s1;
import static sorting.StudentRepository.s2;
import static sorting.StudentRepository.s3;
import static sorting.StudentRepository.s4;
import java.util.List;

public class ExamRepository
{
	private static final Exam e1 = new Exam("OOP2", s1, 8);
	private static final Exam e2 = new Exam("OOP2", s2, 10);
	private static final Exam e3 = new Exam("OOP2", s4, 7);
	private static final Exam e4 = new Exam("SPA", s3, 6);
	private static final Exam e5 = new Exam("SPA", s4, 9);
	private static final Exam e6 = new Exam("SPA", s1, 7);

	public static List<Exam> getExams()
	{
		return List.of(e1, e2, e3, e4, e5, e6);
	}
}

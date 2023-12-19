package students.storage;

import java.util.List;
import students.Gender;
import students.Student;

public class LocalStudentStorage implements StudentStorage
{
	private final List<Student> availableStudents = List.of(
		new Student(1, "Pera", Gender.MALE, 1, 7.9),
		new Student(1, "Maca", Gender.FEMALE, 2, 8.9),
		new Student(1, "Masa", Gender.FEMALE, 2, 7.3),
		new Student(1, "Joca", Gender.MALE, 4, 8.8),
		new Student(1, "Mita", Gender.MALE, 3, 7.7),
		new Student(1, "Ceca", Gender.FEMALE, 1, 9.9));

	@Override
	public List<Student> getStudents()
	{
		return availableStudents;
	}
}

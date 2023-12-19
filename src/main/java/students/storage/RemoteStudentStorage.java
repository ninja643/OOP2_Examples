package students.storage;

import java.util.List;
import students.Gender;
import students.Student;

public class RemoteStudentStorage implements StudentStorage
{
	@Override
	public List<Student> getStudents()
	{
		System.out.println("Retrieving student data from remote server");
		return List.of(
			new Student(1, "Pera", Gender.MALE, 1, 7.9),
			new Student(2, "Maca", Gender.FEMALE, 2, 8.9),
			new Student(3, "Masa", Gender.FEMALE, 2, 7.3),
			new Student(4, "Joca", Gender.MALE, 4, 8.8),
			new Student(5, "Mita", Gender.MALE, 3, 7.7),
			new Student(6, "Ceca", Gender.FEMALE, 1, 9.9));

	}
}

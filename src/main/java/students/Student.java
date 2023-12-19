package students;

public record Student(
	Integer id,
	String name,
	Gender gender,
	Integer yearOfStudy,
	Double averageGrade)
{
}

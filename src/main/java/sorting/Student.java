package sorting;

public record Student(int id, String firstName, String lastName)
	implements Comparable<Student>
{
	@Override
	public int compareTo(final Student other)
	{
		if (lastName.equals(other.lastName))
		{
			return firstName.compareTo(other.firstName);
		}
		return lastName.compareTo(other.lastName);
	}
}

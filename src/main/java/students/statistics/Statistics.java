package students.statistics;

import students.Student;

public abstract class Statistics
{
	protected abstract void initialize();

	protected abstract void handle(Student student);

	public abstract void printStatistics();
}

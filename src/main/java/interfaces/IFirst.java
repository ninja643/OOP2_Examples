package interfaces;

public interface IFirst
{
	void firstMethod();

	void generalMethod();

	default void specificMethod()
	{
		System.out.println("IFirst::specific");
	}
}

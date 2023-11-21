package interfaces;

public interface ISecond
{
	void secondMethod();
	void generalMethod();

	default void specificMethod()
	{
		System.out.println("ISecond::specific");
	}
}

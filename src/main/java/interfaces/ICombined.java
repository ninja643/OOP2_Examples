package interfaces;

public interface ICombined extends IFirst, ISecond
{
	void thirdMethod();

	@Override
	default void specificMethod()
	{
		IFirst.super.specificMethod();
	}
}

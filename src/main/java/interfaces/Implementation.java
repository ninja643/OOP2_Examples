package interfaces;

import java.io.Serializable;

public class Implementation implements ICombined, Serializable
{
	@Override
	public void thirdMethod()
	{
		System.out.println("Third");
	}

	@Override
	public void firstMethod()
	{
		System.out.println("First");
	}

	@Override
	public void generalMethod()
	{
		System.out.println("General");
	}

	@Override
	public void secondMethod()
	{
		System.out.println("Second");
	}
}

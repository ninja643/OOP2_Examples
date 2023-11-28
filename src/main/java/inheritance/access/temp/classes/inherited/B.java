package inheritance.access.temp.classes.inherited;

import inheritance.access.temp.classes.A;

public class B extends A
{
	private int a = 100;
	protected int b = 1000;

	public B()
	{
		super(5);
		this.a = 10;
		this.b = 100;
	}

	public B(int a, int b, int c, int d)
	{
		super(computeValue(a, b), a - b);
		this.a = c;
		this.b = d;
	}

	private static int computeValue(int a, int b)
	{
		return a + b;
	}

	@Override
	public void info()
	{
		super.info();

		System.out.println("B::a = " + a);
		System.out.println("B::b = " + b);
	}
}

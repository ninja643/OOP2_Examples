package inheritance.access.temp.classes;

public class A
{
	protected int a;
	protected int b;

	public A(final int a, final int b)
	{
		this.a = a;
		this.b = b;
	}

	public A(final int a)
	{
		this.a = a;
		this.b = a;
	}

	public void info(){
		System.out.println("A::a = " + a);
		System.out.println("A::b = " + b);
	}
}

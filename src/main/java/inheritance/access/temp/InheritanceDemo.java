package inheritance.access.temp;

import inheritance.access.temp.classes.A;
import inheritance.access.temp.classes.inherited.B;
import inheritance.access.temp.classes.inherited.Derived;

public class InheritanceDemo
{
	public static void main(String[] args)
	{
		final A a = new A(2, 3);
		a.info();

		System.out.println("------------------------------------");

		final B b = new B();
		b.info();
	}
}

package inheritance.access.nested;

public class NestedDemo
{
	public static void main(String[] args)
	{
		final Base base = new Base(10, 20);
		final Base.Nested nested = base.new Nested(1000, 2000);

		nested.show();

		final Derived derived = new Derived(10, 20);
		System.out.println(derived.sum());
	}
}

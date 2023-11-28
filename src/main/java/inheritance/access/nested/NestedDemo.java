package inheritance.access.nested;

public class NestedDemo
{
	public static void main(String[] args)
	{
		final Base base = new Base(10, 20);
		System.out.println(base.sum());

		final Base.Nested nested =
			base.new Nested(1000, 2000);

		nested.show();
		base.setY(3000);
		nested.show();
//
//		final Derived derived = new Derived(10, 20);
//		System.out.println(derived.sum());
//		System.out.println(derived.superSum());
	}
}

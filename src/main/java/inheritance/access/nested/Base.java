package inheritance.access.nested;

public class Base
{
	public final int x;
	private final int y;

	public Base(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int sum()
	{
		return x + y;
	}

	public int getY()
	{
		return y;
	}

	public class Nested extends Base
	{
		public Nested(int nestedX, int nestedY)
		{
			super(nestedX, nestedY);
		}

		public void show()
		{
			System.out.println("Direct: X = " + x);
			System.out.println("Direct: Y = " + y); // This accesses y on the Base instance (try this.y)
			System.out.println("With getter: Y = " + getY());
		}
	}
}

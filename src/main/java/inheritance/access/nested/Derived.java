package inheritance.access.nested;

public class Derived extends Base
{
	private final int y;

	public Derived(int x, int y)
	{
		super(x, y);
		this.y = 2 * y;
	}

	@Override
	public int sum()
	{
		return x + y;
	}
}

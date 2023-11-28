package inheritance.access.nested;

public class Derived extends Base
{
	private final int z;

	public Derived(int x, int y)
	{
		super(x, y);
		this.z = 2 * y;
	}

	@Override
	public int sum()
	{
		return x + z;
	}

	public int superSum()
	{
		return x + getY();
	}
}

package inheritance.access.temp.lombok;

public class EquilateralTriangle extends Triangle
{
	public EquilateralTriangle(final Point a, final Point b, final Point c)
	{
		super(a, b, c);
		checkIfEquilLateral();
	}

	private void checkIfEquilLateral()
	{
		// Some logic
	}
}

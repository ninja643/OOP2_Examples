package lambas;

public class Calculator
{
	public int calculate(int a, int b, Operation operation)
	{
		return operation.compute(a, b);
	}
}

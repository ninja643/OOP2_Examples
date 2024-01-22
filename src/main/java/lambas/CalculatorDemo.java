package lambas;

public class CalculatorDemo
{
	public static void main(String[] args)
	{
		final Calculator calculator = new Calculator();
		System.out.println(calculator.calculate(3, 5, Integer::sum));
		System.out.println(calculator.calculate(3, 5, (a, b) -> a * b));

		int value = calculator.calculate(3, 5, (int a, int b) -> a - b);

		System.out.println(value);

		int value2 = calculator.calculate(3, 5, (a, b) -> a / b);

		System.out.println(value2);
	}
}

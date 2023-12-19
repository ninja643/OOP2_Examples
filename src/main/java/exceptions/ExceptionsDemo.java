package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo
{
	public static void main(String[] args)
	{
//		int[] a = { 1, 2, 3 };
//		System.out.println(a[-1]); // ArrayIndexOutOfBoundsException

//		Integer value = null;
//		System.out.println(value.doubleValue()); // NPE

		try
		{
			getInputAndCompute();
		}
		catch (final ComputationException e)
		{
			System.out.println(e.getMessage());
			if (e.getCause() != null)
			{
				System.out.println("Message from cause: " + e.getCause().getMessage());
			}
			e.printStackTrace();
		}

		System.out.println("Done.");
	}

	private static int getNextNumber(final Scanner scanner, final String message) throws ComputationException
	{
		try
		{
			System.out.println(message);
			return scanner.nextInt();
		}
		catch (final InputMismatchException e)
		{
			throw new ComputationException("Bad input", e);
		}
	}

	private static void handleNumbers(int a, int b) throws ComputationException
	{
		if (b == 0)
		{
			throw new ComputationException("Division by zero!");
		}

		System.out.println("Computing a / b:");
		System.out.println(a / b);
	}

	private static void getInputAndCompute() throws ComputationException
	{
		final Scanner scanner = new Scanner(System.in);
		int a = getNextNumber(scanner, "A = ");
		int b = getNextNumber(scanner, "Please enter a non-zero number. B = ");

		handleNumbers(a, b);
	}

	/*
		main()
			|
			-- getInputAndCompute()
				|
				-- getNextNumber()
				-- handleNumbers() -> created Exception object
	 */
}

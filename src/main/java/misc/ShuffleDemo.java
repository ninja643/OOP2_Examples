package misc;

import java.util.Random;

public class ShuffleDemo
{
	public static void main(String[] args)
	{
		final int[] a = { 1, 2, 3, 4, 5, 6 };

		final Random random = new Random();

		for (int i = 1; i < a.length; i++)
		{
			final int index = random.nextInt(i);
			if (index != i) {
				final int temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
		}

		for (int el : a)
		{
			System.out.print(el + " ");
		}
		System.out.println();
	}
}

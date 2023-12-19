package exceptions;

import java.io.*;

public class CheckedExceptionsDemo
{
	public static void main(String[] args)
	{
		System.out.println("Loading data from file 'input.txt'");
		loadData("input.txt");
		loadData("unknown.txt");
	}

	private static void loadData(final String filename)
	{
		// try-with-resources
		try (final InputStream is = new FileInputStream(filename))
		{
			int value = is.read();
			System.out.println(value);
		}
		catch (final IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("doing some other finally stuff");
		}


		// Standard try (-catch-finally)
//		InputStream is = null;
//		try
//		{
//			is = new FileInputStream(filename);
//			int value = is.read();
//			System.out.println(value);
//		}
//		finally
//		{
//			if (is != null)
//			{
//				try
//				{
//					is.close();
//				}
//				catch (IOException e)
//				{
//					// Ignore this exception
//				}
//			}
//		}
	}
}

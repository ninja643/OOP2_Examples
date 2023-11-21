package object_methods;

public class BooksDemo
{
	public static void main(String[] args)
	{
		final Book firstBook = new Book("123456789", "Book 1");
		final Book secondBook = new Book("123456789", "Book 2");
		final Book thirdBook = new Book("123456987", "Book 3");
		final Book fourthBook = firstBook.clone();

//		equalByReference(firstBook, secondBook);
//		equalByReference(firstBook, thirdBook);

		equalByEquals(firstBook, secondBook);
		equalByEquals(firstBook, thirdBook);

		System.out.println(fourthBook);
	}

	public static void equalByReference(final Book a, final Book b)
	{
		System.out.printf("Comparing books '%s' and '%s' by reference", a.getTitle(), b.getTitle());
		if (a == b)
		{
			System.out.println("Books are equal");
		}
		else
		{
			System.out.println("Books are NOT equal");
		}
	}

	public static void equalByEquals(final Book a, final Book b)
	{
		System.out.printf("Comparing books '%s' and '%s' by equals() method", a.getTitle(), b.getTitle());
		if (a.equals(b))
		{
			System.out.println("Books are equal");
		}
		else
		{
			System.out.println("Books are NOT equal");
		}
	}
}

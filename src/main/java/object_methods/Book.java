package object_methods;

import java.util.Objects;

public class Book implements Cloneable
{
	private final String isbn;
	private final String title;

	public Book(String isbn, String title)
	{
		this.isbn = isbn;
		this.title = title;
	}

	public String getIsbn()
	{
		return isbn;
	}

	public String getTitle()
	{
		return title;
	}

	@Override
	public boolean equals(final Object other)
	{
		if (this == other)
		{
			return true;
		}
		if (other == null || getClass() != other.getClass())
		{
			return false;
		}
		final Book book = (Book)other;
		System.out.printf("%nequals() method called on %s and %s%n", title, book.title);
		return Objects.equals(isbn, book.isbn);
	}

	@Override
	public int hashCode()
	{
		System.out.printf("%nhashcode() method called on %s%n", title);
		return Objects.hash(isbn, title);
	}

	@Override
	public Book clone()
	{
		try
		{
			final Book clone = (Book)super.clone();
			// TODO: copy mutable state here, so the clone can't change the internals of the original
			return clone;
		}
		catch (CloneNotSupportedException e)
		{
			throw new AssertionError();
		}
	}

	@Override
	public String toString()
	{
		return "Book{" +
			"isbn='" + isbn + '\'' +
			", title='" + title + '\'' +
			'}';
	}
}

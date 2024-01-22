package generics;

public class NonGenericBox
{
	private Object value;

	public NonGenericBox(final Object value)
	{
		this.value = value;
	}

	public Object getValue()
	{
		return value;
	}

	public void setValue(final Object value)
	{
		this.value = value;
	}
}

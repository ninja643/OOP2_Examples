package generics;

public class IntegerStringPair implements Pair<Integer, String>
{
	private Integer key;
	private String value;

	public IntegerStringPair(final Integer key, final String value)
	{
		this.key = key;
		this.value = value;
	}

	@Override
	public Integer getKey()
	{
		return null;
	}

	@Override
	public String getValue()
	{
		return null;
	}
}

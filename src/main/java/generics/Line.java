package generics;

import lombok.Value;

@Value
public class Line implements Measurable
{
	double start;
	double end;

	@Override
	public double measure()
	{
		return end - start;
	}
}

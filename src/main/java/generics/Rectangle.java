package generics;

import lombok.Value;

@Value
public class Rectangle extends BaseShape implements Measurable
{
	double a;
	double b;

	@Override
	public void draw()
	{
		System.out.println("Rectangle!!!");
	}

	@Override
	public double measure()
	{
		return a * b;
	}
}

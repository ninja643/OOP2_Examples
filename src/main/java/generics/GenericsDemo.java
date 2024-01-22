package generics;

import java.util.List;

public class GenericsDemo
{
	public static void main(String[] args)
	{
		final List<Integer> ints = List.of(1, 2, 3);
		final List<Double> doubles = List.of(1.0, 2.0, 3.3);
		final List<String> strings = List.of("1", "2");
		System.out.println(computeSum(ints));
		System.out.println(computeSum(doubles));
//		System.out.println(computeSum(strings));

		//		Circle circle = new Circle();
		//		Rectangle rectangle = new Rectangle(3, 5);
		//		Line line = new Line(1, 2);
		//
		//		System.out.println(measure(rectangle));

		//		Box<Integer> integerBox = new Box<>(10);
		//		Box<String> stringBox = new Box<>("ABC");
		//
		//		OrderedPair<Integer, String> pair = new OrderedPair<>(1, "TEST");
		//		OrderedPair<Double, Box<Boolean>> boxPair = new OrderedPair<>(1.0, new Box<>(true));
	}

	public static double computeSum(List<? extends Number> values)
	{
		double sum = 0.0;
		for (final Number v : values)
		{
			sum += v.doubleValue();
		}
		return sum;
	}

	public static <T extends Shape> void draw(T shape)
	{
		shape.draw();
	}

	public static void draw(Circle circle)
	{
		System.out.println(circle);
	}

	public static <T extends BaseShape & Measurable> double measure(T shape)
	{
		shape.draw();
		return shape.measure();
	}
}

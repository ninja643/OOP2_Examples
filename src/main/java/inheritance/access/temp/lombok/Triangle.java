package inheritance.access.temp.lombok;

import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@NonFinal
public class Triangle
{
	Point a;
	Point b;
	Point c;
}

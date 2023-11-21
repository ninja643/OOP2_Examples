package inheritance.access;

public class HiddenAccessDemo
{
	public static void main(String[] args)
	{
		final HideAccess hideAccess = new HideAccess(10, 20, 30, 40);

		System.out.printf("Access value: %d%n", hideAccess.getPublicMember());
		System.out.printf("Access hidden value: %d%n", hideAccess.getHiddenPublicMember());

		hideAccess.publicMethod();
		hideAccess.hiddenPublicMethod();
	}
}

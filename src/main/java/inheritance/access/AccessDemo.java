package inheritance.access;

import inheritance.access.subpackage.SubpackageDerivedAccess;

public class AccessDemo
{
	public static void main(String[] args)
	{
		final BaseAccess baseAccess = new BaseAccess(1, 2, 3, 4);
		baseAccess.demo();

		final DerivedAccess derivedAccess = new DerivedAccess(5, 6, 7, 8);
		derivedAccess.demo();
		derivedAccess.inheritedDemo();

		final SubpackageDerivedAccess subpackageDerivedAccess = new SubpackageDerivedAccess(9, 10, 11, 12);
		subpackageDerivedAccess.demo();
		subpackageDerivedAccess.inheritedDemo();
	}
}

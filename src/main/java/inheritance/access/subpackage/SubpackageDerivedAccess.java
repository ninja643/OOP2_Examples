package inheritance.access.subpackage;

import inheritance.access.BaseAccess;

public class SubpackageDerivedAccess extends BaseAccess
{
	public SubpackageDerivedAccess(int publicMember, int protectedMember, int packageLevelMember, int privateMember)
	{
		super(publicMember, protectedMember, packageLevelMember, privateMember);
	}

	@Override
	public void demo()
	{
		System.out.println("=============== SubpackageDerivedAccess ===============");
		System.out.println("Members: ");
		System.out.printf("SubpackageDerivedAccess - publicMember: %d%n", publicMember);
		System.out.printf("SubpackageDerivedAccess - protectedMember: %d%n", protectedMember);
		//		System.out.printf("SubpackageDerivedAccess - packageLevelMember: %d%n", packageLevelMember);
		//		System.out.printf("SubpackageDerivedAccess - privateMember: %d%n", privateMember);
		publicMethod();
		protectedMethod();
		//		packageLevelMethod();
		//		privateMethod();
		System.out.println("==========================================");
	}

	public void inheritedDemo()
	{
		super.demo();
	}
}

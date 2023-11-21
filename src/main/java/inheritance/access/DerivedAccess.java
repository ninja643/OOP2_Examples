package inheritance.access;

public class DerivedAccess extends BaseAccess
{
	public DerivedAccess(int publicMember, int protectedMember, int packageLevelMember, int privateMember)
	{
		super(publicMember, protectedMember, packageLevelMember, privateMember);
	}

	@Override
	public void demo()
	{
		System.out.println("=============== DerivedAccess ===============");
		System.out.println("Members: ");
		System.out.printf("DerivedAccess - publicMember: %d%n", publicMember);
		System.out.printf("DerivedAccess - protectedMember: %d%n", protectedMember);
		System.out.printf("DerivedAccess - packageLevelMember: %d%n", packageLevelMember);
		//		System.out.printf("DerivedAccess - privateMember: %d%n", privateMember);
		publicMethod();
		protectedMethod();
		packageLevelMethod();
		//		privateMethod();
		System.out.println("==========================================");
	}

	public void inheritedDemo()
	{
		super.demo();
	}
}

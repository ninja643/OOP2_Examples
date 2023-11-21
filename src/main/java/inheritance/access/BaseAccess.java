package inheritance.access;

public class BaseAccess
{
	public int publicMember;
	protected int protectedMember;
	int packageLevelMember;
	private int privateMember;

	public BaseAccess(int publicMember, int protectedMember, int packageLevelMember, int privateMember)
	{
		this.publicMember = publicMember;
		this.protectedMember = protectedMember;
		this.packageLevelMember = packageLevelMember;
		this.privateMember = privateMember;
	}

	public int getPublicMember()
	{
		return publicMember;
	}

	public int getProtectedMember()
	{
		return protectedMember;
	}

	public int getPackageLevelMember()
	{
		return packageLevelMember;
	}

	public int getPrivateMember()
	{
		return privateMember;
	}

	public void publicMethod()
	{
		System.out.println("BaseAccess::publicMethod");
	}

	protected void protectedMethod()
	{
		System.out.println("BaseAccess::protectedMethod");
	}

	void packageLevelMethod()
	{
		System.out.println("BaseAccess::packageLevelMethod");
	}

	private void privateMethod()
	{
		System.out.println("BaseAccess::privateMethod");
	}

	public void demo()
	{
		System.out.println("=============== BaseAccess ===============");
		System.out.println("Members: ");
		System.out.printf("BaseAccess - publicMember: %d%n", publicMember);
		System.out.printf("BaseAccess - protectedMember: %d%n", protectedMember);
		System.out.printf("BaseAccess - packageLevelMember: %d%n", packageLevelMember);
		System.out.printf("BaseAccess - privateMember: %d%n", privateMember);
		publicMethod();
		protectedMethod();
		packageLevelMethod();
		privateMethod();
		System.out.println("==========================================");
	}
}

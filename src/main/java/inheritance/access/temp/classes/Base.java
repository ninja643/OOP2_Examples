package inheritance.access.temp.classes;

public class Base
{
	public int publicMember;
	protected int protectedMember;
	int packageLevelMember;
	private int privateMember;

	public Base()
	{
		publicMember = 10;
		protectedMember = 100;
		packageLevelMember = 1000;
		privateMember = 10000;
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

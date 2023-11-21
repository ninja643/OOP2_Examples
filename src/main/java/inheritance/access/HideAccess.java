package inheritance.access;

public class HideAccess extends BaseAccess
{
	private final int publicMember;

	public HideAccess(int publicMember, int protectedMember, int packageLevelMember, int privateMember)
	{
		super(publicMember, protectedMember, packageLevelMember, privateMember);
		this.publicMember = -publicMember;
	}

	public int getPublicMember()
	{
		return publicMember;
	}

	public int getHiddenPublicMember()
	{
		return super.publicMember;
		// return super.getPublicMember();
	}

	public void publicMethod()
	{
		System.out.println("HiddenAccess::publicMethod");
	}

	public void hiddenPublicMethod()
	{
		super.publicMethod();
	}
}

package inheritance.access.temp.classes.inherited;

import inheritance.access.temp.classes.Base;

public class Derived extends Base
{
	public void derivedDemo()
	{
		System.out.println("Derived::derivedDemo");

		publicMethod();
		protectedMethod();
//		packageLevelMethod();
//		privateMethod();
	}

	public void increaseValues(int amount)
	{
		this.publicMember += amount;
		this.protectedMember += amount;
//		this.packageLevelMember += amount;
//		this.privateMember += amount;
	}
}

package oops;

import basics.AccessModifier1PackageReuse;

public class AccessModifier2PackageReuse extends AccessModifier1PackageReuse{

	
	public static void main(String[] args) {
		AccessModifier2PackageReuse ac=new AccessModifier2PackageReuse();
		System.out.println(ac.a);
		System.out.println(ac.b);
	}

}

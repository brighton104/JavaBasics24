package oops;

public class FinalStaticKeyword {

	static String schoolName="Don Bosco College";
	final String schooldetails="English";
	
	
	
	public static void main(String[] args) {
		
		// Static Keyword
		System.out.println(FinalStaticKeyword.schoolName);
		System.out.println(FinalStaticKeyword.schoolName="Narayaguru College");
		System.out.println(FinalStaticKeyword.schoolName);

		//Final Keyword -Need to create object
		FinalStaticKeyword fs=new FinalStaticKeyword();
		System.out.println(fs.schooldetails);
		//System.out.println(fs.schooldetails="MAlayalam"); changing value  is not possible in final keyword
		
	}

}

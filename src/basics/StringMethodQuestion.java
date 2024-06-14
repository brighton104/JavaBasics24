package basics;

public class StringMethodQuestion {

	public static void main(String[] args) {

		//Join Two String
				String s="jmeter ";
				String s1="performance testing tool";
				System.out.println(s.concat(s1));
				
		//Contains = display pass		
				String x="Java Language is Platform Independent";
				System.out.println(x.contains("Language"));
				if (x.contains("Language"))
				
				{
					System.out.println("Pass");
				}
				else
				{
					System.out.println("Fail");
				}
		
				
		//Split the string
				String w="selenium webdriver is used for webapplication testing";
				String word[]=w.split(" ");
				for(String le:word)
				{
					System.out.println(le);
					if(le.contains("webapplication"))
					{
						break;
					}
		
				}

	}
}

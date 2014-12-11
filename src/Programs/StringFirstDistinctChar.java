package Programs;

public class StringFirstDistinctChar {

	public static int numberOfChar(String s,char c)
	{
	   String ch=String.valueOf(c);
	   String n=s.replaceAll(ch, "");
	   return n.length();
		
	}
	
	
	public static void main(String[] args) {
		String s="Stress";
		String ls=s.toLowerCase();
		int stringLenght=ls.length();
		
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			int j=numberOfChar(ls, c);
			
			if(stringLenght-j==1)
			{
				System.out.println(c);
				break;
			}
			
		}
		

	}

}

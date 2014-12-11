package Programs;

public class stringNumberOfChar {

	public static int numOccurance(String name,char c)
	{
		String s=String.valueOf(c);
		String ns=name.replaceAll(s, "");
		return name.length()-ns.length();
	}
	
	public static String distinctString(String name)
	{
		String em="";
		for(int i=0;i<name.length();i++)
	     {
	    	char c=name.charAt(i);
	    	
	    	if(em.indexOf(c)==-1)
	    	{
	    		em=em+c;
	    	}
	     }
		return em;
	}
	
	public static void main(String[] args) {
		
		String nam="Anil kumar";
		String name=nam.toLowerCase();
		name=name.trim();
		String distinct=distinctString(name);
		int dLenght=distinct.length();
		
		for(int i=0;i<dLenght;i++)
		{

			char c=distinct.charAt(i);
         	int n=numOccurance(name, c);
         	if(Character.toString(c).equals(" ")==false)
         	{
			System.out.println(String.valueOf(c).toLowerCase() + ":" + n);
         	}

		}
		
		

	}

}

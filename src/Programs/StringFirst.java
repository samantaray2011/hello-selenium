package Programs;

public class StringFirst {
	
	public static void main(String[] args) {
		String name="stress";
		String em="";
		
     for(int i=0;i<name.length();i++)
     {
    	char c=name.charAt(i);
    	
    	if(em.indexOf(c)==-1)
    	{
    		em=em+c;
    	}
     }
     System.out.println(em);
     
	}

}

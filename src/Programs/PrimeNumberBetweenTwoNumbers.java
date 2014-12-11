package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberBetweenTwoNumbers {
			static int count=0;
	
	
			public static Boolean isPrime(int Number)
			{

				if(Number<=1)
				{
					return false;
				}
				for(int i=2;i<Number;i++)
				{
					if(Number%i==0)
					{
						return false;
					}
				}
				return true;
			}

			public static void main(String[] args) throws NumberFormatException, IOException {
				
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter 1st number : ");
				int number1=Integer.parseInt(bufferedReader.readLine());
				System.out.println("Enter 2nd number : ");
				int number2=Integer.parseInt(bufferedReader.readLine());
				
				for(int i=number1;i<=number2;i++)
				{
					if(isPrime(i))
					{
						System.out.println(i + " ");
						count++;
					}
					
				}
				
				System.out.println("Number of Prime numbers present between : "+number1+" And "+number2 + " are " +count);

			}
}

		

	



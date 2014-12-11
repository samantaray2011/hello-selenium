package Programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
	
	public static Boolean isPrime(int Number)
	{
		for(int i=2;i<Number/2;i++)
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
		System.out.println("Enter number : ");
		int number=Integer.parseInt(bufferedReader.readLine());
		
		if(isPrime(number))
		{
			System.out.println(number + " is a prime number.");
		}
		else
		{
			System.out.println(number + " not a prime number.");
		}
		

	}

}

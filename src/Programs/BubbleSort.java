package Programs;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] intArray={19,20,3,56,12,77,57};
		
		for(int i=0;i<intArray.length;i++)
		{
			for(int j=1;j<(intArray.length-i);j++)
			{
				if(intArray[j-1]>intArray[j])
				{
					int temp=0;
					temp=intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
		
		for(int i=0;i<intArray.length;i++)
		{
		System.out.print(intArray[i]+" ");
		}

	}

}

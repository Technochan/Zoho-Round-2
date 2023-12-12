//input: "axtsyxs"
//	output : between X 3 characters present tsy; and between s only 2 character
// so we have to print maximum


package Zohoexc;

public class MaximumCharactersBetween {
	public static void check(String str)
	{
		char[] arr = str.toCharArray();
		char element = ' ';
		int charCount = 0;
		
		String betweenElement = "";

		for(int i=0 ; i<arr.length ; i++)
		{
//			System.out.println(arr[i]);
			for(int j=arr.length-1 ; j>i ; j--)
			{
				if(arr[i] == arr[j]) // i = 1     ;   j = 6;
				{
					int count = 0 ;
					for(int k=i+1 ; k<j ; k++) // k=1  k<5
					{
						count++;
					}
					if(count>charCount)
					{
						element = ' ';
						charCount = 0;
						betweenElement = "";
						element = arr[i];
						for(int k=i+1 ; k<j ; k++) // k=1  k<5
						{
							charCount++;
							betweenElement += arr[k];
						}
//						System.out.println(element +" "+charCount+" "+betweenElement);
					}
					
				}
			}
		}
		System.out.println(element +" "+charCount+" "+betweenElement);
		
	}
	public static void main(String[] args) 
	{
		String str = "axtsyxicccccccsccccccccci";
		check(str);
	}
}

//input : ccchhhann
//output: c3h3a1n2
package Zoho;
import java.util.Scanner;
public class WordsOccurancecchhaass
{	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in); 
		System.out.println("Enter the String");
		String input = scn.next();
		char[] arr = input.toCharArray();
		int count = 1;
		for(int i=0 ; i<arr.length; i++)
		{	
			if(Character.isLetter(arr[i]))
			{
				for(int j=i+1 ; j<arr.length; j++)
				{
					if(arr[i]==arr[j])
					{
						arr[j] = '*';
						count++;
					}
					
				}
				System.out.print(" "+arr[i]+""+count);
				count = 1;
			}
		}
	}
}

//input : c7d3h5
package Zoho;
import java.util.*;
public class WordsOccurancec7d7f3
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = "c1d10b1c10";
		
		char[] arr = input.toCharArray();
		for(int i=0 ; i<arr.length; i++)
		{
			if(Character.isLetter(arr[i])) 
			{
					int j = i + 1;
					int repeatCount = 0;
					while(j<arr.length && Character.isDigit(arr[j]))
					{
						repeatCount = repeatCount * 10 + Character.getNumericValue(arr[j]);
						j++;
					}
					for(int k=0 ; k<repeatCount ; k++)
					{
						System.out.print(arr[i]);
					
				    }
					
			}
		}
	}
}

//imput: a2b3c14
//output: aabbbcccccccccccccc
package Zoho;
public class Word_Occurance_Print {
	public static void main(String[] args) {
		String str = "a10b13c2";
		char[] arr = str.toCharArray();
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(Character.isLetter(arr[i]))
			{
				int k = i+1;
				int val = 0; 
				while(Character.isDigit(arr[k]) )
				{
					val = val * 10 + Character.getNumericValue(arr[k]);
					k++;
					if(k >= arr.length)
					{
						break;
					}
				}
				
			
				for(int j=0 ; j<val; j++)
				{
					System.out.print(arr[i]);
				}
			}
		}
	}
}

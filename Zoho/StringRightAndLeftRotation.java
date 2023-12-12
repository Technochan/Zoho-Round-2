package Zohoexc;

public class StringRightAndLeftRotation {
	public static void verify(String str,char dir,int n)
	{
		char[] strArr = str.toCharArray();
		int l = strArr.length;
		System.out.println(l);
		if(dir == 'L')
		{
			for(int i=0 ; i<n ; i++)
			{
				
				char letter = strArr[strArr.length-1];
				int position = strArr.length-1;
				for(int j=strArr.length-1 ; j>0 ; j--)
				{
					strArr[j] = strArr[--position];
				}
				strArr[0] = letter;
			}
		}
		if(dir == 'R')
		{
			for(int i=0 ; i<n ; i++)
			{
				
				char letter = strArr[0];
				int position = 0;
				for(int j=0 ; j<strArr.length-1 ; j++)
				{
					strArr[j] = strArr[++position];
				}
				strArr[strArr.length-1] = letter;
			}
		}
		for(char i : strArr)
		{
			System.out.print(i);
		}
	}
	public static void main(String[] args)
	{
		String str1 = "Zoho Corporation";
		String str2 = "Hello";
		
		char dir = 'R';
		int N = 1;
		
		verify(str1,dir,N);
	}
}

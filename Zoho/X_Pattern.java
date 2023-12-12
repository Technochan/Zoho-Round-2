package Zoho;

public class X_Pattern {
	public static void main(String[] args) {
		String str = "program";
		int start = 0; //1,2,3
		int last = str.length()-1; //4,3,2,1
		for(int i=0 ; i<str.length() ; i++)
		{
			for(int j=0 ; j<str.length() ; j++)
			{
				if(j==start)
				{
					System.out.print(" "+str.charAt(start));
				}
				else if(j==last)
				{
					System.out.print(" "+str.charAt(last));
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			start++;
			last--;
			System.out.println();
		}
	}
}

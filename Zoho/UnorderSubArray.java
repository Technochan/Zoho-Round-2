package Zohoexc;

public class UnorderSubArray
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,9,5,8,7,9,10};
		
		int firstIndex = arr[0];
		int secondIndex = arr[1];
		int dif =  Math. abs(firstIndex - secondIndex);
		int index = dif;
//		System.out.println(dif);
		String res = "";
		for(int i=0 ; i<arr.length ; i++) 
		{
			if(arr[i] != index)
			{
				res += arr[i]+",";
			}index += dif;
		}
		System.out.println(res);
	}

}

//3,4,13,14,31,..... Ipdi oru serious aa n number podanum
//and must 3or 4irukkanum aprom random oru number lucky number 
//nnu input kuduthu antha number  serious la entha index num nu print pannanum


package Zohoexc;
import java.util.*;
public class SeriesWithLuckyNumber
{
	public static void main(String[] args)
	{
//		3,4,13,14,23,24,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,
//		46,47,48,49,53,54,63,64,73,74,83,84,93,94,103,104,113,114,123,124,
//		130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,
//		146,147,148,149,153,154,163,164,173,174,183,184,193,194,203,204
		Scanner scan = new Scanner(System.in);
		int n = 100;
		String ans = "";
		
		for(int i=0 ; i<n ; i++)
		{
            String val = ""+i;
			char[] arr = val.toCharArray();
			for(int j=0 ; j<arr.length ; j++)
			{
				if(arr[j]=='3' || arr[j]=='4')
				{
					ans += i+",";
					break;
				}
			}
		}
		String[] stringArray = ans.split(",");
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
	            intArray[i] = Integer.parseInt(stringArray[i]);
	        }
		System.out.println("number between 0 to N : The N is = "+n);
		for (int num : intArray) {
            System.out.print(num + " ");
        }
		System.out.println();
		System.out.println("Enter the lucky num from "+"0 to "+(intArray.length-1)+" Indexes" );
		int lucky = scan.nextInt();
		System.out.println(intArray[lucky]);
	}
}


public class FindOutOfOrderSubarray {
    public static void main(String[] args) {
        // Given series
        int[] series = {1, 2, 3, 4, 8, 5, 7, 6, 9, 10};

        // Find the out-of-order subarray
        int[] outOfOrderSubarray = findOutOfOrderSubarray(series);

        // Print the result
        if (outOfOrderSubarray.length > 0) {
            System.out.print("The out-of-order subarray is: ");
            for (int num : outOfOrderSubarray) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("The series is in ascending order with no out-of-order subarray.");
        }
    }

    private static int[] findOutOfOrderSubarray(int[] arr) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (start == -1) {
                    start = i;
                }
                end = i + 1;
            }
        }

        if (start != -1) {
            return Arrays.copyOfRange(arr, start, end + 1);
        } else {
            return new int[0]; // Indicates that the series is in ascending order
        }
    }
}

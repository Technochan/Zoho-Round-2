//input : 13,2,4,15,12,10,5
//output: 13,2,12,10,5,15,4
package Zoho;

public class Array_OddInDesc_EvenInAsec {
	public static void main(String[] args) {
		int[] arr = {13,2,4,15,12,10,5};
		for(int i=0 ; i<arr.length ; i++)
		{
			if(i%2==0)
			{
				for(int j=i+1 ; j<arr.length ; j++)
				{
					if(j%2==0)
					{
						if(arr[i]<arr[j]) 
						{
							int temp = arr[j];
							arr[j] = arr[i];
							arr[i] = temp;
						}
					}
				}
			}
			else
			{
				for(int j=i+1 ; j<arr.length ; j++)
				{
					if(j%2==1)
					{
						if(arr[i]>arr[j]) 
						{
							int temp = arr[j];
							arr[j] = arr[i];
							arr[i] = temp;
						}
					}
				}
			}
		}
		for(int i : arr)
		{
			System.out.print(i+",");
		}
	}
}
public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rearrangeEvenOdd(arr);

        // Print the rearranged array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rearrangeEvenOdd(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }

            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }

            if (left < right) {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        // Sort the even and odd parts in decreasing order
        Arrays.sort(arr, 0, left, Collections.reverseOrder());
        Arrays.sort(arr, left, n, Collections.reverseOrder());
    }
}


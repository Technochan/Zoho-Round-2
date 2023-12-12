package Zoho;
import java.util.Scanner;
public class ArrayDublicateRemove 
{
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the size of the array");
		int size = scn.nextInt();
		int arr[] = new int[size];
		int[] arrValue = getValue(size,arr);
		System.out.println("Original Array");
		display(arrValue, size);
		System.out.println();
		removeDublicate(arrValue);
	}
	public static int[] getValue(int size,int[] arr)
	{
		for(int i=0 ; i<size ; i++)
		{
			System.out.println("Enter the element at the "+i+" index");
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	public static void display(int arr[],int n)
	{
		for (int i = 0; i < n; i++) {
	        System.out.print(arr[i] + " ");
	    }
	}
	public static void removeDublicate(int[] arr)
	{
	    int n = arr.length;
	    int newSize = n;

	    for (int i = 0; i < newSize; i++)
	    {
	        for (int j = i + 1; j < newSize; j++) 
	        {
	            if (arr[i] == arr[j])
	            {
	            
	                for (int k = j; k < newSize - 1; k++) 
	                {
	                    arr[k] = arr[k + 1];
	                }
	                newSize--;
	                j--; 
	            }
	        }
	    }
	    display(arr,newSize);
	}
}

package Zoho;
import java.util.Scanner;
public class MoveZero 
{
	static Scanner scn = new Scanner(System.in);
	public static int[] getValue(int size,int[] arr)
	{
		for(int i=0 ; i<size ; i++)
		{
			System.out.println("Enter the element at the "+i+" index");
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	public static void display(int arr[])
	{
		for(int i : arr)
		{
			System.out.print(i);
		}
	}
	//moveZero function is only the important part. Others just for my knowledge
	public static void moveZero(int size,int arr[])
	{
		int count = 0;
		for(int i=0 ; i<size ; i++)
		{
			if(arr[i]!=0)
			{
				arr[count++] = arr[i]; 
			}
		}
		while(count<size)
		{
			arr[count] = 0;
			count++;
		}
		display(arr);
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the size of the array");
		int size = scn.nextInt();
		int arr[] = new int[size];
		int[] arrValue = getValue(size,arr);
		System.out.println("Original Array");
		display(arrValue);
		System.out.println();
		System.out.println("Array after moved the zero's");
		moveZero(size,arrValue);
	}
}

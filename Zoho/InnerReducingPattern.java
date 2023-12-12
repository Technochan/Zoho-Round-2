package Zoho;

import java.util.Scanner;

public class InnerReducingPattern {
	
//	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = scn.nextInt();
//		int size = n*2-1;
//		int[][] arr = new int[size][size];
//		int front = 0 , last = size-1;
//		while(n!=0) 
//		{
//		for(int i=front ; i<=last ; i++)
//		{
//			for(int j=front ; j<=last ; j++)
//			{
//				if(i==front || i==last || j==front  || j==last )
//				{
//					arr[i][j]=n;
//				}
//			}
//		}
//		front++;
//		last--;
//		n--;
//		}
//		for(int i=0 ; i<size ; i++)
//		{
//			for(int j=0 ; j<size ; j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
	public static void main(String[] args) {
	    Scanner in  = new Scanner(System.in);
	    int num1;
	    int num2;
	    int maxNum;
	    System.out.println("Enter N : ");
	    int n = in.nextInt();
	    for(int i=1;i<=2*n-1;i++){
	        for(int j=1;j<=2*n-1;j++){
	             num1 = n-i < 0 ? -(n-i) : n-i;
	             num2 = n-j < 0 ? -(n-j) : n-j;
	             maxNum = num1 > num2 ? num1 : num2;
	            System.out.print((maxNum+1)+" "); 
	        }
	        System.out.println();
	    }
	}
}
//simple way

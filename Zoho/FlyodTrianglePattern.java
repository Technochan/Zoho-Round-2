package Zoho;
import java.util.*;
public class FlyodTrianglePattern {
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = scn.nextInt();
		int count = 1;
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ;  j<=i ; j++)
			{
				
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}

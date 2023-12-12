package Zoho;
import java.util.Scanner;
public class Find_Upper_Or_Lower_Triangle {
		  public static void main(String[] args) {
		         int mat[][] = { { 2, 0, 0, 0 },
		                         { 2, 2, 0, 0 },
		                         { 2, 1, 2, 0 },
		                         { 1, 2, 2, 6 } };
		         int n = mat.length;
		         String count = " ";
		         for (int i = 0; i < n; i++)
		         {
		             for (int j = i+1; j < n; j++)
		             {
		            	 if(mat[i][j]==0)
		                 System.out.print(i+""+j+" ");   
		             }
		         }
		    }
}

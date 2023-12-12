package Zoho;
import java.util.*;
public class DolusNumber {
	public static void main(String[] args) {
	     
		
		System.out.println("Enter the num");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println(isDolous(num));
	}
	public static boolean isDolous(int num){
        if(num==2 || num == 3 || num == 5 || (num % 5 == 0 && isDolous(num / 5)) || (num % 3 == 0 && isDolous(num / 3)) || (num % 2 == 0 && isDolous(num / 2)) )
        {
            return true;
        }
		return false;
}
}

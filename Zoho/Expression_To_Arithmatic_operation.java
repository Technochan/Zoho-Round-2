//input : 1234*+-
//output; 1*2+3-4 = 1
package Zoho;
import java.util.*;
public class Expression_To_Arithmatic_operation {
	public static void main(String[] args) {
		String str= "1234567++--*+";
		char[] arr = str.toCharArray();
		int val = Character.getNumericValue(arr[0]);
		for(int i=1 ; i<str.length() ; i++)
		{
			if(Character.isDigit(arr[i]))
			{
				boolean loop = true;
				int k = i+1;
				while(loop)
				{
					if(!Character.isDigit(arr[k]) && !Character.isLetter(arr[k]) )
					{
						switch(arr[k])
						{
						case '+' :  val = val + (Character.getNumericValue(arr[i]));
									arr[k] = 'a';		    
									break;
						case '*' :  val = val * Character.getNumericValue(arr[i]);
									arr[k] = 'a';
								    break;
						case '-' :  val = val - Character.getNumericValue(arr[i]);
									arr[k] = 'a';
						            break;
						}
						loop = false;
					}
					k++;
				}
			}		
		}
		System.out.println(val);
	}

}

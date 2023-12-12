package Zohoexc;

public class ValidExpresiionCheck {
	public static boolean check(String str)
	{
		char[] exp = str.toCharArray();
		int count = 0;
		for(char i : exp)
		{
			if(i == ')')
			{
				count--;
				if(count<0)
				{
					return false;
				}
			}
			else if(i == '(')
			{
				count++;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		String exp1 = "(8+0)*(9*1)";
		String exp2 = "(8+0))*(9*1)";
		String exp3 = "(a||b)((a*b)(a-b))";
		
		Boolean result = check(exp3);
		
		if(result)
		{
			System.out.println("Perfect Expression");
		}
		else
		{
			System.out.println("Imperfect Expression");
		}
	}
}

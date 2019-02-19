import java.util.*;
class P_S4_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int top=-1;
		int count=0;
		Stack<Character> stack=new Stack<Character>();
		
		outer:for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				stack.push(str.charAt(i));
				top++;
			}
			else if(str.charAt(i)==')')
			{
				if(top==-1)
				{
					count++;
					break outer;
				}
				while(stack.peek()!='(')
				{
						stack.pop();
						top--;
				}
				if(stack.peek()=='(')
				{
					stack.pop();
					top--;
				}
			}
		}
		if(count>0)
			System.out.println("no");
		else
		{	
			if(stack.isEmpty())
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
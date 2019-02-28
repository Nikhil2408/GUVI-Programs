import java.util.*;
class P_S4_4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			if(i%3==0)
			{
				System.out.print(str.charAt(i));
			}
		}
	}
}
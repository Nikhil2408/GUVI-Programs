import java.util.Scanner;
class B_S9_10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			//System.out.print(s.charAt(i));
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}
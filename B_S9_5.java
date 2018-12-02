import java.util.Scanner;
import java.math.*;
class B_S9_5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
				System.out.print(s.charAt(i)+"");
		}
		System.out.print(" ");
		for(int i=1;i<s.length();i++)
		{
			if(i%2!=0)
				System.out.print(s.charAt(i)+"");
		}
	}
}
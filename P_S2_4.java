import java.util.Scanner;
import java.math.*;
class P_S2_4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		str=str.substring(0,N);
		str=str.toLowerCase();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u')
			{
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.reverse());

	}
}
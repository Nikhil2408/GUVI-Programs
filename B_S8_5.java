import java.util.Scanner;
import java.math.*;
class B_S8_5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int temp=(int)(s.length()/2);
		if(s.length()%2==0)
		{
			s=s.substring(0,temp-1)+"**"+s.substring(temp+1,s.length());
		}
		else
			s=s.substring(0,temp)+"*"+s.substring(temp+1,s.length());

		System.out.println(s);
		
	}
}
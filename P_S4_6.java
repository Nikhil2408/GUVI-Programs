import java.util.*;
class P_S4_6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char k=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==k)
				count++;
		}
		System.out.println(count);
	}
}
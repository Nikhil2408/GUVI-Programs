import java.util.*;
class P_S3_8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder result=new StringBuilder();
		str=str.trim();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				result.append(str.charAt(i));
		}
		System.out.println(result);
	}
}
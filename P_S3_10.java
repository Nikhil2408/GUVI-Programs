import java.util.*;
class P_S3_10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int k=sc.nextInt();
		int count=0;
		int length=0;
		if(str1.length()==str2.length())
			count=0;
		else
			count=Math.abs(str1.length()-str2.length());
		if(str1.length()<str2.length())
			length=str1.length();
		else
			length=str2.length();
		for(int i=0;i<length;i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
				count++;
		}
		if(count==k)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
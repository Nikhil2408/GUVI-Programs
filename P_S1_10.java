import java.util.Scanner;
class P_S1_10
{
	static void checkString(String str1,String str2,int count)
	{
		int length=str1.length()<str2.length()?str1.length():str2.length();
		//System.out.println(length);
		for(int i=0;i<length;i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
				count++;
		}
		if(count==1)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int count=0;
		if(Math.abs(str1.length()-str2.length())>1)
			System.out.println("no");
		else if(Math.abs(str1.length()-str2.length())==1)
		{
			count++;
			checkString(str1,str2,count);
		}
		else
			checkString(str1,str2,0);
		
	}
}
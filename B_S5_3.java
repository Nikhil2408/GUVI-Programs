import java.util.Scanner;
class B_S5_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int length_str1=str1.length();
		int length_str2=str2.length();
		for(int i=0;i<length_str2;i++)
		{
			str1=str1+str2.charAt(i);
		}
		System.out.println(str1);
	}
}
import java.util.Scanner;
class B_S5_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int length_str1=str1.length();
		int length_str2=str2.length();
		if(length_str1==length_str2)
			System.out.println(str1);
		else if(length_str1>length_str2)
			System.out.println(str1);
		else
			System.out.println(str2);
	}
}
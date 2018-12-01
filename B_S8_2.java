import java.util.Scanner;
class B_S8_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				count++;
			break;
		}
		if(count>0)
			System.out.println("yes");
		else
			System.out.println("no");
		
		
	}
}
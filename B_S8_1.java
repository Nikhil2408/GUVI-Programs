import java.util.Scanner;
class B_S8_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length()/2-1;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				count++;

		}
		if(count>0)
			System.out.println("no");
		else
			System.out.println("yes");
		
	}
}
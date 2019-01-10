import java.util.Scanner;
class B_S9_6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					count++;
			}
		}
		if(count>0)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
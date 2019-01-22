import java.util.Scanner;
class P_S2_10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				if(str.charAt(i)+3 > 90)
				{
					int value=(str.charAt(i)+3)%90;
					System.out.print((char)(64+value));
				}
				else
					System.out.print((char)(str.charAt(i)+3));
			}
			else
			{
				if(str.charAt(i)+3 > 122)
				{
					int value=(str.charAt(i)+3)%122;
					System.out.print((char)(96+value));
				}
				else
					System.out.print((char)(str.charAt(i)+3));
			}
		}
	}
}
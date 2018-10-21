import java.util.Scanner;
class B_S4_4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=1;
		for(int i=0;i<str.length()-1;i++)    /*-1 because if I put . at last then it also count that . but I do not
												want to do so*/
		{
			if(str.charAt(i)=='.')
				count++;
		}
		System.out.println(count);
	}
}
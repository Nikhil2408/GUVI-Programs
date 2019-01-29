import java.util.*;
class P_S3_4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean numeric=true;
		try
		{
			Double d=Double.parseDouble(str);
		}
		catch(NumberFormatException e)
		{
			numeric=false;
		}
		if(numeric)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
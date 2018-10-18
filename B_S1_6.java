import java.util.*;
class B_S1_6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int leap_year=sc.nextInt();
		if((leap_year%4==0 && leap_year!=100) || leap_year%400==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a leap year");
	}
}
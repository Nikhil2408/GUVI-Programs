import java.util.*;
import java.lang.*;
class B_S2_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int power=sc.nextInt();
		double power_of_num=Math.pow(num,power);
		System.out.println((int)power_of_num);
	}
}
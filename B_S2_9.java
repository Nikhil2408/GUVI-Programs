import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;
class B_S2_9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		BigInteger fact=new BigInteger("1");
		while(num>0)
		{
			fact=fact.multiply(BigInteger.valueOf(num));
			num--;
		}
		System.out.println(fact);
	}
}
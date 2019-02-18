import java.util.*;
class P_S3_9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		double num=Math.floor(Math.sqrt(r))-Math.ceil(Math.sqrt(l))+1;
		System.out.println((int)num);
	}
}
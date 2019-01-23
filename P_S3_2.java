import java.util.*;
import java.math.*;
class P_S3_2
{
	static int hcf(int num,int k)
	{
		if(num==k)
			return num;
		if(num%k==0)
			return k;
		if(k%num==0)
			return num;
		if(num>k)
			return hcf(num%k,k);
		else
			return hcf(num,k%num);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(hcf(num,k));
	}
}
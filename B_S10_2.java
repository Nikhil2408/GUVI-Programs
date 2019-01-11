import java.util.Scanner;
import java.math.*;
class B_S10_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		int sum=0;
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}
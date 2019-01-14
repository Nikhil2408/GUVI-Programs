import java.util.Scanner;
import java.math.*;
class B_S11_6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int arr[]=new int[N];
		int count=0;
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++)
		{
			if(arr[i]%2!=0)
				count++;
			if(count==K)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
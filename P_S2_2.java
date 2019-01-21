import java.util.Scanner;
class P_S2_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=1;j<=K;j++)
		{
			int temp=arr[N-1];
			for(int i=N-1;i>0;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
		}
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
}
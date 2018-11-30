import java.util.Scanner;
class B_S6_8
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
			if(arr[i]==K)
				count++;
		}
		if(count>0)
			System.out.println("yes");
		else
			System.out.println("no");

	}
}
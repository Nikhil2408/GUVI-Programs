import java.util.Scanner;
class B_S4_9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);
	}
}
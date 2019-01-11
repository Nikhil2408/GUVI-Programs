import java.util.Scanner;
import java.math.*;
class B_S10_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		int height=sc.nextInt();
		int TSA= 2*length*breadth + 2*breadth*height + 2*height*length;
		int volume=length*breadth*height;
		System.out.println(TSA);
		System.out.println(volume);
	}
}
import java.util.Scanner;
class P_S2_7
{
	static int hcf(int L,int R)
	{
		if(L==R)
			return L;
		if(L%R==0)
			return R;
		if(R%L==0)
			return L;
		if(L>R)
			return hcf(L%R,R);
		else
			return hcf(L,R%L);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int R=sc.nextInt();
		int lcm=(L*R)/hcf(L,R);
		System.out.println(lcm);
	}
}
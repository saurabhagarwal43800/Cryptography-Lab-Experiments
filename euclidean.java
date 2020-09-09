import java.util.Scanner;
class Euclidean
{
	public static void main(String[] args)
		{
			Scanner input=new Scanner(System.in);
			int r1,r2,q,r,a,b;
			System.out.print("Enter the first number:");
			a=input.nextInt();

			System.out.print("Enter the second number:");
			b=input.nextInt();
			
			r1=a;
			r2=b;
			
			while(r2>0)
			{
				q=r1/r2;
				r=r1-q*r2;
				r1=r2;
				r2=r;
			}
			
			System.out.println("GCD of two numbers: "+ r1);
	}
}

import java.util.Scanner;
class ExtEuclidean
{
	public static void main(String[] args)
		{
			Scanner input=new Scanner(System.in);
			int r1,r2,s,s1,s2,t,t1,t2,q,r,a,b;
			System.out.print("Enter the first number:");
			a=input.nextInt();

			System.out.print("Enter the second number:");
			b=input.nextInt();
			
			r1=a;
			r2=b;
			s1=1;
			s2=0;
			t1=0;
			t2=1;
			
			while(r2>0)
			{
				q=r1/r2;
				r=r1-q*r2;
				r1=r2;
				r2=r;
				s=s1-q*s2;
				s1=s2;	
				s2=s;
				t=t1-q*t2;
				t1=t2;
				t2=t;
			}
			
			System.out.println("GCD of two numbers: "+ r1);
			System.out.println("Value of s: "+s1);					System.out.println("Value of t: "+t1);
	}
}

				


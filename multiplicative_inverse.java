import java.util.Scanner;
class MultInverse
{
	public static void main(String[] args)
		{
			Scanner input=new Scanner(System.in);
			int r1,r2,t,t1,t2,q,r,b,b_inv,n;
			System.out.print("Enter the number to find the multiplicative inverse: ");
			b=input.nextInt();

			System.out.print("Enter the value of n: ");
			n=input.nextInt();
			
			r1=n;
			r2=b;
			t1=0;
			t2=1;
			
			while(r2>0)
			{
				q=r1/r2;
				r=r1-q*r2;
				r1=r2;
				r2=r;
				t=t1-q*t2;
				t1=t2;
				t2=t;
			}
			if(r1==1)
			{
				b_inv=t1;
				if(b_inv>0)
				{
					System.out.println("Multiplicative inverse of "+b+": "+b_inv);
				}
				else
				{
					b_inv+=n;
					System.out.println("Multiplicative inverse of "+b+": "+b_inv);
				}
			}
			else
			{
				System.out.println("Multiplicative inverse doesn't exist");
			}
	}
}

				


import java.util.*;
interface A
{
	
	void sum(); // abstract
}
interface B
{
	void sub();  //body not
}
class C implements A, B
{	
	public void sum()
	{
		int a,b,c;
		Scanner s1=new Scanner(System.in);
			System.out.println("Enter the value of A ");
			a=s1.nextInt();
		
			System.out.println("Enter the value of B ");
			b=s1.nextInt();
		c=a+b;
		System.out.println("the addition of this two number is"+c);
	}
	public void sub()
	{
		int a,b,d;
		Scanner s2=new Scanner(System.in);
			System.out.println("Enter the value of A ");
			a=s2.nextInt();
		
			System.out.println("Enter the value of B ");
			b=s2.nextInt();
		d=a-b;
		System.out.println("the subtraction of this two number is"+d);
	}
}
class inter
{
		public static void main(String args[])
		{
			C o=new C();
			int n;
			
			
			do
			{
				Scanner s3=new Scanner(System.in);
				System.out.println("press 1 for addition ");
				System.out.println("press 2 for subtraction ");
				System.out.println("press 3 for exit ");
				n=s3.nextInt();
				
				switch(n)
				{
					case 1:
					o.sum();
					break;
					
					case 2:
					o.sub();
					break;
					
					case 3:
					break;
					default:
					System.out.println("out of choice");
				}
			}while(n!=3);
		}
}
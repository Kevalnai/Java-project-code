import java.util.*;
interface A
{
	void add(); // abstract
}
interface B
{
	void display();  //body not
}
interface C
{
	void grade();  //body not
}

class D implements A, B, C
{	
	int roll[]=new int[50];
	int p[]=new int[50];
	int c[]=new int[50];
	int m[]=new int[50];
	int tot[]=new int[50];
	int pre[]=new int[50];
	int count=0,i,rm;
	
	public void add()
	{	
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your roll no.");
		roll[count]=s1.nextInt();
		System.out.println("Enter your marks of PHYSICS subject");
		p[count]=s1.nextInt();
		System.out.println("Enter your marks of CHEMISTRY subject");
		c[count]=s1.nextInt();
		System.out.println("Enter your marks of MATHS subject");
		m[count]=s1.nextInt();
		count++;
	}
	
	public void display()
	{
		
		for(i=0;i<count;i++)
		{
			System.out.println("Roll no is:"+roll[i]);
			System.out.println("YOUR PHYSICS marks is:"+p[i]);
			System.out.println("YOUR CHEMISTRY marks is:"+c[i]);
			System.out.println("YOUR MATHS marks is:"+m[i]+"\n\n");
		}
		
		for(i=0;i<count;i++)
		{
			tot[i]=p[i]+c[i]+m[i];
			pre[i]=tot[i]/3;
			System.out.println("Roll no is:"+roll[i]);
			System.out.println("Your total marks is:"+tot[i]);
			System.out.println("Your percentage is:"+pre[i]+"\n\n");
		}
	}
	
	public void grade()
	{
		for(i=0;i<count;i++)
		{
			System.out.print("The Grade of Roll no. "+roll[i]+" is:");
			if(pre[i]>=80)
			{
				System.out.println("A");
			}
			else if(pre[i]>=60 && pre[i]<80)
			{
				System.out.println("B");
			} 
			else if(pre[i]>=40 && pre[i]<60)
			{
				System.out.println("C");
			}
			else if(pre[i]>=35 && pre[i]<40)
			{
				System.out.println("D");
			}
			else 
			{
				System.out.println("fail");
			}				
		}
	}
}
class marksheetinterface
{
		public static void main(String args[])
		{	int n;
			D o=new D();
			do
			{
				System.out.println("press 1 for entry ");
				System.out.println("press 2 for display ");
				System.out.println("press 3 for grade ");
				System.out.println("press 4 for exit ");
				Scanner s2=new Scanner(System.in);
				n=s2.nextInt();
				
				switch(n)
				{
					case 1:
					o.add();
					break;
					
					case 2:
					o.display();
					break;
					
					case 3:
					o.grade();
					break;
					
					case 4:
					break;
					default:
					System.out.println("out of choice");
				}
			}while(n!=3);
		}
}
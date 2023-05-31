import java.util.*;
//update 

import javax.lang.model.util.ElementScanner14;
class A
{	
	int ic[]=new int[50];
	int ip[]=new int[50];
	int count=0,i,tot,t;
	void add()
	{
		Scanner s1 = new Scanner(System.in);
			System.out.println("ENTER THE ITEM CODE=");
			ic[count]=s1.nextInt();
			System.out.println("ENTER THE ITEM PRICE=");
			ip[count]=s1.nextInt();
		
		count++;
	}
}
class B extends A
{
		
		void display()
		{
				for(i=0;i<count;i++)
				{
					tot=tot+ip[i];
				}
				System.out.println("TOTAL OF SHOPPING PRICE ="+tot);
		}
		void remove()
		{
				int w;
				Scanner s2=new Scanner(System.in);
				System.out.println("ENTER THE ITEM CODE=");
				w=s2.nextInt();
				for(i=0;i<count;i++)
				{
					if(ic[i]==w)
					{
						ip[i]=0;
						System.out.println("Item removed");

					}
				}

		}
		void total()
		{
			for(i=0;i<count;i++)
				{
					System.out.println("ENTER THE ITEM CODE= \n"+ic[i]);
		
					System.out.println("ENTER THE ITEM PRICE=\n"+ip[i]);
					t=t+ip[i];
				}
				System.out.println("your total is :"+t);
		}
}
class Billing_system
{	
	
	public static void main(String args[])
	{	
		B o=new B();
		int n;
		
		do{
		System.out.println("Press 1 for adding items");
		System.out.println("Press 2 for display");
		System.out.println("Press 3 for removing items");
		System.out.println("Press 4 for total");
		System.out.println("Press 5 for exit");
		
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			switch(n)
			{
				case 1:
				o.add();
				break;
			
				case 2:
				o.display();
				break;
			
				case 3:
				o.remove();
				break;
				case 4:
				o.total();
				break;
				case 5:
	
				break;
				default:
				System.out.println("OUT OF CHOICE");
				
			}
		}while(n!=5);
		
		
	}
}

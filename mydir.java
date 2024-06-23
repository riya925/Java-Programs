import java.util.Scanner;

class dir
{
	String na,area,phno;
	Scanner scan;
	dir()
	{
		scan=new Scanner(System.in);
	}
	void input()
	{
		System.out.print("\n Enter the customer's name-area-phone number : ");
		na=scan.next();
		area=scan.next();
		phno=scan.next();
	}
	void show()
	{
		System.out.print("\n Customer's name is : "+na);
		System.out.print("\n Customer's area is : "+area);
		System.out.println("\n Customer's phone number is : "+phno);
	}
	void find(dir d[])
	{
		String a;
		System.out.print("\n The area is : ");
		a=scan.next();
		for(int i=0;i<d.length;i++)
		{
			if((d[i].area).equals(a))
			{
				System.out.println("\n The customer's name which lives in the given area is "+d[i].na);
			}
		}
	}
	void sort(dir d[])
	{
		dir t;
		for(int i=0;i<d.length;i++)
		{
			for(int j=i+1;j<d.length;j++)
			{
				if(((d[i].na).compareTo(d[j].na))>0)
				{
					t=d[i];
					d[i]=d[j];
					d[j]=t;
				}
			}
		}
	}		
}

public class mydir
{
	public static void main(String[] st)
	{
		int i;
		dir d[]=new dir[Integer.parseInt(st[0])];
		for(i=0;i<d.length;i++)
		{
			d[i]=new dir();
			d[i].input();
		}
		for(i=0;i<d.length;i++)
		{
			d[i].show();
		}
		d[0].find(d);
		d[0].sort(d);
		System.out.println("\n Sorted according to the customer name.... ");
		for(i=0;i<d.length;i++)
		{
			d[i].show();
		}
	}
}		
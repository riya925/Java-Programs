import java.util.*;

class queue
{
	int q[];
	int r,f,x;
	Scanner scan;
	queue(int size)
	{
		q=new int[size];
		r=-1;
		f=-1;
		scan=new Scanner(System.in);
	}
	void insert()
	{
		if(r==q.length-1)
		{
			System.out.println("\n Queue overflow.... ");
		}
		else
		{
			System.out.println("\n Enter the number to insert : ");
			x=scan.nextInt();
			q[++r]=x;
		}
	}
	void delete()
	{
		if(f==r)
		{
			System.out.println("\n Queue underflow.... ");
			f=r=-1;
		}
		else
		{
			x=q[++f];
			System.out.println("\n Deleted value is : "+x);
		}
	}
}
public class myqueue
{
	public static void main(String[] st)
	{
		Scanner scan=new Scanner(System.in);
		int ch=0;
		queue q1=new queue(Integer.parseInt(st[0]));
		while(ch!=3)
		{
			System.out.println("\n Queue menu.... ");
			System.out.println("1. Insert ");
			System.out.println("2. Delete ");
			System.out.println("3. Exit ");
			System.out.println("\n Select your choice : ");
			ch=scan.nextInt();
			switch(ch)
			{
				case 1:q1.insert();
					break;
				case 2:q1.delete();
					break;
			}
		}
	}
}
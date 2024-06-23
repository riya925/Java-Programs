import java.util.*;

public class count
{
	public static void main(String[] args)
	{
		int i,n;
		int pc=0,nc=0;

		Scanner scan=new Scanner(System.in);
		System.out.print("\n ENTER THE SIZE OF ARRAY : ");
		n=scan.nextInt();
		int a[]=new int[n];
		for(i=0;i<a.length;i++)
		{
			System.out.println(" ENTER THE ELEMENTS : ");
			a[i]=scan.nextInt();
		}
		for(int x:a)
		{
			if(x>=0)
			{
				pc++;
			}
			else
			{
				nc++;
			}
		}
		System.out.println(" POSITIVE NUMBER IS : "+pc);
		System.out.println(" NEGATIVE NUMBER IS : "+nc);
	}
}			
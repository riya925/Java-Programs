import java.lang.*;
import java.util.*;

public class Power
{
	public static void main(String[] st)
	{
		int n,m;
		int i,a=1;
		
		Scanner scan=new Scanner(System.in);
		System.out.print(" ENTER THE BASE : ");
		n=scan.nextInt();
		System.out.print(" ENTER THE POWER : ");
		m=scan.nextInt();

		for(i=1;i<=n;i++)
		{
			a=a*m;
		}

		System.out.println("\n THE BASE IS = "+n);
		System.out.println(" THE POWER IS = "+m);
		System.out.println(" ITS ANSWER IS = "+a);
	}
}
		
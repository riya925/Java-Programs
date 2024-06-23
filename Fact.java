import java.lang.*;
import java.util.*;

public class Fact
{
	public static void main(String[] st)
	{
		int n;
		int i,f=1;
		
		Scanner scan=new Scanner(System.in);
		System.out.print(" ENTER THE NO TO FIND FACTORIAL : ");
		n=scan.nextInt();

		for(i=1;i<=n;i++)
		{
			f=f*i;
		}

		System.out.println("\n THE NO IS = "+n);
		System.out.println(" ITS FACTORIAL IS = "+f);
	}
}
		
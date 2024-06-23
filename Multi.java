import java.lang.*;
import java.util.*;

public class Multi
{
	public static void main(String[] st)
	{
		int n;
		
		Scanner scan=new Scanner(System.in);
		System.out.print(" ENTER THE NO : ");
		n=scan.nextInt();
		System.out.print("\n");
		for(int i=1;i<=10;i++)
		{
			System.out.println(" MULTIPLICATION TABLE.... \n"+i+" * "+n+" = "+(i*n));
		}
	}
}
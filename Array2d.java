import java.util.*;

public class Array2d
{
	public static void main(String[] st)
	{
		int r,c,i,j;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("\n Enter the size of row : ");
		r=scan.nextInt();
		
		int a[][]=new int[r][];

		for(i=0;i<a.length;i++)
		{
			System.out.println("\n Enter the size of columns : ");
			c=scan.nextInt();
			a[i]=new int[c];
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.println("\n Enter no ["+i+"]["+j+"]");
				a[i][j]=scan.nextInt();
			}
		}
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.println(" "+y);
			}
			System.out.println("\n");
		}
	}
}
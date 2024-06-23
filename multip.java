import java.util.*;

public class multip
{
	public static void main(String[] st)
	{
		int i,j,k,r,c;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("\n Enter the row size : ");
		r=scan.nextInt();
		System.out.print("\n Enter the column size : ");
		c=scan.nextInt();

		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int m[][]=new int[r][c];

		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("\n Enter the elements of array : ");
				a[i][j]=scan.nextInt();
			}
		}

		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(" "+y);
			}
			System.out.print("\n");
		}

		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("\n Enter the elements of array : ");
				b[i][j]=scan.nextInt();
			}
		}

		for(int x[]:b)
		{
			for(int y:x)
			{
				System.out.print(" "+y);
			}
			System.out.print("\n");
		}

		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				for(k=0;k<c;k++)
				{
					m[i][j]=m[i][j]+a[i][k]*b[k][j];
				}
			}
		}

		System.out.println("\n Matrix multiplication is.... ");
		for(int x[]:m)
		{
			for(int y:x)
			{
				System.out.print(" "+y);
			}
			System.out.print("\n");
		}
	}
}
import java.util.Scanner;

public class cv81
{
	public static void main(String[] st)
	{
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		int q[]=new int[n];
		System.out.println("\n"+n);
		String s1=scan.nextLine();
		s1=s1.toLowercase();
		System.out.println(s1);
		for(int i=0;i<n;i++)
		{
			q=scan.nextInt();
		}
	}
}
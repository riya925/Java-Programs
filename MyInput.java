import java.util.*;

public class MyInput
{
	public static void main(String[] st)
	{
		int no;
		String na;
		float height;
		long sal;
		
		Scanner scan=new Scanner(System.in);
		System.out.print(" ENTER NO : ");
		no=scan.nextInt();
		System.out.print(" ENTER NAME : ");
		na=scan.next();
		System.out.print(" ENTER HEIGHT : ");
		height=scan.nextFloat();
		System.out.print(" ENTER SALARY : ");
		sal=scan.nextLong();

		System.out.println("\n NO = "+no);
		System.out.println("\n NAME = "+na+"\n HEIGHT = "+height);
		System.out.println("\n SALARY = "+sal);
	}
}
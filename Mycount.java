import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Mycount
{
	public static void main(String[] st)
	{
		String f1;
		int up=0,l=0,sp=0,dig=0,w=0,li=0,sc=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter file name : ");
		f1=scan.next();

		File f=new File("e:/java19//"+f1);
		if(!f.exists())
		{
			System.out.println("\n File doesnt exists.... ");
		}
		else
		{
			try
			{
				FileInputStream fis=new FileInputStream(f);
				int n=0;
				while(n!=-1)
				{
					n=fis.read();
					if(n>=65 && n<=90)
						up++;
					else if(n>=97 && n<=122)
						l++;
					else if(n==32)
						sp++;
					else if(n>=48 && n<=57)
						dig++;
					else if(n==13)
						li++;
					else
						sc++;
				}
				System.out.println("\n Upper case are : "+up);
				System.out.println("\n Lower case are : "+l);
				System.out.println("\n Spaces are : "+sp);
				System.out.println("\n digits are : "+dig);
				System.out.println("\n Words are : "+(sp+1));
				System.out.println("\n Lines are : "+li);
				System.out.println("\n Special character are : "+sc);
				fis.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
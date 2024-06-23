import java.io.*;
import java.util.*;

public class Myvowel
{
	public static void main(String[] st)
	{
		String f1;
		Scanner scan=new Scanner(System.in);
		System.out.println("\n Enter the filename : ");
		f1=scan.next();
		File f=new File(f1);
		if(!f.exists())
		{
			System.out.println("\n File doesn't exists.... ");
		}
		else
		{
			try
			{
				FileInputStream fis=new FileInputStream(f);
				int n=0,v=0,c=0;
				char ch;
				while(n!=-1)
				{
					n=
			}
		}
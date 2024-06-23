import java.io.*;
import java.util.*;

public class Middleline
{
	public static void main(String[] st)
	{
		String fna;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("\n Enter file : ");
		fna=scan.next();
		
		try
		{
			FileReader fr=new FileReader(fna);
			BufferedReader br=new BufferedReader(fr);
			String line="";
			int n=0,m,i=0;
			
			while(line!=null)
			{
				line=br.readLine();
				i++;
			}
			fr.close();
			m=i/2;
			i=0;
			line="";
			fr=new FileReader(fna);
			BufferedReader br1=new BufferedReader(fr);
			while(line!=null)
			{
				line=br1.readLine();
				i++;
				if(i>(m-5) && i<(m+5))
				{
					System.out.println(line);
				}
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
}
import java.io.*;
import java.util.*;

public class Mycon
{
	public static void main(String[] st)
	{
		Scanner scan=new Scanner(System.in);
		String f1,f2,f3;

		System.out.println("\n Enter file 1 : ");
		f1=scan.next();
		System.out.println("\n Enter file 2 : ");
		f2=scan.next();
		System.out.println("\n Enter file 3 : ");
		f3=scan.next();
		
		try
		{
			FileReader fr=new FileReader(f1);
			BufferedReader br=new BufferedReader(fr);
			String line="",data="";
			while(line!=null)
			{
				line=br.readLine();
				if(line!=null)
				{
					data=data+line+"\n";
				}
			}
			fr.close();
			
			FileWriter fw=new FileWriter(f3);
			fw.write(data);
			fw.close();
			
			fr=new FileReader(f2);
			br=new BufferedReader(fr);
			String data1="",line1="";
			while(line!=null)
			{
				line1=br.readLine();
				if(line1!=null)
				{
					data1=data1+line1+"\n";
				}
			}
			fr.close();
			fw=new FileWriter(f3,true);
			fw.append(data1); //fw.write(data1);
			fw.close();
			System.out.println("\n Successfully concenated.... ");
		}
		catch(Exception e)
		{
			System.out.println("\n Error : "+e.getMessage());
		}
	}
}
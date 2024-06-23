import java.io.*;
import java.util.*;

public class copy
{
	public static void main(String[] st) throws IOException
	{
		Scanner scan=new Scanner(System.in);
		
		BufferedReader br=new BufferedReader(new FileReader("File1"));
		FileWriter fw=new FileWriter("File2");
		
		String line="";
		String data="";
		
		while(line!=null)
		{
			line=br.readLine();
			data=data+line+"\n";
		}
		fw.write(data);
		
		br.close();
		fw.close();
	}
}
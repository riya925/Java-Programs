import java.io.*;

public class Countfile
{
	public static void main(String[] st)
	{
		File f=new File(st[0]);
		String cont[]=f.list();

		int fi=0,fo=0;
		for(int i=0;i<cont.length;i++)
		{
			File ff=new File(f,cont[i]);
			if(ff.isFile())
			{
				fi++;
				//System.out.println("\n"+cont[i]+"Is a file");
			}
			else
			{
				fo++;
				//System.out.println("\n"+cont[i]+"Is a folder");
			}
		}
		System.out.println("\n Files are : "+fi);
		System.out.println("\n Folders are : "+fo);
	}
}
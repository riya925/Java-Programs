import java.io.*;

public class Checkfile
{
	public static void main(String[] st)
	{
		File f=new File("e:\\java19");
		//File f=new File(st[0]);
		String cont[]=f.list();
		
		for(int i=0;i<cont.length;i++)
		{
			File ff=new File(f,cont[i]);
			if(ff.isFile())
			{
				System.out.println("\n"+cont[i]+"Is a file");
			}
			else
			{
				System.out.println("\n"+cont[i]+"Is a folder");
			}
		}
	}
}
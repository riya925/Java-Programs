import java.io.*;

public class Myfile
{
	public static void main(String[] st)
	{
		//File f=new File("java19");
		File f=new File(st[0]);
		String ext=st[1];
		String cont[]=f.list();
		
		for(int i=0;i<cont.length;i++)
		{
			if(cont[i].endsWith(ext))
			{
				System.out.println("\n"+cont[i]);
			}
		}
	}
}
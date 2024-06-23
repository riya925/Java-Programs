import java.io.*;
import java.util.*;

public class Mylist
{
	public static void main(String[] st)
	{
		File f=new File(st[0]);
		String cont[]=f.list();
		int m=Integer.parseInt(st[1]);
		int i;
		for(i=0;i<cont.length;i++)
		{
			File ff=new File(st[0],cont[i]);
			Date d=new Date(ff.lastModified());
			int mm=d.getMonth();
			mm++;
			if(mm>=m)
			{
				System.out.println("File name : "+cont[i]+"=="+mm);
			}
		}
   	}
}
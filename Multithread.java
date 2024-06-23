class child implements Runnable
{
	Thread th;
	int n;
	child(int n)
	{
		this.n=n;
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		System.out.println("Multiplication table for "+n+" is as follows");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
		System.out.println("\n");
	}
}

public class Multithread
{
	public static void main(String[] st)
	{
		int n;
		n=Integer.parseInt(st[0]);
		for(int i=1;i<=n;i++)
		{
			child c=new child(i);
			try
			{
				c.th.join();
			}
			catch(Exception e) { }
		}
	}
}	
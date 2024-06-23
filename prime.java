class child implements Runnable
{
	String na;
	int n;
	Thread th;
	child(String na,int n)
	{
		this.na=na;
		th=new Thread(this);
		this.n=n;
		th.start();
	}
	public void run()
	{
		//int count=50;
		int i;
		for(i=0;i<n;i++)
		{
			int j;
			for(j=2;j<i;j++)
			{
				int m=i%j;
				if(m==0)
					break;
			}
			if(i==j)
			{
				System.out.println("Name : "+th.getName());
				System.out.println(i);
			}
		}
	}
}
		
public class prime
{
	public static void main(String[] st)
	{
		int n=Integer.parseInt(st[0]);
		for(int i=1;i<(n-50);i++)
		{
			child c=new child("ABC",n);
		}
		try { Thread.sleep(500); }
		catch(Exception e) { }
		for(int j=(n+50);j<n;j++)
		{
			child c1=new child("DEF",n);
		}
	}
}
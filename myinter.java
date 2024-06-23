interface p1
{
	void show1();
}

abstract class p2 implements p1
{
	abstract void show2();
}

interface p3 extends p1
{
	void show3();
}

class p4 extends p2 implements p3
{
	public void show1()
	{
		System.out.println("\n I am in show1.... ");
	}
	void show2()
	{
		System.out.println("\n I am in show2.... ");
	}
	public void show3()
	{
		System.out.println("\n I am in show3.... ");
	}	
	void disp()
	{
		show1();
		show2();
		show3();
		System.out.println("\n I am in disp.... ");
	}
}

public class myinter
{
	public static void main(String[] st)
	{
		p4 p=new p4();
		p.disp();
	}
}	
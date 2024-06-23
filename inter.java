abstract class bank
{
	String bna,add;
	bank(String n,String a)
	{
		bna=n;
		add=a;
	}
	abstract void show();
}
interface atm
{
	int maxwithdraw=1000;
	void disp();
}
interface cheque
{
	int maxissue=500;
	void display();
}
class customer extends bank implements atm,cheque
{
	int cid;
	String cna;
	customer(String n,String a,int i,String cn)
	{
		super(n,a);
		cid=i;
		cna=cn;
	}
	void show()
	{
		System.out.println("\n Bank name is : "+bna);
		System.out.println("\n Bank address is : "+add);
	}
	public void disp()
	{
		System.out.println("\n Maximum withdraw is : "+maxwithdraw);
	}
	public void display()
	{
		System.out.println("\n Maximum issue is : "+maxissue);
	}
	void output()
	{
		show();
		disp();
		display();
		System.out.println("\n Customer's id is : "+cid);
		System.out.println("\n Customer's name is : "+cna);
	}
}
public class inter
{
	public static void main(String[] st)
	{
		customer c1=new customer("Axis bank","Sama",101,"Liya");
		c1.output();
	}
}		
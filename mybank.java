import java.util.*;

class bank
{
	Scanner scan;
	int id;
	String na;
	double op,cl,dep,wd,charge;
	bank()
	{
		scan=new Scanner(System.in);
		op=0;
		cl=0;
		dep=0;
		charge=0;
	}	
	bank(int id,String na,double op)
	{
		this.id=id;
		this.na=na;
		this.op=op;
		cl=op;
	}
	void deposit()
	{
		double d;
		System.out.println("\n Enter the deposit you want to : ");
		d=scan.nextDouble();
		cl=cl+d;
		dep=dep+d;
	}
	void withdraw()
	{
		double w;
		System.out.println("\n Enter the amount to withdraw : ");
		w=scan.nextDouble();
		if(w>cl)
		{
			System.out.println("\n Insufficiant balance.... ");
		}
		else if(w>(cl-op+charge))
		{
			String ch="y";
			System.out.println("\n Balance below opening balance.... ");
			System.out.println("\n Are you sure?? ");
			ch=scan.next();
			if(ch=="y" || ch=="Y")
			{
				wd=wd*w;
				cl=cl-(w*100);
				charge=charge+100;
				System.out.println("\n Withdrawal done successfully.... ");
			}
		}
	}
	void show()
	{
		System.out.println("\n Name of the bank is :"+"Axis bank....");
		System.out.println("\n Customer name is : "+na);
		System.out.println("\n Customer id is : "+id);
		System.out.println("\n Customer opening balance is : "+op);
		System.out.println("\n Customer closing balance is : "+cl);
		System.out.println("\n Customer withdrawal is : "+wd);
		System.out.println("\n Customer charge is : "+charge);
	}
}

public class mybank
{
	public static void main(String[] st)
	{
		bank b1=new bank(Integer.parseInt(st[0]),st[1],Double.parseDouble(st[2]));
		b1.deposit();
		b1.show();

		/*b1.withdraw();
		b1.show();*/
	}
} 
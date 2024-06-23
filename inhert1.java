class employee
{
	int id;
	String na;
	employee(int id,String na)
	{
		this.id=id;
		this.na=na;
	}
	void show()
	{
		//System.out.println("\n Employee class.... ");
		System.out.println("\n Employee id is : "+id);
		System.out.println("\n Employee name is : "+na);
	}
}
class commission extends employee
{
	double sales,totalpay;
	commission(int i,String n,double sales)
	{
		super(i,n);
		this.sales=sales;
	}
	void show()
	{
		System.out.println("\n Commission class.... ");
		super.show();
		totalpay=(sales*0.1);
		System.out.println("\n Sales is : "+sales);
		System.out.println("\n the total pay is : "+totalpay);
	}
}
class permanent extends employee
{
	double salary;
	permanent(int i,String n,double salary)
	{
		super(i,n);
		this.salary=salary;
	}
	permanent(int i,String n)
	{
		super(i,n);
	}
	void show()
	{
		//System.out.println("\n Permanent class.... ");
		super.show();
		System.out.println("\n Salary is : "+salary);
	}
}
class monthly extends permanent
{
	double hra,da,totalsal;
	monthly(int i,String n,double s)
	{
		super(i,n,s);
	}
	void show()
	{
		System.out.println("\n Monthly class.... ");
		super.show();
		hra=(salary*0.1);
		da=(salary*0.01);
		totalsal=(salary+hra+da);
		System.out.println("\n Hra is : "+hra);
		System.out.println("\n Da is : "+da);
		System.out.println("\n Total salary is :"+totalsal);
	}
}
class hourly extends permanent
{
	int hr,pay;
	hourly(int i,String n,int h,int p)
	{
		super(i,n);
		hr=h;
		pay=p;
	}
	void show()
	{
		System.out.println("\n Hourly class.... ");
		salary=(hr*pay);
		super.show();
		System.out.println("\n Hours is : "+hr);
		System.out.println("\n Pay is : "+pay);
		//System.out.println("\n Salary is : "+salary);
	}
}
public class inhert1
{
	public static void main(String[] st)
	{
		commission c1=new commission(101,"liya",10000);
		monthly m1=new monthly(102,"avani",2000);
		hourly h1=new hourly(103,"dhruv",14,500);

		c1.show();
		m1.show();
		h1.show();
	}
}
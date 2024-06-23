class student
{
	int sid,sage;
	String sna;
	student()
	{ }
	student(int sid,int sage,String sna)
	{
		this.sid=sid;
		this.sage=sage;
		this.sna=sna;
	}
	void show()
	{
		System.out.println("\n Details of students.... ");
		System.out.println("\n Students id is : "+sid);
		System.out.println("\n Students age is : "+sage);
		System.out.println("\n Students name is : "+sna);
	}
}
class computer extends student
{
	int c,cpp,java;
	float per,tot;
	computer(int id,int age,String na,int c,int cpp,int java)
	{
		super(id,age,na);
		this.c=c;
		this.cpp=cpp;
		this.java=java;
	}
	void display()
	{
		tot=c+cpp+java;
		per=tot/3;
		show();
		System.out.println("\n Subjects,total and percentage of student are .... ");
		System.out.println("\n Marks in c is : "+c);
		System.out.println("\n Marks in cpp is : "+cpp);
		System.out.println("\n Marks in java is : "+java);
		System.out.println("\n Total of student is : "+tot);
		System.out.println("\n Percentage of student is : "+per);
	}
}
class mech extends student
{
	int eg,mos,eee;
	float t,p;
	mech(int id,int age,String na,int eg,int mos,int eee)
	{
		super(id,age,na);
		this.eg=eg;
		this.mos=mos;
		this.eee=eee;
	}
	void show()
	{
		super.show();
		t=eg+mos+eee;
		p=t/3;
		System.out.println("\n Subjects,total and percentage of student are .... ");
		System.out.println("\n Marks in eg is : "+eg);
		System.out.println("\n Marks in mos is : "+mos);
		System.out.println("\n Marks in eee is : "+eee);
		System.out.println("\n Total of student is : "+t);
		System.out.println("\n Percentage of student is : "+p);
	}
}
public class inhert
{
	public static void main(String[] st)
	{
		computer c1=new computer(101,20,"riya",90,80,70);
		mech d1=new mech(102,19,"avani",50,60,70);
		c1.display();
		d1.show();
	}
}	
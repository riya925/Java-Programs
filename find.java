public class find
{
	public static void main(String[] st)
	{
		int i,m1,m2;
		int a[]=new int[st.length];
		for(i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(st[i]);
		}
		m1=a[0];
		m2=a[0];
		for(i=0;i<a.length;i++)
		{
			if(m1>a[i])
			{
				m1=a[i];
			}
		}
		System.out.print("\n maximum no is : "+m1);
		for(i=0;i<a.length;i++)
		{
			if(m2<a[i])
			{
				m2=a[i];
			}
		}
		System.out.print("\n maximum no is : "+m2);
	}
}
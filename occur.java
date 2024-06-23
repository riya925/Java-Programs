public class occur
{
	public static void main(String[] st)
	{
		int i,count=0;
		String s1=st[0];
		char c=st[1].charAt(0);

		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==c)
			{
				count++;
			}
		}
		System.out.print("\n The occurence is : "+count);
	}
}
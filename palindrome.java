public class palindrome
{
	public static void main(String[] st)
	{
		String a=st[st.length-1];
		String b="";
		for(int i=(a.length()-1);i>=0;i--)
		{
			b=b+a.charAt(i);
		}		
		if(a.equalsIgnoreCase(b))
			System.out.print("\n The string is a palindrome.... ");
		else
			System.out.print("\n The string is not a palindrome.... ");
	}
} 
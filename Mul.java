public class Mul
{
public static void main(String []s)
{
int sum=1;
int a=Integer.parseInt(s[0]);
for(int i=1;i<=a;i++)
{
sum*=i;
}
System.out.println("\n\n"+sum);
}
}
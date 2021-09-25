public class Assessment3
{
static int s1;
static int s2;
static int s3;
static
{
s1 = 10;
s2 = 20;
s3 = 30;
s2 = s1;
s3 = s2;
}
public static void main(String args[])
{
System.out.print(s1+" "+s2+" "+s3);
}
}
public class Assessment
{
public static void main(String[] args) {
int a[]={1,2,3,4,5};
int j = calc(a.length);

for(int i=0;i<=j-3;i++)
{
System.out.print(a[i]+" ");
}
}
static int calc(int a)
{
return a+2;
}
}
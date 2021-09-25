class Assessment5
{
public static void main(String[] args)
{
String[] a = {"Work Hard","Get placed","Get dream","Job"};
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
if(a[i].equals("Job"))
continue;
System.out.println("get successfull in life.");
break;
}
}
}
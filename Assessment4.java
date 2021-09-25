class Assessment4
{
public static void main(String[] args)
{
String s1 = "DreamFactory";
String s2 = "Assessments";
System.out.println(s1+" "+s2);
String s3 = s1;
String s4 = s2;
System.out.println(s3+" "+s4);
String s5 = (s3+s4).concat(s1+s2);
System.out.println(s5);
}
}


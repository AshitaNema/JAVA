//class Assessment6 {
//public static void main(String[] args) {
//char ch = 'I';
//int in= (char)'I';
//System.out.println(ch);
//System.out.println(in);
//}
//}

//class Assessment6{
//public static void main(String[] args) {
//byte n, a;
//n = 127;
//a=180;
//System.out.println(n);
//System.out.println(a);
//}
//}
//
//class Assessment6 {
//public static void main(String args[]) {
//int a[2];
//System.out.println(a[0]);
//System.out.println(a[1]);
//}
//}
//
//class Assessment6
//{
//public static void main (String[] args)
//{
//int arr1[] = {1, 2, 3};
//int arr2[] = {1, 2, 3};
//if (arr1 == arr2)
//System.out.println("Pass");
//else
//System.out.println("Fail");
//}
//}

//class Assessment6
//{
//public static void main (String[] args)
//{
//int a1[] = {null, 2, 3};
//int a2[] = {1, null, 3};
//if (a1 == a22)
//System.out.println(“Equal”);
//else
//System.out.println(“Not Equal”);
//}
//}

//class Assessment6 {
//private final String string1, string2;
//public Assessment6(String string2, String string1) {
//this.string1 = string2;
//this.string2 = string1;
//}
//public String toString() {
//return string1 + " " + string2 + " KodNest";
//}
//public static void main(String[] args) {
//Assessment6 a = new Assessment6("Welcome", "To");
//System.out.println(a);
//}
//}
//
//public class Assessment6{
//public static void main(String[] args) {
//String s = "KodNest Technologies";
//for (int i = 0; i < s.length(); i++) {
//if (i % 3 == 0) continue;
//if (i == 12) break;
//if (i == 9) return;
//System.out.print(s.charAt(i));
//}
//}
//}

class Assessment{
public static void main(String[] args) {
String in = "198";
int n = 5;
while (n > 0) {
char[] line = in.toCharArray();
int i = line.length – 1;
if (line[i] % 2 != 0) {
line[i]-–;
}
System.out.print(line);
System.out.print(” “);
n–;
}
}
}
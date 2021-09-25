package com.kodnest.learning.stringprograms;

class Test
{
public static void main(String[] args)
{
int a=1;
int b=++a;
if((a==++b)|(a++==b))
{
a+=b;
}
System.out.println(a);
}
}
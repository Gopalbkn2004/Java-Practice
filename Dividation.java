import java.util.Scanner;
class Quatient
{ 
int a,b;
void Quotiont(int a1,int a2)
{
a=a1;
b=a2;
System.out.println("Quotient:"+a/b);
}

void Remainder(int x,int y)
{
a=x;b=y;
System.out.println("Remainder :"+(a%b));
}
}

class Dividation
{
public static void main(String[] ar)
{
Scanner rv1=new Scanner(System.in);
Quatient rv=new Quatient();
  System.out.println("enter the value:");
int a=rv1.nextInt();
  System.out.println("enter the value:");
int b=rv1.nextInt();
  rv.Quotiont(a,b);
  rv.Remainder(a,b);
  rv1.close();
}}
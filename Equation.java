import java.util.Scanner;


class Equation
{
public static void main(String ar[])
{
First rv=new First();
int a,b,c;
Scanner a1 = new Scanner(System.in);
System.out.print("Enter the value of a :- ");
a = a1.nextInt();

System.out.print("Enter the value of b :- ");
b = a1.nextInt();

System.out.print("Enter the value of c :- ");
c = a1.nextInt();

rv.area(a,b,c);
a1.close();
}}

class First
{
void area(int x,int y,int z)
{
int a=x,b=y,c=z,s;
s=(a+b+c)/2;
System.out.println(s);
double result=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println(result);

}}
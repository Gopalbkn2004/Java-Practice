import java.util.Scanner;
class FloatAdd
{
public static void main(String[] a1)
{
Scanner rv1=new Scanner(System.in);
System.out.print("enter the Float number:");
float x=rv1.nextFloat();
System.out.print("enter the Float number:");
float y=rv1.nextFloat();
Add rv2=new Add();
Float a11=rv2.Fadd(x,y);
System.out.println(a11);
rv1.close();
}
}

class Add
{
float Fadd(float a,float b)
{
Float a1=a;float b1=b;
return (a1+b1);
}}
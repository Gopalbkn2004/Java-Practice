import java.util.*;
class User3
{
    public static void main(String[] as)
    {
        int a,a1;
        double b,b1;
        First rv1=new First();
        Scanner r1=new Scanner(System.in);
        System.out.println("enter the value :");
        a=r1.nextInt();
        System.out.println("enter the value :");
        a1=r1.nextInt();
        System.out.println("enter the value in Double :");
        b=r1.nextDouble();
        System.out.println("enter the value Double :");
        b1=r1.nextDouble();
        rv1.sum(a,a1);
        rv1.divide(b,b1);
        r1.close();

    }

}
class First
{
void sum(int a,int b)
{System.out.println("Add A & B values :"+(a+b));}
void divide(double a,double b)
{
    System.out.println("Dividation of A & B Values:"+(a/b));}
}


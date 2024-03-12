class Squ
{
public static void main (String[] ar)
{
SquareRoot rv1=new SquareRoot();
rv1.squEqu(10,2);
}
}

class SquareRoot
{
void squEqu(int x,int y)
{
int a=x,b=y;
double r=Math.pow(a,2)-Math.pow(b,2);
double result=Math.sqrt(r);
System.out.println(result);
}

}

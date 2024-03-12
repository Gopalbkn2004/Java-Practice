class User
{
public static void main(String ar[])
{
First rvi=new First();
rvi.add();
rvi.mul();
rvi.sub();
rvi.div();
}
}

class First
{
int a,b;
void add()
{
a=10;
b=20;
System.out.println( "Addition:"+(a+b));
}
void mul()
{
a=20;
b=2;
System.out.println("Multipletion:"+a*b);
}
void div()
{
a=20;
b=2;
System.out.println("Division:"+a/b);
}
void sub()
{
a=20;
b=2;
System.out.println(a-b);

}


}

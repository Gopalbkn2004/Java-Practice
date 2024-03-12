public class single_Level_Inheritance 
{
    public static void main(String[] arg)
    {
    Sub o1=new Sub();
    o1.sub();
    o1.display();
    }
}

class Add
{
    int a=20,b=10,c;
    void add()
    {
        c=a+b;
    }
}
class Sub extends Add{
    void sub()
    {
        c=a-b;
    }
    void display()
    {
        System.out.println(c);
    }
}

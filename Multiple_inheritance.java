public class Multiple_inheritance {
    

    public static void main(String[] arg)
    {
    Sub o1=new Sub();
    o1.sub();
    o1.display();
    o1.div();
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
class Divide extends Add
{
    void div()
    {
        c=a/b;
    }
}
class Sub extends Divide{
    void sub()
    {
        c=a-b;
    }
    void display()
    {
        System.out.println(c);
    }
}


public class Reference 
{
    public static void main(String[] as)    
    {
        Text ob=new Text();
        System.out.println(ob.num);
        ob.increase(ob);
        System.out.println(ob.num);
    }
}

class Text
{
    int num;
    Text()
    {
        num=10;
    }
    public void increase(Text ob1)
    {
        ob1.num+=100;
    }
}


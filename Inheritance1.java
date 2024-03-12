class Base
{
    int num1;
    void baseShow()
    {
        System.out.println(num1);
    }
}
class Derived extends Base
{
    int num2;
    void produced()
    {
        System.out.println(num1*num2);
    }
    void DerivedShow()
    {
        System.out.println(num2);
    }
}
public class Inheritance1 
{
    public static void main(String[] args) {
        Derived d1=new Derived();
        d1.num1=20;
        d1.baseShow();
        d1.num2=10;
        d1.DerivedShow();
        d1.produced();
    }   
}


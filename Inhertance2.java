public class Inhertance2
{
    public static void main(String[] args) 
    {
        Derived d1 = new Derived();
        d1.SetData(10);
        //d1.getData();
        d1.Produced();
      //  d1.DerivedShow();     
    }
}
 class Base
{
    private int num1;
    public void SetData(int n)
    {
        num1=n;
    }
    public int getData()
    {
        return num1;
    }
}
class Derived extends Base
{
    int num2=5;
    public void Produced()
    {
        int num=getData();
        System.out.println(num2*num);
    }
    public void DerivedShow()
    {
        System.out.println(num2);
    }
}

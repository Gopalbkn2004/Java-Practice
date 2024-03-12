public class ParameterisedConstructor
{
       public static void main(String ar[])
       {
        Ractangle rv1=new Ractangle(5,6);
        int a=rv1.area();
        System.out.println(a);
        Ractangle rv2=new Ractangle(10,2);
        System.out.println(rv2.area());
       } 
}
class Ractangle
{
    int length,breadth;
    Ractangle(int l,int b)
    {
      length=l;
      breadth=b;
    }
    int area()
    {
        return(length*breadth);
    }

}

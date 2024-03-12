class Copyconstructor 
{
    public static void main(String[] as)
    {
      Rectangle rv1=new Rectangle(5,6);
      Rectangle rv2=new Rectangle(rv1);
      System.out.println(rv1.area());
       System.out.println(rv2.area());
    }
}

class Rectangle
{
    int length,breadth;
    Rectangle(int l,int b)
    {
        length=l;breadth=b;
    }
    Rectangle(Rectangle o1)
    {
      length=o1.length;
      breadth=o1.breadth;
    }
    int area()
    {
        return(length*breadth);
    }
}

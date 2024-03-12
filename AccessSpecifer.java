public class AccessSpecifer 
{
    public static void main(String[] ar)
    {
      Rectangle rv1=new Rectangle();
      rv1.l=10;
      rv1.b=20;
      System.out.println(rv1.area());
      Rectangle.rcount=5;
      System.out.println(Rectangle.rcount);

    }
    
    
}
class Rectangle
{
  public int l,b;
  static int rcount=0;
  Rectangle()
  {
    rcount++;
  }
  public int area()
  {
    int result;
    result=l*b;
    return(result);
  }
}

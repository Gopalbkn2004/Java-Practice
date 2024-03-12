public class ConOverlooading 
{ 
           public static void main(String ar[])
           {
             Ractangle1 rv0=new Ractangle1();
             System.out.println(rv0.area());
            Ractangle1 rv1=new Ractangle1(5);
            int a=rv1.area();
            System.out.println(a);
            Ractangle1 rv2=new Ractangle1(10,2);
            System.out.println(rv2.area());
           } 
    }
    class Ractangle1
    {
        int length,breadth;
        Ractangle1()
        {
            length=1; breadth=2;
        }
        Ractangle1(int s)
        {
            length=s;breadth=s;
        }

        Ractangle1(int length,int breadth)
        {
          this.length=length;
          this.breadth=breadth;
        }
        int area()
        {
            return(length*breadth);
        }
    
    }
    

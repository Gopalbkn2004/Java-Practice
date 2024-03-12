class First{
    static int num[]=new int[5];
     static{
        for(int i=0;i<num.length;i++)
        {
            num[i]=(int)(15*Math.random());
        }
     }
     void display()
     {System.out.println("Initialize a value");
        for(int i=0;i<num.length; i++)
        {
            System.out.println(num[i]);
        }
     }
}
public class Initialize 
{
    public static void main(String[] ar)
    {
        First r1=new First();
        First r2=new First();
        r1.display();
        r2.display();        
    }  
}

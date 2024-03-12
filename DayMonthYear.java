import java.util.*;
public class DayMonthYear 
{
    public static void main(String[] ar)
    {
     DMY o1=new DMY();
     o1.input();
     o1.display();
     //o1.result();
    }
    
}
class DMY
{
    int d,m,y;
    void input()
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the Date:");
        d=s1.nextInt();
        System.out.print("Enter the Month:");
        m=s1.nextInt();
        System.out.print("Enter the Year:");
        y=s1.nextInt();
        s1.close();
    }
    void result()
    {
    int y1=y%100;
       // int d1=d%7;
       if(y1%4==0)
       {
         switch(m)
        {
            case 1:
            m=0;
            break;
            case 2:
            m=3;
            break;
            case 3:
              m=4;
              break;
            case 4:
              m=0;
              break;
            case 5:
              m=2;
              break;
            case 6:
               m=5;
               break;
            case 7:
               m=0;
               break;
            case 8:
               m=3;            
               break;
            case 9:
               m=6;
               break;
            case 10:
               m=1;
              break;
            case 11:
               m=4;
                break;
            case 12:
              m=6;
              break;
        }
       }
       else
       {
        switch(m)
        {
            case 1:
              m=1;
              break;
            case 2:
              m=4;
              break;
            case 3:
              m=4;
              break;
            case 4:
              m=0;
              break;
            case 5:
              m=2;
              break;
            case 6:
               m=5;
               break;
            case 7:
               m=0;
               break;
            case 8:
               m=3;            
               break;
            case 9:
               m=6;
               break;
            case 10:
               m=1;
              break;
            case 11:
               m=4;
                break;
            case 12:
              m=6;
              break;
        }
    }
      //  int y1=y%100;
        int leap=(y-2000)/4;
       int total=(d+m+y1+6+leap)%7;
switch(total)
{
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("Monday");
        break;
    case 3:
        System.out.println("Tuesday");
        break;
    case 4:
        System.out.println("Wednesday");
        break;
    case 5:
        System.out.println("Thursday");
        break;
    case 6:
        System.out.println("Friday");
        break;
    case 7:
        System.out.println("Saturday");
        break;
    case 0:
        System.out.println("Saturday");
        break;

}

    }
    void display()
    {
        if((d<=31 && m<=12 ) && (d>=0 && m>=0))
        {
        result();
        }
        else
        {
         System.out.println(" Invalid value");
        }
    }


}

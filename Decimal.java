import java.util.Scanner;
import java.util.Vector;
public class Decimal 
{
  public static void main(String[] as)
  {
    int[] a=new int[100];
    long b;
    int b1=0,i=0,n;//p=0;//re=0;
    Scanner r1=new Scanner(System.in);
    System.out.print("Enter the decimal value:");
    b=r1.nextLong(); 
    System.out.println("1. Binary\n2. octal\n3.Hexa decimal \n");
    System.out.print("Enter the value:");
    n=r1.nextInt();
    r1.close();
    if(n==1)
    {
       while(b>0)
       {
          a[i++]=(int)b%2;
           b=b/2;
           b1++;
        }
        for(i=b1-1;i>=0;i--)
        {
         System.out.print(a[i]);
        }
    }
    if(n==2)
    {
      while(b>0)
      {
         a[i++]=(int)b%8;
         b=b/8;
         b1++;
      }
      for(i=b1-1;i>=0;i--)
      {
        System.out.print(a[i]);
      }
    }
    if(n==3)
    {
       while(b>0)
       {
           a[i++]=(int)b%16;
           b=b/16;
           b1++;
        }
        for(i=b1-1;i>=0;i--)
        {
             if(a[i]==10)
             {
                System.out.print('A');
             }
             if(a[i]==11)
             {
                System.out.print('B');
             }
             if(a[i]==12)
             {
               System.out.print('C');
             }
             if(a[i]==13)
             {
                System.out.print('D');
             }
             if(a[i]==14)
             {
                System.out.print('E');
             }
             if(a[i]==15)
             {
                System.out.print('F');
             }
             if(a[i]>=0 && a[i]<=9)
                System.out.print(a[i]);
        }
    }
   r1.close();
  }
}

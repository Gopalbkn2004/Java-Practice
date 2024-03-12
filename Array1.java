 import java.util.*;
 class Array
 {
    int a=0,b=0;
    Scanner rv1=new Scanner(System.in);
    static int num[]=new int[5];
    {
        for(int i=0;i<num.length;i++)
        {
            System.out.print("Enter the value of "+(i+1)+":");
            num[i]=rv1.nextInt();
            b++;
        }
        for(int j=0;j<num.length;j++)
        {
            a=a+num[j];
        }
    }
    void display()
    {
        System.out.println("Sum of Array :" +a);
        System.out.println("Average of an Array :" +(a/b));
    } 
}
class Array1
{
    public static void main(String[] ar)
    {
      Array r1=new Array();
       r1.display();
    }
}

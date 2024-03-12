    import java.util.Scanner;
public class FindIndexno {
    public static void main(String as[])
    { 
        int c=0,z=0;
    int a[]={12,23,43,4,5};
    Scanner r1=new Scanner(System.in);
    System.out.println("enter the  data :");
    int b=r1.nextInt();  
    for(int i=0;i<a.length;i++)
    {
        c++;
        if(b==a[i])
        { 
            System.out.println("Index number of an "+(b)+" number:"+c);
            break;
        }
        else
        {
          z+=1;
        }
        
        }
        if(z>1)
        {
         System.out.println("Data not found");
        }
r1.close();
}
}

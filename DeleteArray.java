import java.util.Scanner;
public class DeleteArray 
{ 
    public static void main(String as[])
    { 
        Scanner r1=new Scanner(System.in);    
         int a[]=new int[5];
    {
        for(int z=0;z<5;z++)
        {
        System.out.print("Enter the value of "+(z+1)+":");
        a[z]=r1.nextInt();
        }
    }
        System.out.print("enter the delete data :");
        int b=r1.nextInt();  
        for(int i=0;i<a.length;i++)
        {   
          if(a[i]==b)
          { 
            for(int j=i;j<a.length-1;j++)
            {
                a[j]=a[j+1];
            }
            break;
         } 
        }
         for(int i=0;i<a.length-1;i++)
          {
             System.out.println(a[i]);
          }
          r1.close();
    }
}

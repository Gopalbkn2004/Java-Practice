import java.util.Scanner;
public class Del
 {
    public static void main(String as[])
    { 
        Scanner r1=new Scanner(System.in);    
         int a[]=new int[5];
         int n=0;
         for(int z=0;z<5;z++)
        {
          System.out.print("Enter the value of "+(z+1)+":");
          a[z]=r1.nextInt();
        }
          System.out.print("enter the delete data :");
          int b=r1.nextInt(); 
         for(int i=0;i<a.length;i++)
         {   
           if(a[i]==b)
           { n++;}
         }
         for(int i=0;i<a.length;i++)
         {   
          if(a[i]==b)
          { 
            for(int j=i;j<a.length-1;j++)
            {
                a[j]=a[j+1];
            }
          } 
        }
        for(int i=0;i<a.length;i++)
        {   
          if(a[i]==b)
          { 
            for(int j=i;j<a.length-1;j++)
            {
                a[j]=a[j+1];
            }
         } 
        }
        for(int i1=1;i1<a.length;i1++)
        {
          if(n==i1)
         {
            System.out.println("Data Deleted");
            for(int i=0;i<a.length-i1;i++)
            {
              System.out.println(a[i]);
            }
         }
        }
         if(n==0)
         {
            System.out.println("Data not Found");
            for(int i=0;i<a.length;i++)
            {
              System.out.println(a[i]);
            }
        }
          r1.close();
    }
}
    


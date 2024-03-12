import java.util.Scanner;
class FindArray
{ 
    public static void main(String as[])
    {
        int t=0;
      int a[]={12,23,43,54,54};
      Scanner r1=new Scanner(System.in);
      System.out.println("enter the find data :");
      int b=r1.nextInt();  
      for(int i=0; i<a.length; i++)
        {
           if(a[i]==b)
           {
            t++;
           }
         }
        if(t>0)
        {
         System.out.println("Your data Find");
        }
        else
        {
         System.out.println("Please Enter the correct data");           
        }
    
     r1.close();
    }
}

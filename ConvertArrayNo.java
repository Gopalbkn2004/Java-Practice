import java.util.*;
class ConvertArrayNo 
{
    public static void main(String[] as)
    {
      Scanner rv1=new Scanner(System.in);
      System.out.print("Enter the value :");
       int a=rv1.nextInt();
      int a1[]={1,2,3,4,5,6,7};
      for(int i=7-a;i<a1.length;i++)
      {
        System.out.print(a1[i]);
      }
      for(int z=0; z<7-a;z++)
       {
         System.out.print(a1[z]);
       }
      rv1.close();
    }
}

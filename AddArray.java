public class AddArray 
{
    public static void main(String[] as)
    {
        int e1;
        int a[]={9,8,6,6,5};
        int b[]={1,2,5,9,6};
        int[] c=new int[5];
        System.out.print(" ");
        for(int i=0;i<=4;i++)
        {
         System.out.print(a[i]);
        }
         System.out.print("\n+");
        for(int i=0;i<=4;i++)
        {
         System.out.print(b[i]);
        }
        System.out.print("\n -----\n ");
        for(int i=0;i<=4;i++)
        {
         c[i]=a[i]+b[i];
         }
         for (int i=4;i>0;i--)
        {
          if(c[i]>=9)
          {
            e1 = c[i] /10;
            c[i]=c[i]%10;
            c[i-1] += e1;
           }
        }
         for(int j=0;j<=4;j++)
        { 
          System.out.print(c[j]);
        }
    } 
}

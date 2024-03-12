import java.util.*;
class Ran 
{
    public static void main(String[] as)
    {
       Scanner r1=new Scanner(System.in);
        int a[]=new int[10];
        // int b[]=new int[10];
        for(int z=1;z<a.length;z++)
        {
            System.out.print("Enter the value :");
            a[z]=r1.nextInt();
        }

        // for(int i=1;i<=10;i++)
        // {
        //     if((a[i] == 1) || (a[i] == 2) || (a[i] == 3) || (a[i] == 4) || (a[i] == 5) || (a[i] == 6) || (a[i] == 7) || (a[i] == 8) || (a[i] == 9) || (a[i] == 10))

        //     {
                 
        //         continue ;
               
        //     }
        //     else {System.out.print(a[i]);}
            
        //     }
        
        for(int i=1;i<11;i++)
        {
            for (int l=0;l<=9;l++)
            {
                if (a[l]==i)
                {  
                   break;                                 
                }
                if (l==9)
                {
                    System.out.print(+i+" ");
                }
            }
        }
        r1.close();
    }
}

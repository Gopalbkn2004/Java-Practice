import java.util.Scanner;
public class SortFindNearNo 
{
    public static void main(String[] args) 
    {
        int j,tan,ask,index=0, flag=0;
        Scanner r1=new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = r1.nextInt();
        }
        for(int i=0;i<num.length-1;i++)
        {
           for(j=0;j<num.length-1-i;j++)
           {
              if(num[j]>num[j+1])
               {
                 tan=num[j];
                 num[j]=num[j+1];
                 num[j+1]=tan;
                }
            }
        }
         for(int i=0;i<num.length;i++)
         {
            System.out.print(num[i]+" ");
         }
            System.out.print("\nEnter the number :");
            ask=r1.nextInt();
            for(int i=0;i<num.length;i++)
            {
                if(ask==num[i])
                { 
                    flag=i;
                    index=1;
                    break;
                }   
                else
                {
                index++;                    
                 }
            }
            if(index==1)
            {
            System.out.println("Index number of an "+(flag)+" number:"+ask);

            }
            else
            {
              System.out.println("Index number of an "+(index-1)+" number:"+ask);
            }
            r1.close();
    }    
}

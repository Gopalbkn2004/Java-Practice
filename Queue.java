import java.util.Scanner;
public class Queue 
{
    public static void main(String[] as)
    {
    int[] num=new int[10];
    int[] b=new int[10];
    int[] c=new int[10];
    int[] d=new int[10];
    int b1=0,c1=0,d1=0,z=0,x=0,v=0;
    // int c1=0;
    // int d1=0;
    // int z=0,x=0,v=0;
        Scanner s1=new Scanner(System.in);
    for(int i=0;i<10;i++)
    {
        System.out.print("Enter the value"+(i+1)+" :");
         num[i]=s1.nextInt();
    }
    for(int i=0;i<10;i++)
    {
    if(num[i]==1)
    {
        b[z++]=num[i];
        b1++;
    }
    else if(num[i]==2)
    {
        c[x++]=num[i];
        c1++;
    }
    else if(num[i]==3)
    {
        d[v++]=num[i];
        d1++;
    }
}
  for(int i=0;i<b1;i++)
   {System.out.print(b[i]);}
   System.out.print('\n');
  for(int i=0;i<c1;i++)
   {System.out.print(c[i]);}
      System.out.print('\n');
  for(int i=0;i<d1;i++)
   {System.out.print(d[i]);}
   s1.close();
}
}

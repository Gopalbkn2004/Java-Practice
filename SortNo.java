public class SortNo 
{
    public static void main(String[] ar)
    {
        int data[]={1,45,1,20,10};
        System.out.print("Unshorted List :");
        display(data);
        show(data);
        System.out.print("\nSorted list is :");
        display(data);
    }
    static void display(int num[])
    {
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
    static void show(int num[])
    {
        int i,j,tan;
        for(i=0;i<num.length;i++)
        {
            for(j=0;j<num.length-1;j++)
            {
                if(num[j]>num[j+1])
                {
                    tan=num[j];
                    num[j]=num[j+1];
                    num[j+1]=tan;
                }
            }
        }
    }
}

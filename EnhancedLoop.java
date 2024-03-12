public class EnhancedLoop 
{
    public static void main(String as[])
    {
        int num[]={10,20,30,40,50};
        System.out.println("Display element using index for loop");
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println("\n"+"Display element using Enhanced for loop");
        for(int i:num)
        {
            System.out.print(i+" ");
        }
    }
}

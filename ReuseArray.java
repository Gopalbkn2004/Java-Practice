public class ReuseArray
{
    public static void main(String[] ar)
    {
     int[] num=new int []{20,33,44,55,55};
     System.out.println("element in orignal Array");
     for(int i=0;i<num.length;i++)
    {
        System.out.println(num[i]+" ");
    }
     System.out.println("element in new Array");
     num=new int[]{10,20,30,40,50};
     for(int i=0;i<num.length;i++)
     {
        System.out.println(num[i]+" ");
     }
    }
}

public class Anonymous 
{
    public static void main(String[] as)
    {
        int[] num=new int[] {5,63,4,3,2};
       
            for(int i=0;i<num.length;i++)
            {
                System.out.println("num["+i+"] = "+num[i]);
            }
            display(new String[] {"First","Second","Third"}); 
    }
     static void display(String str[])
        {
            for(int i=0;i<str.length;i++)
            {
                System.out.println(str[i]);
            }
        } 
}

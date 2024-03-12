public class Exceptionhandling {
    public static void main(String[] ar)
    {
        //System.out.println("main");
        int a=10,b=0,c;
        //c=a/b;
        try{
            c=a/b;
            System.out.print(c);
        }
        catch(Exception ca)
        {
            System.out.println(ca);
        }
        //System.out.println("main method ended");
    }
    
}

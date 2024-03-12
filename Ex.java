public class Ex 
{
    int a=10;
    int b=0;
    void div() throws ArithmeticException
    {
        try
        {
            int c;
            c=a/b;
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        catch(ArithmeticException e)
        {
           System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Ex e1=new Ex();
        e1.div();
    }
    
}

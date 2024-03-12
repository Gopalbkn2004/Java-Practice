public class Method_overridding 
{
    public static void main(String[] args) {
        overridding1 o1=new overridding1();
        o1.name();
    }
}
class overridding
{
    void name()
    {
        System.out.println("Gopal");
    }
}
class overridding1 extends overridding
{
    void name()//method overiding
    {
        System.out.println("Gopal kishan");
    }
}

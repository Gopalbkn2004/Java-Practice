public class SingleInheritance
{
    public static void main(String[] args) 
    {
       Two Si=new Two();
       Si.print();
       Si.Print_for();
    }
}
class One
{
    public void print()
    {
      System.out.println("Bjs");
    }
}
class Two extends One
{
    void Print_for()
    {
        System.out.println("For BJS");
    }
}
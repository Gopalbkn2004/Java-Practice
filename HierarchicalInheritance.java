class A
{
    public void printa()
    {
        System.out.println("class A");
    }
}
class B extends A
{
   public void printb()
   {
        System.out.println("class B");
   }
}
class C extends A
{
  public void printc()
  {
        System.out.println("class C");
  }
}
class D extends A
{
  public void printd()
  {
        System.out.println("class D");
  }
}

class HierarchicalInheritance
{
    public static void main(String[] args) 
    {
        B b1=new B();
        b1.printa();
        b1.printb();
        C b11=new C();
        b11.printa();
        b11.printc();
        D b2=new D();
        b2.printa();
        b2.printd();
    }
}
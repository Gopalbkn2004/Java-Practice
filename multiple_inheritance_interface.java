
interface A1
{
  void show1();
} 
interface A2 //extends A1
{
  void show2();
} 
class multiple_inheritance_interface  implements A2,A1
{  
public void show1()
{
 System.out.println("hello A1 Interface");
}
public void show2()
{
 System.out.println("hello A2 Interface");
}
public static void main(String args[])
{
    multiple_inheritance_interface  ob=new multiple_inheritance_interface ();
ob.show1();
ob.show2();
}
}


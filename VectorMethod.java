import java.util.Vector;
public class VectorMethod 
{
  public static void main(String[] args) 
  {
    Vector<String> v=new Vector<String>();
    String [] week={"mon","tues","wed","th","fri","satur"};
    for(String str:week)
    { 
       v.add(str);
    }
    Boolean x=v.add("Monday");      
    System.out.println(x);
    v.remove("mon");
     v.add(0,"Monday");
     String a=v.get(2);
    System.out.println(a);
     System.out.println(v.lastElement()+"\n"+v.firstElement());
      // System.out.println(v.firstElement());
    for(String str:v)
        System.out.print(str+" ");
  }    
}

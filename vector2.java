import java.util.*;

class Vehicle1
 { 
     //defining a method 
     static int aa=10;
     int bb=10;
     void run(){System.out.println("Vehicle is running");} 
 } 



public class vector2 
{
    int a=10;
    final int b=10;
    public static void main(String[] ar)
    {
        Vector<Integer> v1=new Vector<Integer>();
        v1.add(34);
        v1.add(42);
        v1.add(34);
        v1.add(34);
        v1.add(42);
        v1.add(34);v1.add(34);
        v1.add(42);
        v1.add(34);
        Vector<Integer> v2=new Vector<Integer>(10,2);
        v2.add(34);
        v2.add(42);
        v2.add(34);
       
        
        // vector2 v2=new vector2();
        // System.out.println(v2.a);
        
        Vehicle1 o1=new Vehicle1();
        //System.out.println(Vehicle1.bb);//ya instance variable hai class ka name sa call nahi ho raha hai ya object ka throw hi
        //System.out.println(o1.aa);// call hoga
        //System.out.println(Vehicle1.aa);//ya static variable hai
        System.out.println(v1.size());
        System.out.println(v1.addAll(v2));
        //v1.insertElementAt(455, 0);
        System.out.println(v1);
    }
    
}



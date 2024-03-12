import java.util.Vector;
public class VectorClass 
{
    public static void main(String[] as)
    {
     Vector<String> v = new Vector<String>();
     //Vector v1 = new Vector(1,2,3,4,5,6);

     String[] day={"Monday","tuesday","thesday","friday","Saturday"};
     for(String str:day)
      v.add(str);
      
        System.out.println("number of element in vector are"+v.size());
        v.add("sunday");
        v.add(2,"wednesday");
        System.out.println("number of element in vector are "+v.size());
        System.out.println("First element in vector in "+v.firstElement());
        System.out.println("Last element in vector in "+v.lastElement());
        System.out.println("Element at index 3 is "+v.get(3));
        v.remove("sunday");
        v.remove(3);
        System.out.println("element in vector after remove are");
        for(String str:v)
        System.out.println(str);     
    }    
}

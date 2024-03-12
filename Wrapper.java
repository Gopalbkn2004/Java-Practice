public class Wrapper 
{
    public static void main(String[] args) {
    int a=10;
    // Create a new Integer object from an int value
    Integer i1=Integer.valueOf(a);
    System.out.println(i1);

    // Convert the Integer object to an int value.
    int b=i1.intValue();
    System.out.println(b);
    }
}

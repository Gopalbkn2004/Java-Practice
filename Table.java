import java.util.Scanner;

public class Table 
{
  public static void main(String[] as)  
  {
    Scanner s1=new Scanner(System.in);
    System.out.print("Enter the Temprature :");
    String str= s1.nextLine();
    System.out.print("Enter the Humidity :");
    String str1= s1.nextLine();
    String t1="warm";
    String t2="cold";
    String h1="dry";
    String h2="hummid";
    // System.out.print(str);
    // System.out.print(str1);
    System.out.println(" _________________________________________________________________");
    System.out.println("| If Temprature is   | if Humidity is     | Print this Activity  |");
    System.out.println("|--------------------|--------------------|----------------------|");
    
     if(str.equals(t1) && str1.equals(h1))
    {
    System.out.println("| Warm               | Dry                | Play Basketball      |");
    System.out.println("|--------------------|--------------------|----------------------|");}
     else if(str.equals(t1) && str1.equals(h2))
    {
    System.out.println("| Warm               | Hummid             | Play Tennis          |");
    System.out.println("|--------------------|--------------------|----------------------|");}
     else if(str.equals(t2) && str1.equals(h1))
    {
    System.out.println("| Cold               | Dry                | Play Circket         |");
    System.out.println("|--------------------|--------------------|----------------------|");}
     else if(str.equals(t2) && str1.equals(h2))
    {
    System.out.println("| Cold               | Hummid             | Swim                 |");
    System.out.println("|--------------------|--------------------|----------------------|");}
      else
      {System.out.println("Condition not match");}     
      s1.close();
  }
}

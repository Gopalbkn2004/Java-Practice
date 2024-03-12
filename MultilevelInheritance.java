import java.util.Scanner;

public class MultilevelInheritance 
{
   public static void main(String[] args) 
   {
      ThirdYear Ty=new ThirdYear();
      Ty.Student();
      Ty.Detail();
      Ty.Persentage(); 
      Ty.display();   
   } 
}

class FirstYear
{
    Scanner r1=new Scanner(System.in);
    String n;
    int roll;
    void Student()
    {
     System.out.println("Enter the Roll No:");
     roll=r1.nextInt();
     System.out.println("Enter the Name :");
     n=r1.next();
    }
}
class SecondYear extends FirstYear
{
    long phone;
    double per;
    void Detail()
    {
     System.out.println("Enter the 1st year Persentage:");     
     per=r1.nextDouble();
     System.out.println("Enter the Phone No:");
     phone=r1.nextLong();
    }
}
class ThirdYear extends SecondYear
{
    double per1;
    void Persentage()
    {
      System.out.println("Enter the 2st year Persentage:");     
       per1=r1.nextDouble();
    }
    void display()
    {
        System.out.println("Name of Student:"+n);
        System.out.println("roll no of Student:"+roll);
        System.out.println("Percentage of Student 1 year:"+per);
        System.out.println("phone of Student:"+phone);
        System.out.println("Percentage of Student 2 year:"+per1);
    }
}
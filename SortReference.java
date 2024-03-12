public class SortReference 
{
 public static void main(String[] as)
 {
    Student s1=new Student();
    Student s2=new Student();
    Student s3;
    System.out.println("Rollno.  Name  percentage");
    s1.setdata(101," Gopal", 80);
    s2.setdata(102," Kanishka", 90);
    s3=s1.comparedata(s2);
    s3.Displaydata();
 }   
}
class Student
{
    private int rno;
    private String name;
    private Double percent;
     void setdata( int roll, String name1,double p)
     {
        rno=roll;
        name=name1;
        percent=p;
     }
     void Displaydata()
     {
        System.out.print(rno+"    ");
        System.out.print(name+"   ");
        System.out.println(" "+percent);
     }
     Student comparedata(Student s)
     {
          if(percent>=s.percent)
          {
            return this;
          }
          else
          {
            return s;
          }
     }
}

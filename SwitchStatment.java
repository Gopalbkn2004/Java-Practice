import java.util.Scanner;
class SwitchStatment
{
    public static void main(String[] ar)
    {
         char[] str={'g','o','p','a','l'};

         String st1=new String(" gopal kishan khatri   ");
         System.out.println(st1);
         System.out.println(st1.trim());



    int a;
    Scanner rv1=new Scanner(System.in);
    System.out.println("Enter the value:");
    a=rv1.nextInt();
    int[] a1={1,2,3,4,5,6,7,8};
    int[] b1={3,4,5,6,4,3,4,5};
    System.out.println();
    switch (a) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
           System.out.println("Monday");
           break;
        case 3:
           System.out.println("Tuesday");
           break;
        case 4:
           System.out.println("Wednesday");
           break;
        case 5:
           System.out.println("Thersday");
           break;
        case 6:
           System.out.println("Friday");
           break;
        case 7:
           System.out.println("Saturday");
           break;
        default:
         System.out.println("THis not a day");
            break;
       }
      rv1.close();   }

}
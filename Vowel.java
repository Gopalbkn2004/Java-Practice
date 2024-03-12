import java.util.Scanner;
class Vowel
{
    public static void main(String[] ar)
    {
    char a;
    Scanner rv1=new Scanner(System.in);
    System.out.println("enter the character:");
    a = (rv1.nextLine()).charAt(0);
    switch(a)
    {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        System.out.println("It is vowel");
        break;
        default:
        System.out.println(" Its not a vowel");
        break;

     }    
    rv1.close();
    }
}
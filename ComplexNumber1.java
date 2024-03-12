public class ComplexNumber1
{
    int image,real;
    ComplexNumber1(int i,int r)
    {
        this.image=i;
        this.real=r;
    }
    void show()
    {
        System.out.println(this.image+" +i"+this.real);
    }
    public static ComplexNumber1 add(ComplexNumber1 n1,ComplexNumber1 n2)
    {
        ComplexNumber1 res=new ComplexNumber1(0,0);
        res.image=n1.image+n2.image;
        res.real=n1.real+n2.real;
        return res;
    }
    public static void main(String[] ar)
    {
        ComplexNumber1 c1=new ComplexNumber1(4,5);
        ComplexNumber1 c2=new ComplexNumber1(4,5);
        c1.show();
        c2.show();
        ComplexNumber1 res= add(c1 , c2);
        res.show();

    }

}
// public class ComplexNumber1 {
 
//     // variables to hold real and imaginary part of complex
//     // number
//     int real, image;
 
//    // Constructor which will be used while creating complex
//     // number
//     public ComplexNumber1(int r, int i)
//     {
//         this.real = r;
//         this.image = i;
//     }
 
//     // function to print real number
//     public void showC()
//     {
//         System.out.print(this.real + " +i" + this.image);
//     }
 
//     // function for addition
//     public static ComplexNumber1 add(ComplexNumber1 n1,ComplexNumber1 n2)
//     {
 
//         // creating blank complex number
//         // to store result
//         ComplexNumber1 res = new ComplexNumber1(0, 0);
 
//         // adding real parts of both complex numbers
//         res.real = n1.real + n2.real;
 
//         // adding imaginary parts
//         res.image = n1.image + n2.image;
 
//         // returning result
//         return res;
//     }
 
//     public static void main(String arg[])
//     {
 
//         // creating two complex numbers
//         ComplexNumber1 c1 = new ComplexNumber1(4, 5);
//         ComplexNumber1 c2 = new ComplexNumber1(10, 5);
 
//         // printing complex numbers
//           System.out.print("first Complex number: ");
//         c1.showC();
         
//         System.out.print("\nSecond Complex number: ");
//         c2.showC();
 
//         // calling add() to perform addition
//         ComplexNumber1 res = add(c1, c2);
 
//         // displaying addition
//         System.out.println("\nAddition is :");
//         res.showC();
//     }
// }
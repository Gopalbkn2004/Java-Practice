class Throw
{
void age(int age) throws ArithmeticException
{
if(age<18) 
{ throw new ArithmeticException("enter the correct age");}
else
{System.out.print("valid age");}
}
public static void main(String[] ar)
{
 Throw t1=new Throw();
 t1.age(19);
}





}
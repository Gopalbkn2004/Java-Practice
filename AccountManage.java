import java.util.Scanner;
class AccountManage 
{
   public static void main (String[] as)
   {
    User o1=new User(101,5000);
    o1.show();
     User o2=new User(102,2000);
    o2.show();
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter Amount to be transfer");
    double ant=kb.nextDouble();
    o1.transfer(o2,ant);
    System.out.println("Information After Money is transfer");
    o1.show();
    o2.show();
    kb.close();
   }
}
class User
{
  private int accno;
  private double balance;
  User(int acc,double bal)
  {
    accno=acc;
    balance=bal;
  }
  void transfer(User obj, double ant)
  {
    balance=balance-ant;
    obj.balance=obj.balance+ant;
  }
  void show()
  {
    System.out.println("Account No. is :"+accno);
    System.out.println("Balance :"+balance);
  }
}

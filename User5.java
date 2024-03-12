class Account
{
    int c=0;
    int accountno;
    double balance;
    final static double rate=0.25;
    void setdata(int n, int bal)
    {   
        c=c+1;
        accountno=n;
        balance=bal;
    }
    void Quat()
    { double intrest=balance*rate*0.25;
     balance=balance+intrest;
    }
    void show()
    {
        System.out.println("Account no of the user "+accountno);
        System.out.println("balance of the User"+balance);
        System.out.println("rate "+rate);
    }

}

class User5
{
    public static void main(String[] ar)
    {
     Account rv1=new Account();
     rv1.setdata(1,200);
     rv1.Quat();
     rv1.show();
     Account rv2=new Account();
     rv2.setdata(2,300);
     rv2.Quat();
     rv2.show();
    }
}
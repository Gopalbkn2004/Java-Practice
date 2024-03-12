class First{
    void sum(int x,int y)
    {System.out.println(x+y);}
    void sum(int x,double y)
    {System.out.println(x+y);}
    void sum(char x,char y)
    {System.out.println(x+y);}
}

class User2{  
 public static void main(String ar[])
   {
    First rv1=new First();
    rv1.sum(10,20);
    rv1.sum(10,20.30);
    rv1.sum('A','b');
   }

}
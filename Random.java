class First{
    static int num[]=new int[5];{
    System.out.println("Initialization block of Executed");
    for(int i=0;i<num.length;i++)
    {
        num[i]=(int)(15*Math.random());
    }}
    void display()
    {
        for(int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
    }   
}
class Random{
    public static void main(String[] as)
    {
        First r1=new First();
        r1.display(); 
        First r2=new First();
        r2.display();
    }
}

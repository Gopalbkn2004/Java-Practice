class Rectangle
{
    int length,breadth;
    static int rcount=0;
    void setdata(int l,int b)
    {
        length=l;breadth=b;
        rcount=rcount+1;
    }
    void area()
    {
        int rectarea;
        rectarea=length*breadth;
        System.out.println(rectarea);
    }
}

class User4
{
    public static void main(String ar[])
    {
        Rectangle rv1=new Rectangle();
        rv1.setdata(2,2);
        //rv1.area();
        Rectangle rv2=new Rectangle();
        rv2.setdata(20,30);
        Rectangle rv3=new Rectangle();
        rv3.setdata(20,10);
        System.out.println(Rectangle.rcount);
    }
}
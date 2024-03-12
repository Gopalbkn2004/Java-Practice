class Circle1 {
    int x,y,radius;
    Circle1()
    {
        radius=1;
    }
    Circle1(int x1,int y1)
    {
        this();
        x=x1;
        y=y1;
    }
    Circle1(int x1, int y1,int r)
    {
        this(x1,y1);
        radius=r;
    }
    void area()
    {
        System.out.println(Math.PI*(radius*radius) );
    }
}
class Circle{
    public static void main(String[] as)
    {
        Circle1 rv1=new Circle1();
        Circle1 rv2=new Circle1(5,6);
        Circle1 rv3=new Circle1(4,6,8);
        rv1.area();
        rv2.area();
        rv3.area();

    }

}

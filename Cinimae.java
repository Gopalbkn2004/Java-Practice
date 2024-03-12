class Cinimae1 
{
    private String moviename;
    private String timing;
    Cinimae1(String s,String t)
    {
        moviename=s;
        timing=t;
    }
    Cinimae1(Cinimae1 c)
    {
        moviename=c.moviename;
        timing=c.timing;
    }
    void show()
    {
        System.out.print( moviename+" ");
        System.out.println(timing);
    }
}
public class Cinimae
{
    public static void main(String[] as)
    {
        int a=10;
        switch (a) {
            case 1:
                System.out.println("Gopal");
                
            case 1:
                System.out.println("Gopal2");
                break;
        
            default:
                break;
        }
         System.out.println("MOvie shedule");
        System.out.println(" Name "+"  Timing");
       Cinimae1 rv1=new Cinimae1("Gader2"," 8:00 AM");
       Cinimae1 rv2=new Cinimae1("Gader2"," 2:00 PM");
       Cinimae1 rv3=new Cinimae1("Gader2"," 6:00 PM");
        Cinimae1 rv4=new Cinimae1(rv1);
        Cinimae1 rv5=new Cinimae1(rv2);
        Cinimae1 rv6=new Cinimae1(rv3);
       rv4.show();
       rv5.show();
       rv6.show();

    }
}

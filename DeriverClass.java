public class DeriverClass 
{
    public static void main(String[] args) 
    {
        MountainBike mv=new MountainBike(3,10,30);
        System.out.println(mv.toString());
    }
}
class BiCycle
{
  public int gear,speed;
  //public int speed;
  BiCycle(int gear,int speed)
  {
    this.gear=gear;
    this.speed=speed;
  }
  void appiledBreak(int decr)
  {
    speed=speed-decr;
  }
  void SpeedUp(int insc)
  {
    speed=speed+insc;
  }
  public String toString()
  {
     return("num of grear are "+gear+"\nSpeed of bike is "+speed);
  }
}
class MountainBike extends BiCycle
{
    public int setheight;
    public MountainBike(int gear, int speed, int startheight)
    {
        super(gear,speed);
        setheight=startheight;
    }
    public void setheight(int newvalue)
    {
        setheight=newvalue;
    }
    public String toString()
    {
        return(super.toString()+"\nset height is "+setheight);
    }
}
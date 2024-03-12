public class My_Thread
{
	public static void main(String arg[])
	{
		My t1=new My();
		t1.start();
	}
}

class My extends Thread
{
	public void run()
	{
	System.out.print("HI , HOW ARE YOU ");
	}
}

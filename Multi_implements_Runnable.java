class Multi implements Runnable
{
	public void run()
	{
		System.out.print("hi");
	}
	public static void main(String[] ar)
	{
	  Multi m1=new Multi();
	  Thread t1=new Thread(m1);
	 t1.start();
	}
}
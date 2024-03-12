public class Thread_Priority implements Runnable
{
public void run()
{
//System.out.print(10+20+30);
}
public static void main(String[] arg)
{
Thread_Priority th=new Thread_Priority();
Thread t1=new Thread(th);
System.out.print(t1.getPriority());
System.out.print(t1.getName());
t1.start();
}
}
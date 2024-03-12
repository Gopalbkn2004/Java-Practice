public class Main
{
    public static void main(String[] args) {
        Table t=new Table();
        Thread1 t1=new Thread1(t);
        Thread2 t2=new Thread2(t);
        t1.start();
        t2.start();
    }
}


class Table{
   synchronized void print(int val){   // method is not synchronized
        
  // In this for loop , table of 4 and 6 is print.

      for(int i=1;i<=10;i++)
     {
       System.out.println(val*i);
       try{
       Thread.sleep(1000);
       }
       catch(Exception e)
       {
          System.out.println(e);
       }
     }
   }
}
//Thread 1 access print() method

class Thread1 extends Thread{
   Table t;
   Thread1(Table t){
       this.t=t;
   }
   
   public void run(){

// access print() method of Table class and pass 4 as argument

       t.print(4);
   }
}

//Thread2 access print() method

class Thread2 extends Thread{
   Table t;
   Thread2(Table t){
       this.t=t;
   }
   
   public void run(){

  // access print() method of Table class and pass 6 as argument
   
       t.print(6);
   }
}


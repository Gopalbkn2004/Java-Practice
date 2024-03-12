class loop2
{
public static void main(String[] as)
{
    loopMethod rv1=new loopMethod();
    //rv1.printno();
    //rv1.pattern1();
    rv1.patternTriangle();
}
}

class loopMethod
{
    void printno()
    {
        for(int i=0; i<=5; i++)
        {
            System.out.println(i);
        } 
    }
    void pattern()
    {
        for(int i=1; i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print('*');
            }
            System.out.println("");
        }
    }

    void pattern1()
    {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
              System.out.print('*');
            }
            System.out.println(" ");
        }
    }
    void patternTriangle()
    { /*int a=5;
        for(int i=1;i<=a;i++)
        {
            for(int j=a-1;j>=1;j--)
            {
                System.out.print(" ");
                for(int y=1;y<=i;y++)
                {
                    System.out.print("* ");
                }
              
            }
            System.out.println();
        }*/
          int i, j, row = 6;       
               //Outer loop work for rows  
               for (i=0; i<row; i++)   
{  
                //inner loop work for space      
                for (j=row-i; j>1; j--)   
                {  
                    //prints space between two stars  
                   System.out.print(" ");   
                }   
                  //inner loop for columns  
                for (j=0; j<=i; j++ )   
                {   
                 //prints star      
                System.out.print("* ");   
                 }   
                 //throws the cursor in a new line after printing each line  
               System.out.println();   
        }   
}   
}  
    


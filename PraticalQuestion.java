import java.util.Scanner;
class PraticalQuestion 
{
    public static void main(String[] args) 
    {
        Pratical o1=new Pratical();
        //PraticalQuestion po1=new PraticalQuestion();
        o1.check_No_Prime_or_Not();
       
        

// int[] a=new int[100];
// int i=0,b1=0;
// long decimalValue;
// Scanner s1=new Scanner(System.in);
// decimalValue=s1.nextLong();
// while(decimalValue>0)
// {
//     a[i++]=(int)decimalValue%2;
//     decimalValue=decimalValue/2;
//     b1++;
// }
// for(int b=b1-1;b>=0;b--)
// {
//     System.out.print(a[b]);
// }


       greater();
    } 
      static void greater()
       {
        int a=40, b=78, c=19;  
        //comparing numbers, a with b and a with c   
        //if both conditions are true, prints a  
        if(a>=b && a>=c)  
        System.out.println(a+" is the largest Number");  
        //comparing b with a and b with c  
        //if both conditions are true, prints b  
        else if (b>=a && b>=c)  
        System.out.println(b+" is the largest Number");  
        else  
        //prints c if the above conditions are false  
        System.out.println(c+" is the largest number"); 
       }
    
}


class Pratical
{
//     void fabonic1()
//     {
//         int a=0,c;
//         int b=1;
//         Scanner kb=new Scanner(System.in);
//         System.out.println("Enter end value:");
//         int x1=kb.nextInt();
//         while(a<x1)
//         {
//             System.out.println(a);
//             c=a+b;
//             a=b;
//             b=c;
//         }kb.close();
//     }
    void factorial()
    {
        int mul=1;
        for(int i=5;i>0;i--)
        {
            mul*=i;
        }
        System.out.println(mul);
    }
    void fabonic2()
    {
        int a=0,c;
        int b=1;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter end value:");
        int x1=kb.nextInt();
        for(int i=0;i<x1;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
        kb.close();
    }
    void nested_While_Loop_Table()
    {
        int n=1;
        while (n<=10) 
        {
            System.out.println("\n"+"Table of "+n);
            int i=1;
            while (i<=10) 
            {
                System.out.println(n+" X "+i+" = "+n*i);
                i++;                
            }
           n++;
        } 
    }
    void check_No_Prime_or_Not()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the value:");
        int x1=s1.nextInt();
        if(x1==1 || x1==0)
        {
            System.out.println("Its NUmber is not a prime number");
        }
        else{
        int a=0;
        s1.close();
        for(int i=2;i<x1;i++)
        {
            if(x1%i==0)
            {
                a=1;
                break;
            }
        }
        if(a==1)
        {
            System.out.print("It is not prime number");
        }
        else
        {
            System.out.print("It is  prime number");
        }    
    }    
    }
    void series_12_32_52_72()
    {
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=s2.nextInt();
        int s=0;
        int i1=0;
        s2.close();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                s=j*20+12;
                System.out.println(s);
                i1=s+i1;
            }System.out.println("\n");
        }System.out.println("sum of series:"+i1);
    }
    void check_Grade()
    {
        Scanner s3=new Scanner(System.in);
        System.out.println("enter the marks :");
        int marks=s3.nextInt();
        
        if(marks>=91 & marks<=100)
        {
            System.out.print("A1");
            System.out.print("\n10.0");
        }
        else if(marks>=81 & marks<=90)
        {
            System.out.print("A2");
            System.out.print("\n9.0");
        }
        else if(marks>=71 & marks<=80)
        {
            System.out.print("B1");
            System.out.print("\n8.0");
        }

        else if(marks>=61 & marks<=70)
        {
            System.out.print("B2");
            System.out.print("\\n7.0");
        }else if(marks>=51 & marks<=60)
        {
            System.out.print("C1");
            System.out.print("\n6.0");
        }else if(marks>=41 & marks<=50)
        {
            System.out.print("c2");
            System.out.print("\n5.0");
        }else if(marks>=33 & marks<=40)
        {
            System.out.print("D");
            System.out.print("\n4.0");
        }
        else if(marks>=21 & marks<=32)
        {
            System.out.print("E1");
            System.out.print("\n3.0");
        }
        else if(marks>=0 & marks<=21)
        {
            System.out.print("E2");
            System.out.print("\n0.0");
        }
        else
        {
            System.out.print("Invalid number");
        }
        s3.close();
    }
    void series()//1+x+(x*x)+(x*x*x)
    {
        Scanner s3=new Scanner(System.in);
        System.out.println("enter the value :");
        int x=s3.nextInt();
        System.out.println("enter the N value :");
        int n=s3.nextInt();
        int s=0;
        int y=0;
        for(int j=0;j<n;j++)
        {
            y=(int)Math.pow(x,j);
            s=s+y;
            System.out.println(y);
        }
        System.out.println("Sum of the series:"+s);
        s3.close();
    }
    void reverse()
    {
        Scanner s3=new Scanner(System.in);
        System.out.println("enter the value :");
        int n=s3.nextInt();
        //int copy=n;
        int reve=0;
        int remai=0;
        while(n>0)
        {
            remai=n%10;
            reve=(reve*10)+remai;
            n/=10;
        }
        System.out.println(reve);
        s3.close();
    }
    void salary_calculate()
    {
        int da=0,hra=0;
        Scanner s3=new Scanner(System.in);
        System.out.print("enter the employe No :");
        int No=s3.nextInt();
        Scanner s4=new Scanner(System.in);
        System.out.print("enter employe name :");
        String name=s4.nextLine();
        System.out.print("enter the employe Salary :");
        int sal=s3.nextInt();
        if(sal<=10000)
        {
            da=(sal*30)/100;
            hra=(sal*10)/100;
        }
        else if(sal>10000 & sal<=20000)
        {
            da=(sal*40)/100;
            hra=(sal*15)/100;
        }
        else if(sal>20000 & sal<=30000)
        {
            da=(sal*50)/100;
            hra=(sal*20)/100;
        }
        else if(sal>30000)
        {
            da=(sal*60)/100;
            hra=(sal*25)/100;
        }
        System.out.println("Employe Id:"+No);
        System.out.println("Employe Name:"+name);
        System.out.println("Employe DA amount :"+da);
        System.out.println("Employe HRA amount :"+hra);
        int gross=sal+da+hra;
        System.out.println("Gross salary of Employe:"+gross);
        s3.close();
        s4.close();
    }
    void area_shape()
    {
        while (true) 
        {
            double area=0;
            System.out.println("\nMAIN MENU");
            System.out.println("----------------");
            System.out.println("1.Area of circle");
            System.out.println("2.Area of Rectangle");
            System.out.println("3.Area of Square");
            System.out.println("4.Quit");
            System.out.println("----------------");
            Scanner s3=new Scanner(System.in);
            System.out.println("Select Any 1 option:");
            int opt=s3.nextInt();
            if(opt==1)
            {
                System.out.println("Enter the radius of circle :");
                int r=s3.nextInt();
                area=(double)Math.PI*(double)Math.pow(r,2);
                System.out.print(area);
            }
            else if(opt==2)
            {
                System.out.println("Enter the length of ractangle :");
                int l=s3.nextInt();
                System.out.println("Enter the width of ractangle :");
                int w=s3.nextInt();
                System.out.println("area of rectangle:"+l*w);
            }
            else if(opt==3)
            {
                System.out.println("Enter the area of square:");
                int a=s3.nextInt();
                area=Math.pow(a,2);
                System.out.println(area);
            }
            else if(opt==4)
            {
                break;
            }
            else
            {
                System.out.println("invalid entry");
            }
            s3.close();
        }
    }
    void power_factorial_equaction()
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("enter the value of X:");
        int x=s1.nextInt();
        System.out.print("enter N number of value:");
        int n=s1.nextInt();
        double sum1=0;
        double a=0;
        for(int i=0;i<=n;i++)
        {
            a=Math.pow(x,i);
            int fact=1;
            for(int j=1;j<=i;j++)
            {
                fact=j*fact;
                //System.out.println(fact);
            }
            sum1=(a/fact)+sum1;
        }
        System.out.println(sum1);
        s1.close();
    }
    void series_Add()
    {
        Scanner s1=new Scanner(System.in);
        System.out.print("enter the value of X:");
        int n=s1.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                sum+=j;
            }
        }
        System.out.println(sum);
        s1.close();
    }
    void saleMarket()
    {
        int discount=0,additionaldiscount=0,add=0;
        Scanner s1=new Scanner(System.in);
        System.out.print("enter the purchase amount:");
        int pamt=s1.nextInt();
        if(pamt>=2000 & pamt<=5000)
        discount=400;
        else if(pamt>5000 & pamt<=10000)
        discount=800;
        else if(pamt>10000 & pamt<=20000)
        discount=1000;
        else if(pamt>20000)
        {
            discount=2000;
            additionaldiscount=pamt*3/100;
            add=3;
        }
        else
        {
            System.out.println("you can buy more, then discount is given to you");
        }
        int td=discount+additionaldiscount;
        int netamt=pamt-td;
        System.out.println("=====================================");
        System.out.println("purchase amount is:"+pamt);
        System.out.println("discount amount is: "+discount);
        System.out.println(add+"% additional discount is:"+additionaldiscount);
        System.out.println("total discount is: "+td);
        System.out.print("net amount is:"+netamt);
        s1.close();
    }
    void geometrical_shapes()
    { Scanner s2=new Scanner(System.in);
        while(true)
        {
            int area=0,volume=0;
            System.out.println("MAIN MENU");
            System.out.println("-------------------");
            System.out.println("1. Volume of a Cube");
            System.out.println("2. Volume of a Sphere");
            System.out.println("3. Volume of a Pyramid");
            System.out.println("4. Volume of a Cylinder");
            System.out.println("5. Volume of a Cuboid");
            System.out.println("6. Quit");
            System.out.println("--------------");
            System.out.print("Select any one option:");
            int opt=s2.nextInt();
            if(opt==1)
            {
                Scanner s1=new Scanner(System.in);
                System.out.print("enter the side of the cube:");
                int s=s1.nextInt();
                volume=s*s*s;
                System.out.print("volume of cube:"+volume);
            }
            else if(opt==2)
            {
                Scanner s1=new Scanner(System.in);
                System.out.print("enter the radius of the Sphere:");
                int r=s1.nextInt();
                double volume1=4/3*(Math.PI*Math.pow(r,3));
                System.out.print("volume of Sphere:"+volume1);
            }
        else if(opt==3)
            { Scanner s1=new Scanner(System.in);
                System.out.print("enter the Base of the Pyramid:");
                int b=s1.nextInt();
                System.out.print("enter the Height of the Pyramid:");
                int h=s1.nextInt();
                volume=(b*h)/3;
                System.out.print("volume of Pyramid:"+volume);
            }
            else if(opt==4)
            { Scanner s1=new Scanner(System.in);
                System.out.print("enter the radius of the Cylinder:");
                int r=s1.nextInt();
                System.out.print("enter the Height of the Cylinder:");
                int h=s1.nextInt();
                double volume1=(Math.PI*Math.pow(r,3))*h;
                System.out.print("volume of Cylinder:"+volume1);
            }
            else if(opt==5)
            { Scanner s1=new Scanner(System.in);
                System.out.print("enter the Length of the Cuboid:");
                int l=s1.nextInt();
                System.out.print("enter the Height of the Cuboid:");
                int h=s1.nextInt();
                System.out.print("enter the Breath of the Cuboid:");
                int b=s1.nextInt();
                volume=l*b*h;
                System.out.print("volume of Pyramid:"+volume);
            }
            else if(opt==6)
            break;
            else
            System.out.print("PLEASE ENTER CORRECT VALUE");

            s2.close();
        }   
        }
}


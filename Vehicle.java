//Java Program to illustrate the use of Java Method Overriding 
 //CreaƟng a parent class. 
 class Vehicle1
 { 
     //defining a method 
     void run(){System.out.println("Vehicle is running");} 
 } 
 //Creating a child class 
 class Bike2 extends Vehicle1
 {
    //defining the same method as in the parent class 
    void run(){System.out.println("Bike is running safely");} 
 }
 
class Vehicle extends Bike2{
 public static void main(String args[]){ 
 Vehicle1 obj = new Vehicle1();//creating object 
 obj.run();//calling method 
 char[] a1={'a','b','c','d'};
 String str=new String(a1);
 System.out.println(str.charAt());
 } 
 } 
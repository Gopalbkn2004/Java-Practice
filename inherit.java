class Animal{ 
 void eat1(){System.out.println("eaƟng...");} 
 } 
class Dog extends Animal{ 
 void eat(){System.out.println("eating bread...");} 
 void bark(){System.out.println("barking...");} 
void work(){ 
super.eat1(); 
 bark(); 
 } 
} 
class TestSuper2{ 
 public static void main(String args[]){ 
Dog d=new Dog(); 
 d.work(); 
}}
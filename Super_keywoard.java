public class Super_keywoard 
{
    public static void main(String[] str)
    {
        super1 s1=new super1();
        s1.sername();
    } 
}

class Super2
{  
    Super2()
    {
        int a=10;
    }
    String str="GOPAL";  

}
class super1 extends Super2
{
    void sername()
    {
        
        //System.out.println(str);
        String str1="KISHAN";
        String str2=super.str;
        System.out.print(str2.concat(" "+str1));

    }
    
}
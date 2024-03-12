import java.util.Scanner;

public class Excelsheet
{
    public static void main(String[] as)
    {
            int count=0;
            Scanner str1=new Scanner(System.in);
            System.out.print("Enter the place of ExcelSheet:");
            String str= str1.nextLine();
            String str2=str.toUpperCase();
            int aa=str2.length();
            char[] ex =str2.toCharArray();
            if(aa==1)
            {
              for(char b='A';b<='Z';b++)
              {
                  count++;           
                  if(ex[0]==b )
                  {
                     System.out.print(count);
                  }
               }
            }
//////////////////////////////////////////////////////
            if(aa==2)
            {
               for(char a='A';a<='Z';a++)
               for(char b='A';b<='Z';b++)
               {
                  count++;           
                   if(ex[1]==b && ex[0]==a)
                   {
                     System.out.print(count+26);
                   }
                }
            }
//////////////////////////
            if(aa==3)
            {
               for(char a='A';a<='Z';a++)
               for(char b='A';b<='Z';b++)
               for(char c='A';c<='Z';c++)
               {
                  count++;           
                  if(ex[0]==a && ex[1]==b && ex[2]==c)
                  {
                     if(a<='X' && b<='F' && c<='D')
                     {
                       System.out.println(count+(26*26+26)); 
                       break; 
                     }
                     else
                       System.out.print("END of excel sheet XFD \nplease enter the correct place");
                  }
               } 
            }
           if(aa==4)
            System.out.print("invalid place");
     }
}

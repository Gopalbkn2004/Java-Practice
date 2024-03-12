import  java.util.Scanner;
public class Transpose 
{
    public static void main(String[] args) {
        int [][]a =new int[3][3];
        int [][]b =new int[3][3];

        Scanner s = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        //System.out.print(transpose(a[2][3]));
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=a[j][i];
            }
    
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
    
}

import java.text.SimpleDateFormat;
import java.util.*;

public class Clock 
{
    public static void main(String[] args) {
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/YY HH:mm:ss");
        Date date=new Date();
        System.out.println(formatter.format(date));
    }
    
}

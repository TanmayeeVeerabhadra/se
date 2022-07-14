import java.lang.*;
import java.util.*;
import java.io.*;
public class Username{
    public static String us;
    public static String user(){
        System.out.println("Enter the Username:");
        Scanner sc=new Scanner(System.in);
        String us=sc.next();
        getuser(us);
        return us;
    }
    public static String getuser(String us){
        String user;
        user=us;
        //System.out.println(user);
        return user;
    }
    public static void main(String[] args){
        user();
    }
}
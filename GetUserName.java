import java.io.*;
import java.util.*;
import java.lang.*;

public interface GetUserName{
    static Scanner sc=new Scanner(System.in);
    public static String username(String file) {// method for converting the data of the file into array and storing
        System.out.println("You are here to LOGIN");
        System.out.println(("--------------------------------------------"));
        System.out.println("\nEnter the Username:");
        String uname = sc.next();// here on using the scanner object sc we take the input from user
        return uname;
    }
    public static void main(String[] args){
        String data=username("username.txt");
    }
}

import java.io.*;
import java.util.*;

import javax.print.DocFlavor.STRING;

import java.lang.*;

public class LMS2 {
    public  void lms2() throws IOException{
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\nEnter 0 to VIEW BOOKS \nEnter 1 to SEARCH BOOK and its Availability \nEnter 2 to RESERVE BOOK \nEnter 3 for FEEDBACK \nEnter 4 TO LOGIN AS ADMIN\nEnter 5 to EXIT as USER");
        Scanner sca=new Scanner(System.in);
        String choice1=sca.next();
        switch(choice1){
            case "0":
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println("\n\nThe books available in the library are");
            System.out.println("------------------------------------------------------------------------");
            ViewBooks obj29=new ViewBooks();
            obj29.reader("bookname.txt");
            System.out.println("------------------------------------------------------------------------");
            break;
            case "1":
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println("\nYou are here to SEARCH the books");  
            System.out.println("----------------------------------------------------");
            //System.out.println("\nYou are here to SEARCH the books\n");
            Search obj =new Search();//an object obj created for the class Search 
            String [] data22=obj.search("bookname.txt");
            break;
            case "2":
            System.out.println("\033[H\033[2J");
		    System.out.flush();
            Reserve obj2=new Reserve();//an object obj created for the class Reserve
            String [] data1=obj2.reserve("bookname.txt");
            break;
            case "3":
            System.out.println("\033[H\033[2J");
		    System.out.flush();
            Feedback obj3=new Feedback();
            String data3=obj3.feedback("feedback.txt");
            break;
            case "4":
            System.out.println("\033[H\033[2J");
		    System.out.flush();
            AdminLogin obj4=new AdminLogin();//an object obj created for the class AdminLogin
            String[] data5=obj4.adminname("names.txt");
            LMS3 obj10=new LMS3();
            obj10.lms3();    
            break;
            case "5":
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.err.println("Logging OUT of the Account");
            LMS1 obj21=new LMS1();
            obj21.lms1(); 
            default:
            System.out.println("\033[H\033[2J");
		    System.out.flush();
            System.out.println("Please CHOOSE from Above");
            break;
        }
        LMS2 obj12=new LMS2();
        obj12.lms2();
    }
}

import java.io.*;
import java.util.*;
import java.lang.*;
import java.time.LocalDate;

public class MaintainInventory {
    public static String account(){
        Scanner s1=new Scanner(System.in);
        System.out.println("You are here for MAINTAIN INVENTORY");
        System.out.println("---------------------------------------------------");
        System.out.println("Enter 1 to Search with ROLL NUMBER\nEnter 2 to search with User Name\nEnter 3 to search with Admin Name ");
        System.out.println("enter the choice");
        String choice=s1.next();   
        switch(choice){
            case "1":
            System.out.println("Enter the Roll-No:");
            String rollno=s1.next();
            if(rollno.length()==10){
                String word =rollno; // the word you want to find
                    String line;        
                    try (BufferedReader br = new BufferedReader(new FileReader("reservereport.txt"))) { // open file foobar.txt
                    while ((line = br.readLine()) != null) { //read file line by line in a loop
                        if(line.contains(word)) { // check if line contain that word then prints the line
                            System.out.println(line);
                        }
                    }
                    try (BufferedReader br1 = new BufferedReader(new FileReader("issuereport.txt"))) { // open file foobar.txt
                        String line1;
                        while ((line1 = br1.readLine()) != null) { //read file line by line in a loop
                            if(line1.contains(word)) { // check if line contain that word then prints the line
                                System.out.println(line1);
                            }
                        }
                        try (BufferedReader br2 = new BufferedReader(new FileReader("returnreport.txt"))) { // open file foobar.txt
                            String line2;
                            while ((line2 = br2.readLine()) != null) { //read file line by line in a loop
                                if(line2.contains(word)) { // check if line contain that word then prints the line
                                    System.out.println(line2);
                                }
                            }
                        }
                        catch(Exception ee){
                            System.out.println(ee);
                        }
                    }
                    catch(Exception e1){
                        System.out.println(e1);
                    }
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
            else{
                System.out.println("--------------------------------------------------");
                System.out.println("\n Enter the complete ROLL NUMBER");
            }
            break;
            case "2":
            System.out.println("Enter the Username");
            String uname=s1.next();
            String word =uname; // the word you want to find
            String line;        
            try (BufferedReader br = new BufferedReader(new FileReader("reservereport.txt"))) { // open file foobar.txt
                while ((line = br.readLine()) != null) { //read file line by line in a loop
                    if(line.contains(word)) { // check if line contain that word then prints the line
                        System.out.println(line);
                    }
                }
            }
            catch(Exception ee){
                System.out.println(ee);
            }
            break;
            case"3":
            System.out.println("Enter the AdminName");
            String lname=s1.next();
            String word1 =lname; // the word you want to find   
            try (BufferedReader br1 = new BufferedReader(new FileReader("issuereport.txt"))) { // open file foobar.txt
                String line1;
                while ((line1 = br1.readLine()) != null) { //read file line by line in a loop
                    if(line1.contains(word1)) { // check if line contain that word then prints the line
                        System.out.println(line1);
                    }
                }
                try (BufferedReader br2 = new BufferedReader(new FileReader("returnreport.txt"))) { // open file foobar.txt
                    String line2;
                    while ((line2 = br2.readLine()) != null) { //read file line by line in a loop
                        if(line2.contains(word1)) { // check if line contain that word then prints the line
                            System.out.println(line2);
                        }
                    }
                }
                catch(Exception ee){
                    System.out.println(ee);
                }
            }
            catch(Exception e1){
                System.out.println(e1);
            }
            break;
            default:
            System.out.println("Please Choose From Above");
            System.out.println("------------------------------------------------------");
            break;

        }
    return " ";
    }
    public static void main(String[] args) {
        String data111 = account();
    }
}

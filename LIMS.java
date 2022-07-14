import java.io.*;
import java.util.*;
import java.lang.*;
/**
 * This is the class where all the classes has been made as objects.
 * Each and every process gets executed
 * One thing to make sure first we login as an user even the admin first should login as user and later as admin.
 * So after accesing the features the of user to access the features of admin we need to login again.
 */
public class LIMS{
    public static void main(String [] args)throws IOException{
        System.out.println( "Welcome to VVIT LMS");
        System.out.println("Enter 1 for SignUp \nEnter 2 for LogIn");
        Scanner scan=new Scanner(System.in);//scan is the scanner object 
        int choice=scan.nextInt();
        switch(choice){
            case 1:
            Register obj=new Register();//an object obj created for the class Register 
            String [] data=obj.readFiles("username.txt");
            System.out.println("Please login inorder to access the features of the software");
            case 2:
            LogIn obj1=new LogIn();//an object obj created for the class LogIn
            String[] data2=obj1.readFiles1("username.txt");
            break;
            default:
            System.out.println("Please choose from the above");
        }
        System.out.println("Enter 1 to search a book and for book availability \nEnter 2 for reserving the book \nEnter 3 for feedback \nEnter 4 if you want to login as admin");
        Scanner sca=new Scanner(System.in);
        int choice1=sca.nextInt();
        switch(choice1){
            case 1:
            Search obj =new Search();//an object obj created for the class Search 
            String [] data=obj.search("bookname.txt");
            Scanner s=new Scanner(System.in);
            System.out.println("Do you want to reserve any book\nClick y to reserve and anything not to ");
            String c2=s.next();
            if(c2.equals("y")){
                    
            }
            else{
                Scanner sc=new Scanner(System.in);                    
                System.out.println("Do you want to give any feedback\nClick y to give feedback and anything not to ");
                String c5=sc.next();
                if(c5.equals("y")){
                    Feedback obj1 =new Feedback();
                    String data3=obj1.feedback("feedback.txt");
                    System.out.println("Do you want to login as admin login again");
                }
                else{
                    System.out.println("Do you want to login as admin login again");
                    break;
                }
            
                break;
            }
            System.out.println("Enter the details of the book in order to reserve the book");
            case 2:
            Reserve obj2=new Reserve();//an object obj created for the class Reserve
            String [] data1=obj2.reserve("bookname.txt");
            Scanner sc=new Scanner(System.in);
            System.out.println("Do you want to give any feedback\nEnter y to give feedback and anything not to ");
            String c5=sc.next();
            if(c5.equals("y")){
                    
            }
            else{
                System.out.println("Do you want to login as admin login again");
                break;
            }

            case 3:
            Feedback obj3=new Feedback();
            String data3=obj3.feedback("feedback.txt");
            Scanner sac=new Scanner(System.in);
            System.out.println("If you want to login as admin login again");
            break;
            case 4:
            AdminLogin obj4=new AdminLogin();//an object obj created for the class AdminLogin
            String[] data5=obj4.adminname("names.txt");
            System.out.println("Enter 1 to issue book \nEnter 2 to return book \nEnter 3 to add book \nEnter 4 to update stock ");
            Scanner scann=new Scanner(System.in);
            int choice2=scann.nextInt();
            switch(choice2){
                case 1:
                System.out.println("you are here to issue book");
                IssueBook obj5=new IssueBook();//an object obj created for the class IssueBook
                String[] data6=obj5.issuebook("bookname.txt");
                //Scanner sca=new Scanner(System.in);
                System.out.println("Do you want to update returning of any book\nClick y to  and anything not to ");
                String c1=scann.next();
                if(c1.equals("y")){
                        
                }
                else{
                    //Scanner sc=new Scanner(System.in);
                    System.out.println("Do you want to add new book\nClick y to and anything not to ");
                    String c9=scann.next();
                    if(c9.equals("y")){
                        AddBook obj15=new AddBook();
                        String[] data15=obj15.addbook("bookname.txt");
                    }
                    else{
                        System.out.println("Do you want to update stock of book \nClick y to and anything not to ");
                        String c10=scann.next();
                        if(c10.equals("y")){
                            UpdateStock obj16=new UpdateStock();
                            String [] data16=obj16.updatestock("bookname.txt");
                        }
                    }
                    break;
                }
                case 2:
                System.out.println("you are here to update the details of returned book");
                ReturnBook obj6=new ReturnBook();//an object obj created for the class ReturnBook
                String[] data7=obj6.returnbook("bookname.txt");
                Scanner sco=new Scanner(System.in);
                System.out.println("Do you want to add any book\nClick y to  and anything not to ");
                String c21=sco.next();
                if(c21.equals("y")){
                        
                }
                else{
                    System.out.println("Do you want to update any stock\nClick y to any anything ot to ");
                    String c22=sco.next();
                    if(c22.equals("y")){
                        UpdateStock obj17=new UpdateStock();
                        String[] data17=obj17.updatestock("bookname.txt");
                    }
                    else{
                        break;
                    }
                }
                case 3:
                System.out.println("you are here to add a new book");
                AddBook obj7=new AddBook();//an object obj created for the class AddBook
                String[] data10=obj7.addbook("bookname.txt");
                Scanner scon=new Scanner(System.in);
                System.out.println("Do you want to update the stock \nClick y to  and anything not to ");
                String c3=scon.next();
                if(c3.equals("y")){
                
                }
                else{
                    break;
                }
                case 4:
                System.out.println("you are here to update the stock");
                UpdateStock obj8=new UpdateStock();//an object obj created for the UpdateStock
                String[] data11=obj8.updatestock("bookname.txt");
                break;
                default:
                System.out.println("Please choose from the above");
                    
            }
            //default:
            //System.out.println("Please choose from the above");

        }
        System.out.println("Logging out of the account ");
        System.out.println("Thanks for using VVIT LMS");
    }
}  

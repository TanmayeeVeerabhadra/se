import java.io.*;
import java.util.*;
import java.lang.*;
/**
 * This is the class where all the classes has been made as objects.
 * Each and every process gets executed
 * One thing to make sure first we login as an user even the admin first should login as user and later as admin.
 * So after accesing the features the of user to access the features of admin we need to login again.
 */
public class LMS{
    public static void main(String [] args)throws IOException{
        System.out.println( "\nWelcome to VVIT LMS");
        System.out.println("------------------------------");
        System.out.println("Enter 1 for SIGNUP \nEnter 2 for LOGIN");
        Scanner scan=new Scanner(System.in);//scan is the scanner object 
        int choice=scan.nextInt();
        switch(choice){
            case 1:
            System.out.println("\033[H\033[2J");
		                System.out.flush();
            Register obj=new Register();//an object obj created for the class Register 
            String [] data=obj.readFiles("username.txt");
            case 2:
            System.out.println("\033[H\033[2J");
		                System.out.flush();
            LogIn obj1=new LogIn();//an object obj created for the class LogIn
            String[] data2=obj1.readFiles1("username.txt");
            break;
            default:
            System.out.println("\033[H\033[2J");
		                System.out.flush();
            System.out.println("\nPlease choose from the above");
            System.exit(0);
        }
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nYou have SUCCESSFULLY LOGGED into the library management software");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\nEnter 0 to VIEW BOOKS \nEnter 1 to SEARCH BOOK and its Availability \nEnter 2 to RESERVE BOOK \nEnter 3 for FEEDBACK \nEnter 4 TO LOGIN AS ADMIN");
        Scanner sca=new Scanner(System.in);
        int choice1=sca.nextInt();
        switch(choice1){
            case 0:
            System.out.println("\n\nThe books available in the library are");
            System.out.println("------------------------------------------------------------------------");
            ViewBooks obj29=new ViewBooks();
            obj29.reader("bookname.txt");
            System.out.println("------------------------------------------------------------------------");
            case 1:
            System.out.println("\nYou are here to SEARCH the books");  
            System.out.println("----------------------------------------------------");
            //System.out.println("\nYou are here to SEARCH the books\n");
            Search obj =new Search();//an object obj created for the class Search 
            String [] data=obj.search("bookname.txt");
            Scanner s=new Scanner(System.in); 
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println("\n\nDo you want to RESERVE ANY Book\n\nClick y to reserve and anything not to ");
            String c2=s.next();
            System.out.println("\033[H\033[2J");
            System.out.flush();
            if(c2.equals("y")){
                    
            }
            else{
                Scanner sc=new Scanner(System.in); 
                System.out.println("\033[H\033[2J");
                System.out.flush();        
                System.out.println("\n\nDo you want to Give ANY FEEDBACK\n\nClick y to give feedback and anything not to ");
                String c5=sc.next();
                if(c5.equals("y")){
                    Feedback obj1 =new Feedback();
                    String data3=obj1.feedback("feedback.txt");
                    System.out.println("\n\nDo you want to LOGIN AS ADMIN LOGIN AGAIN");
                }
                else{
                    System.out.println("\n");
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\n\nDo you want to LOGIN AS ADMIN LOGIN AGAIN");
                    break;
                }
            
                break;
            }
            //System.out.println("\n\nEnter the details of the book in order to reserve the book");
            case 2:
            System.out.println("\033[H\033[2J");
		                System.out.flush();
            Reserve obj2=new Reserve();//an object obj created for the class Reserve
            String [] data1=obj2.reserve("bookname.txt");
            Scanner sc=new Scanner(System.in);
            System.out.println("\n\nDo you want to Give ANY FEEDBACK\n\nEnter y to give feedback and anything not to ");
            String c5=sc.next();
            if(c5.equals("y")){
                    
            }
            else{    
                System.out.println("\033[H\033[2J");
                System.out.flush();
                System.out.println("\n\nDo you want to LOGIN AS ADMIN LOGIN AGAIN");
                break;
            }

            case 3:
            System.out.println("\033[H\033[2J");
		                System.out.flush();
            Feedback obj3=new Feedback();
            String data3=obj3.feedback("feedback.txt");
            Scanner sac=new Scanner(System.in);
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println("\n\nIf you want to LOGIN AS ADMIN LOGIN AGAIN");
            break;
            case 4:
            System.out.println("\033[H\033[2J");
		                System.out.flush();
            AdminLogin obj4=new AdminLogin();//an object obj created for the class AdminLogin
            String[] data5=obj4.adminname("names.txt");
            System.out.println("-------------------------------------------------");
            System.out.println("\nEnter 1 to ISSUE BOOK \nEnter 2 to RETURN BOOK \nEnter 3 to ADD BOOK \nEnter 4 to UPDATE STOCK ");
            Scanner scann=new Scanner(System.in);
            int choice2=scann.nextInt();
            switch(choice2){
                case 1:
                System.out.println("\033[H\033[2J");
		                System.out.flush();
                //System.out.println("\nyou are here to issue book");
                IssueBook obj5=new IssueBook();//an object obj created for the class IssueBook
                String[] data6=obj5.issuebook("bookname.txt");
                //Scanner sca=new Scanner(System.in);
                System.out.println("\n\nDo you want to UPDATE RETURN  of ANY Book\n\nClick y to  and anything not to ");
                String c1=scann.next();
                System.out.println("\033[H\033[2J");
                System.out.flush();
                if(c1.equals("y")){
                        
                }
                else{
                    //Scanner sc=new Scanner(System.in);
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("\n\nDo you want to ADD NEW Book\n\nClick y to and anything not to ");
                    String c9=scann.next();
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    if(c9.equals("y")){
                        AddBook obj15=new AddBook();
                        String[] data15=obj15.addbook("bookname.txt");
                    }
                    else{
                        System.out.println("\033[H\033[2J");
		                System.out.flush();
                        System.out.println("\n\nDo you want to UPDATE STOCK of Book \n\nClick y to and anything not to ");
                        String c10=scann.next();
                        System.out.println("\033[H\033[2J");
		                System.out.flush();
                        if(c10.equals("y")){
                            UpdateStock obj16=new UpdateStock();
                            String [] data16=obj16.updatestock("bookname.txt");
                        }
                    }
                    break;
                }
                case 2:
                System.out.println("\033[H\033[2J");
		                System.out.flush();
                //System.out.println("\nyou are here to update the details of returned book");
                ReturnBook obj6=new ReturnBook();//an object obj created for the class ReturnBook
                String[] data7=obj6.returnbook("bookname.txt");
                Scanner sco=new Scanner(System.in);
                System.out.println("\nDo you want to ADD ANY Book\nClick y to  and anything not to ");
                String c21=sco.next();
                System.out.println("\033[H\033[2J");
                System.out.flush();
                if(c21.equals("y")){
                        
                }
                else{
                    System.out.println("\nDo you want to UPDATE ANY STOCK\nClick y to any anything ot to ");
                    String c22=sco.next();
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    if(c22.equals("y")){
                        UpdateStock obj17=new UpdateStock();
                        String[] data17=obj17.updatestock("bookname.txt");
                    }
                    else{
                        break;
                    }
                }
                case 3:
                System.out.println("\033[H\033[2J");
		                System.out.flush();
                //System.out.println("\nyou are here to add a new book");
                AddBook obj7=new AddBook();//an object obj created for the class AddBook
                String[] data10=obj7.addbook("bookname.txt");
                Scanner scon=new Scanner(System.in);
                System.out.println("\nDo you want to UPDATE the STOCK \nClick y to  and anything not to ");
                String c3=scon.next();
                System.out.println("\033[H\033[2J");
                System.out.flush();
                if(c3.equals("y")){
                
                }
                else{
                    break;
                }
                case 4:
                System.out.println("\033[H\033[2J");
		                System.out.flush();
                //System.out.println("\nyou are here to update the stock");
                UpdateStock obj8=new UpdateStock();//an object obj created for the UpdateStock
                String[] data11=obj8.updatestock("bookname.txt");
                break;
                default:
                System.out.println("\033[H\033[2J");
                System.out.flush();
                System.out.println("\nPlease choose from the above");
                System.out.println("--------------------------------");
                System.out.println("LOGGING OUT OF ACCOUNT\n ");
                System.out.println("THANKYOU FOR USING VVIT LMS\n");        
                System.exit(0);
                    
            }
            default:
            System.out.println("\033[H\033[2J");
		                System.out.flush();
            //System.out.println("Please choose from the above");
            break;

        }
        System.out.println("--------------------------------");
        System.out.println("LOGGING OUT OF ACCOUNT\n ");
        System.out.println("THANKYOU FOR USING VVIT LMS\n");
    }
}  

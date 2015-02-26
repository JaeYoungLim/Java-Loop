import java.util.Scanner;

public class ForLoop{
   public static void main(String [] args){
	   Scanner keyboard = new Scanner(System.in);

	   String a = "CSC200";
	   String b = "JL23868";
	   
	   for(String username, password;;) {
			//username = username + input
		   System.out.println("Enter the username");
		   username =keyboard.next();
		   System.out.println("Enter the password");
		   password =keyboard.next();
		   
		   if ((username.equals(a))&&(password.equals(b))){
			   System.out.println("Welcome, " + password);
			   break;
		   } else {
			   System.out.println("Wrong username and password\n");
			   }
		   }

	  
   }
}
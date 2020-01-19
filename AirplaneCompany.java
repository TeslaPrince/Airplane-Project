import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class AirlineCompany {
	
	private static final String PATH ="AirlineCompanyList";
	public static int NUMBER_OF_AirLineCompany = 10;
	
	public static void main(String[] args){
	
	
		Data data = new Data();
	    data.menu();

	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();

	    switch (choice) {
	        case 1:
	            System.out.println("Your choice is Alaska Airlines ");
	            break;
	        case 2:
	        	  System.out.println("Your choice is Allegiant Air ");
	            break;
	        case 3:
	        	  System.out.println("Your choice is American Airlines ");
	            break;
	        case 4:
	        	  System.out.println("Your choice is Delta Air Lines");
	            break;
	        case 5:
	        	  System.out.println("Your choice is Frontier Airlines");
	            break;
	        case 6:
	        	  System.out.println("Your choice is Hawaiian Airlines");
	            break;
	        case 7:
	        	  System.out.println("Your choice is JetBlue");
	            break;
	        case 8:
	        	  System.out.println("Your choice is Southwest Airlines");
	            break;
	        case 9:
	        	  System.out.println("Your choice is Spirit Airlines");
	            break;
	        case 10:
	        	  System.out.println("Your choice is United Airlines");
	            break;
	        default:
	        	  System.out.println("The flight company number you chose is invalid ");
	}
}

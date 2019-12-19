//Jenna Lambert, William Eaton, Gabriel Peters, Cody Garthwaite, Nick Maretti, Quang Do
//Created: 10-22-19 (JL)
//Modified: 10-23-19 (JL)
//Modified: 10-24-19 (JL)
//Modified: 10-25-19 (JL,CG)
//Modified: 10-26-19 (JL)
//Modified: 10-28-19 (JL)
//Modified: 10-29-19 (JL)
//Modified: 10-31-19 (WE)
//Modified: 12-6-19 (CG)
  
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWritter;
import java.io.FileReader;
import java.io.File;

public class AirplaneMidterm {
    private static final String PATH ="PostalCodes.txt";
    private static final int NUMBER_OF_CODES = 50;
    public static Scanner input = new Scanner(System.in);
    public static Ticket userTicket[] = new Ticket[1000];
    final static double firstClassPrice = 380;
    final static double economyClassPrice = 320;
    final static double wifiPrice = 18;
    final static double inFlightMealPrice = 9;
    final static double alcoholPrice = 15;
  static int wifiCount = 0;
  static int firstClassCount = 0;
   static int economyClassCount = 0;
   static int inFlightCount =0;
   static int alcoholCount = 0;
  
   public static double totalPrice;
    public static void main(String[] args) {
      
      
      
        System.out.println("Welcome to American Airlines at O'Hare International Airport!");
        int ticketNum = 1;
        String strNumUserTickets = uin("how many tickets you would like to purchase?:");
        int numUserTickets = tryStrToInt(strNumUserTickets);
        for(int i = 0; i < numUserTickets; i++){
            userTicket[i] = new Ticket();
            //Current Ticket Number
            userTicket[i].ticketNum = ticketNum;
            //User's First Name
            userTicket[i].firstName = uin("First Name:");
            //User's Middle Initial
            do{
                userTicket[i].middleInitial = uin("Middle Initial(if no middle name press enter):");
            }while(userTicket[i].middleInitial.length() > 1);
            //User's Last Name
            userTicket[i].lastName = uin("Last Name:");
            //User's Age
	do{
            String strAge = uin("Age:");
            userTicket[i].age= tryStrToInt(strAge);
	}while(age <= 150);
            //User's Destination City
            userTicket[i].destinationCity = uin("Destination City:");
            //User's Destination State
		private static void readFile() throws Exception {
		System.out.print("Reading file ...");

		File file = new File(PATH);
		System.out.println(file.exists());

		BufferedReader reader = new BufferedReader(new FileReader(PATH));
		reader.readLine();
		for (int i = 0; i < NUMBER_OF_CODES; i++) {

			String line = reader.readLine();

			if (line == null) {

				System.out.println("Reached end of file while reading");

				reader.close();

				return;
            do{
                userTicket[i].destinationState = uin("Destination State(Valid 2-letter Postal Code):");
            }while(userTicket[i].destinationState.length() > 2 ||
                    !userTicket[i].destinationState.equalsIgnoreCase("AL") && // enums all possible states lab 14 or 11 provice enum to look at use Enum.vaule of parse enum value from state 5 lines
                    !userTicket[i].destinationState.equalsIgnoreCase("AK") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("AZ") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("AR") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("CA") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("CO") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("CT") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("DE") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("DC") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("FL") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("GA") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("HI") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("IA") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("ID") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("IN") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("KS") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("KY") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("LA") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("ME") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("MD") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("MA") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("MI") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("MN") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("MS") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("MO") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("MT") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("NE") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("NV") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("NH") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("NJ") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("NM") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("NY") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("NC") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("NC") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("ND") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("OH") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("OK") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("OR") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("PA") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("RI") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("SC") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("SD") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("TN") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("TX") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("UT") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("VT") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("VA") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("WA") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("WV") &&
                    !userTicket[i].destinationState.equalsIgnoreCase("WI") && 
                    !userTicket[i].destinationState.equalsIgnoreCase("WY"));
            //User's Class Choice
            int classChoice = 0;
            do{
                userTicket[i].classChoice = uin("Class:\n1. First\n2. Economy\n");
                classChoice = tryStrToInt(userTicket[i].classChoice);
            }while(classChoice < 1 || classChoice > 2);
            switch(classChoice){
                case 1:
                    userTicket[i].classChoice = "First Class";
                    userTicket[i].seat = firstSeat();
                    firstClassCount+=1;
                    totalPrice+=firstClassPrice;
                    break;
                case 2:
                    userTicket[i].classChoice = "Economy Class";
                    userTicket[i].seat = economySeat(userTicket[i].age);
                    economyClassCount+=1;
                    totalPrice+=economyClassPrice;
                    break;
                default:
                    userTicket[i].classChoice = "Economy Class";
                    userTicket[i].seat = economySeat(userTicket[i].age);
                    economyClassCount+=1;
                    totalPrice+=economyClassPrice;
                    break;
            }
            //Military
            System.out.println("Is the flight Military realated?(y/n)");
            String strMilitary = input.nextLine();
            if(strMilitary.equalsIgnoreCase("y") || strMilitary.equalsIgnoreCase("yes")){
                userTicket[i].military = "Yes";
            }
            else if(strMilitary.equalsIgnoreCase("n") || strMilitary.equalsIgnoreCase("no")){
                userTicket[i].military = "No";
            }
            else{
                userTicket[i].military = "No";
            }
            //Disablity
            System.out.println("Do you have a physical disability?(y/n)");
            String strDisability = input.nextLine();
            if(strDisability.equalsIgnoreCase("y") || strDisability.equalsIgnoreCase("yes")){
                userTicket[i].disability = "Yes";
            }
            else if(strDisability.equalsIgnoreCase("n") || strDisability.equalsIgnoreCase("no")){
                userTicket[i].disability = "No";
            }
            else{
                userTicket[i].disability = "No";
            }
            printAll(userTicket[i].ticketNum, userTicket[i].lastName, userTicket[i].firstName, userTicket[i].middleInitial, userTicket[i].age, userTicket[i].destinationCity, userTicket[i].destinationState, userTicket[i].classChoice, userTicket[i].seat, userTicket[i].military, userTicket[i].disability);
            ticketNum++;
            System.out.println("Would you like wifi access on your flight($18)? (y/n)");
            String strWifi= input.nextLine();
            if(strWifi.equalsIgnoreCase("y") || strWifi.equalsIgnoreCase("yes")){
                totalPrice+=wifiPrice;
                wifiCount+=1;
            }
            else if(strWifi.equalsIgnoreCase("n") || strWifi.equalsIgnoreCase("no")){
               totalPrice+=0;
            }
            else{
                 totalPrice+=0;
            }
            System.out.println("Would you like in flight meals($9)? (y/n)");
            String strInFlight = input.nextLine();
            if(strInFlight.equalsIgnoreCase("y") || strInFlight.equalsIgnoreCase("yes")){
                totalPrice+=inFlightMealPrice;
                inFlightCount+=1;
                
            }
            else if(strInFlight.equalsIgnoreCase("n") || strInFlight.equalsIgnoreCase("no")){
               totalPrice+=0;
            }
            else{
                 totalPrice+=0;
            }
            if(age >= 21){
	    System.out.println("Would you like to alcohol on your flight($15)? (y/n)");
            String strAlcohol = input.nextLine(){
            if(strAlcohol.equalsIgnoreCase("y") || strAlcohol.equalsIgnoreCase("yes")){
		totalPrice+=alcoholPrice;
                alcoholCount+=1;
            }
            else if(strAlcohol.equalsIgnoreCase("n") || strAlcohol.equalsIgnoreCase("no") ){
               totalPrice+=0;
            }
            else{
                 totalPrice+=0;
            }
	    }
        }
        
      // System.out.printf("================================================\n================================================\nReceipt\nFirst Class Tickets: $%d x %d\nEconomy Class Tickets:\t $%d x %d\nWIFI:\t$ %d x %d\nIn Flight Meals:\t $%s x %s\nAlchohol Charge:\t $%d x %d\nTotal: %s\nMilitary?: %s\nDisability?: %s\n", firstClassPrice, firstClassCount, economyClassPrice, economyClassCount, wifiPrice, wifiCount, inFlightMealPrice, inFlightCount, alcoholPrice, alcoholCount, totalPrice); 
    System.out.println("================================================\n\t\tRECEIPT\n================================================\nFirst Class Tickets:\t$"+firstClassPrice+" x "+firstClassCount+"\nEconomy Class Tickets:\t$"+economyClassPrice+" x "+economyClassCount+"\nWIFI:\t$"+wifiPrice+" x "+wifiCount+"\nIn Flight Meal:\t$"+inFlightMealPrice+" x "+ inFlightCount + "\nAlchohol:\t$"+alcoholPrice+" x " +alcoholCount+"\n------------------------------------------------\nTotalPrice:\t$" +totalPrice);
    }
    
    public static String uin(String prompt){
        String uin;
        System.out.printf("Input %s ", prompt);
        uin = input.nextLine();
        return uin;
    }
    public static String firstSeat(){
        String strRowNum;
        int rowNum;
        do{
            System.out.println("Select a row: \n3\t4\t5\t6\n");
            strRowNum = input.nextLine();
            rowNum = tryStrToInt(strRowNum);
        }while(rowNum < 3 || rowNum > 6);
        String seatLetter;
        do{
            System.out.println("Select a seat:\nA\tB\tE\tF\n");
            seatLetter = input.nextLine();
        }while(!seatLetter.equalsIgnoreCase("A") && !seatLetter.equalsIgnoreCase("B") && !seatLetter.equalsIgnoreCase("E") && !seatLetter.equalsIgnoreCase("F"));
        String seat = strRowNum+seatLetter;
        return seat;
    }
    public static String economySeat(int age){
        String strRowNum;
        int rowNum;
        do{
            System.out.println("Select a row between 7 and 33: ");
            strRowNum = input.nextLine();
            rowNum = tryStrToInt(strRowNum);
            if (age < 15){
                do{
                    System.out.println("Children under the age of 15 cannot sit in the Exit rows. Please enter a new row number");
                    strRowNum = input.nextLine();
                    rowNum = tryStrToInt(strRowNum);
                }while(rowNum == 15 || rowNum == 14);
            }
        }while(rowNum < 7 || rowNum > 33);
        String seatLetter;
        do{
            System.out.println("Select a seat:\nA\tB\tC\tD\tE\tF\n");
            seatLetter = input.nextLine();
        }while(!seatLetter.equalsIgnoreCase("A") && !seatLetter.equalsIgnoreCase("B") && !seatLetter.equalsIgnoreCase("C") && !seatLetter.equalsIgnoreCase("D") && !seatLetter.equalsIgnoreCase("E") && !seatLetter.equalsIgnoreCase("F"));
        String seat = strRowNum+seatLetter;
        return seat;
    }
    public static int tryStrToInt(String strCin){
        int cin = 0;
        try{
            cin = Integer.parseInt(strCin);
        }
        catch(Exception e){
            System.out.println("Invalid Input");
        }
        return cin;
    }
    public static void printAll(int ticketNum, String lastName, String firstName, String middleInitial, int age, String destinationCity, String destinationState, String strClassChoice, String seat, String strMilitary, String strDisability){
        System.out.printf("================================================\nTicket Number: %d\nFull Name: %s, %s %s\nAge: %d\nDestination: %s, %s\nClass Choice: %s\nSeat: %s\nMilitary?: %s\nDisability?: %s\n", ticketNum, lastName, firstName, middleInitial, age, destinationCity, destinationState, strClassChoice, seat, strMilitary, strDisability);
    }
  /* public static void printPassangerCharges(){
        System.out.printf("================================================\nFLIGHT CHARGES \nPrice of ticket: %s \nWifi: %d\nIn Flight Meals: %s \nAlcohol: %s\nNumber of drinks(no more then 4): %s", ticketNum, lastName, firstName, middleInitial, age, destinationCity, destinationState, strClassChoice, seat, strMilitary, strDisability);
    }*/
}

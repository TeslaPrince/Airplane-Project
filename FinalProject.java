//will 12/19/2019
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;

/**
 * Write a description of class SampleMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class FinalProject
{
    FirstClass firstC;//declaring first class object
    Commercial comm;
    static Scanner scanner = new Scanner(System.in);
    int numb_of_tickets;
    private static int NUM_OF_STATES = 50;// number of states for array getting data from excel sheet
    private static final String PATH ="SateFlightTimes.csv";//excel sheet
    private static final Ticket userTicket[] = new Ticket[1000];//max amount of ticketVariables
    // instance variables - replace the example below with your own

    private static final String[] STATES = new String[NUM_OF_STATES];
    private static final String[] FLIGHT_TIME = new String[NUM_OF_STATES];
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int firstCount = 0;
        int commCount = 0;
        int wifiCount = 0;
        int drinkCount = 0;
        int foodCount = 0;
        int boozeCount = 0;
        int movieCount = 0;
        FirstClass firstC;//declaring first class object
        Commercial comm; // declare commercial Onject
        System.out.println("\t\tWelcome to American Airlines at O'Hare International Airport!\n\n");
        int ticketNum = 1; //base ticket number. will increase one after every loop

        //uin used  for formating questions easier
        String strNumUserTickets = uin("\tHow many tickets you would like to purchase?: ");
        String userTicketNum = scanner.nextLine();
        int numUserTickets = tryStrToInt(strNumUserTickets);
        if(numUserTickets>30 || numUserTickets<1){
            numUserTickets = 1;
        }

        for (int i = 1; i <= numUserTickets; i++){

            userTicket[i] = new Ticket();
            //Current Ticket Number
            userTicket[i].ticketNum = ticketNum;
            //User's First Name

            userTicket[i].firstName = uin("First Name: ");
            //User's Middle Initial

            do{
                userTicket[i].middleInitial = uin("Middle Initial(if no middle name press enter): ");
            }while(userTicket[i].middleInitial.length() > 1);
            //User's Last Name
            userTicket[i].lastName = uin("Last Name: ");
            //User's Age

            String strAge = uin("Age:");
            int age= tryStrToInt(strAge);

            userTicket[i].age = age;

            userTicket[i].destinationCity = uin("Destination City: ");
            //User's Destination State
            /*
            do{   userTicket[i].destinationState = uin("Destination State(Valid 2-letter Postal Code):");
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
             */

            String whatClass = uin("what class you like...\n\tFirst Class($1000):\tFirst\n\tCommercial($370):\tregular\n");
            if(whatClass.equalsIgnoreCase("first")){
                userTicket[i].classChoice="First Class";
                firstCount++;    
                String useWifi = uin("if you would like wifi ong your flight($12): Yes Or No\n"); 
                if(useWifi.equalsIgnoreCase("yes") || useWifi.equalsIgnoreCase("y")){
                    wifiCount++;
                }
                else if(useWifi.equalsIgnoreCase("no") || useWifi.equalsIgnoreCase("n")){
                    System.out.println("You chose not to use Wifi.\n");

                }
                else{
                    System.out.println("You chose not to use Wifi.\n");

                }
                String wantDrink = uin("if you would like refresments on your flight\n($6): Yes Or No\n");
                if(wantDrink.equalsIgnoreCase("yes") || wantDrink.equalsIgnoreCase("y")){
                    drinkCount++;             
                }
                else if(wantDrink.equalsIgnoreCase("no") || wantDrink.equalsIgnoreCase("n")){
                    System.out.println("You chose not to have a beverage.\n");
                }
                else{
                    System.out.println("You chose not to have a beverage.\n");
                }

                firstC = new  FirstClass(useWifi, wantDrink);

                FirstClass firstClass = (FirstClass) firstC;
                //  System.out.println(firstC.toString());
                firstClass.firstClassMessage();

                String wantBooze = uin("if you want access to alcohol on this flight($16): Yes or No\n");
                if(wantBooze.equalsIgnoreCase("yes") || wantBooze.equalsIgnoreCase("y")){
                    boozeCount++;             
                }
                else if(wantBooze.equalsIgnoreCase("no") || wantBooze.equalsIgnoreCase("n")){
                    System.out.println("You chose not to have alcohol.\n");
                }
                else{

                    System.out.println("You chose not to have a beverage.\n");
                }
                String wantMovie = uin("if you want access to watch movies on this flight($25): Yes or No");
                if(wantMovie.equalsIgnoreCase("yes") || wantMovie.equalsIgnoreCase("y")){
                    movieCount++;             
                }
                else if(wantMovie.equalsIgnoreCase("no") || wantMovie.equalsIgnoreCase("n")){
                    System.out.println("You chose not to watch Movies.\n");
                }
                else{

                    System.out.println("You chose not to watch Movies.\n");
                }
                String wantFood = uin("if you want food on this flight($15): Yes or No");
                if(wantFood.equalsIgnoreCase("yes") || wantFood.equalsIgnoreCase("y")){
                    foodCount++;             
                }
                else if(wantFood.equalsIgnoreCase("no") || wantFood.equalsIgnoreCase("n")){
                    System.out.println("You chose not to eat.\n");
                }
                else{

                    System.out.println("You chose not to eat.\n");

                }
            }//
            else if(whatClass.equalsIgnoreCase("regular")){
                userTicket[i].classChoice =" Regular Class";
                commCount++;
                String useWifi = uin("if you would like wifi ong your flight($12): Yes Or No\n"); 
                if(useWifi.equalsIgnoreCase("yes") || useWifi.equalsIgnoreCase("y")){
                    wifiCount++;
                }
                else if(useWifi.equalsIgnoreCase("no") || useWifi.equalsIgnoreCase("n")){
                    System.out.println("You chose not to use Wifi.\n\n");
                }
                else{
                    System.out.println("You chose not to use Wifi.\n\n");
                }
                String wantDrink = uin("if you would like refresments on your flight($6): Yes Or No\n");
                if(wantDrink.equalsIgnoreCase("yes") || wantDrink.equalsIgnoreCase("y")){
                    drinkCount++;
                }
                else if(wantDrink.equalsIgnoreCase("no") || wantDrink.equalsIgnoreCase("n")){
                    System.out.println("You chose not to have a beverage.\n");
                }
                else{
                    System.out.println("You chose not to have a beverage.\n");
                }
                comm = new Commercial(useWifi,wantDrink);
                Commercial  commersc = (Commercial) comm;
                // System.out.println(comm.toString());//Prints the Commercial Object
                commersc.regularClassMessage();//calls commercial 
            }
            else{
                userTicket[i].classChoice =" Regular Class";
                commCount++;
                String useWifi = uin("if you would like wifi ong your flight\n($12): Yes Or No\n"); 
                if(useWifi.equalsIgnoreCase("yes") || useWifi.equalsIgnoreCase("y")){
                    wifiCount++;
                }
                else if(useWifi.equalsIgnoreCase("no") || useWifi.equalsIgnoreCase("n")){
                    System.out.println("You chose not to use Wifi.\n\n");
                }
                else{
                    System.out.println("You chose not to use Wifi.\n\n");
                }
                String wantDrink = uin("if you would like refresments on your flight\n($6): Yes Or No\n");
                if(wantDrink.equalsIgnoreCase("yes") || wantDrink.equalsIgnoreCase("y")){
                    drinkCount++;
                }
                else if(wantDrink.equalsIgnoreCase("no") || wantDrink.equalsIgnoreCase("n")){
                    System.out.println("You chose not to have a beverage.\n");
                }
                else{
                    System.out.println("You chose not to have a beverage.\n");
                }
                comm = new Commercial(useWifi,wantDrink);
                Commercial  commersc = (Commercial) comm;
                // System.out.println(comm.toString());//Prints the Commercial Object
                commersc.regularClassMessage();//calls commercial 

            }

            System.out.println("\n\nIs the flight Military realated?(y/n)");
            String strMilitary = scanner.nextLine();
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
            System.out.println("\nDo you have a physical disability?(y/n)");
            String strDisability = scanner.nextLine();
            if(strDisability.equalsIgnoreCase("y") || strDisability.equalsIgnoreCase("yes")){
                userTicket[i].disability = "Yes";
            }
            else if(strDisability.equalsIgnoreCase("n") || strDisability.equalsIgnoreCase("no")){
                userTicket[i].disability = "No";
            }
            else{
                userTicket[i].disability = "No";
            }

            printAll(userTicket[i].ticketNum, userTicket[i].lastName, userTicket[i].firstName, userTicket[i].middleInitial, userTicket[i].age, userTicket[i].destinationCity, userTicket[i].disability, userTicket[i].military);
            ticketNum++;
        }

    }
    public static void printAll(int ticketNum, String lastName, String firstName, String middleInitial, int age, String destinationCity, String disability, String military ){
        System.out.printf("================================================\nTicket Number: %d\nFull Name: %s, %s %s\nAge: %d\nDestination: %s, \nDisability: %s\nMilitary Service:%s\n\n\n\n", ticketNum, lastName, firstName, middleInitial, age, destinationCity, disability, military);
    }

    public static String uin(String prompt){
        String uin;
        System.out.printf("Input %s", prompt);
        uin = scanner.nextLine();
        return uin;
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

    private static void readFile() throws Exception{

        //BufferedReader is preferred to Scanner since the dataset is large
        //The FileReader instantiation was done inline
        BufferedReader reader = new BufferedReader( new FileReader( PATH ) );   

        //Read the first line but don't store it- we skip it because it's just a header row (see the .csv file)
        reader.readLine();

        //Run a loop so that i equals every index from 0 to the number of albums
        for( int i = 0; i < NUM_OF_STATES; i++ ){
            //Read the line from the reader
            String line = reader.readLine();

            //If the line is null (remember- String is an Object not a primitive so the default value is null)
            if( line == null ){
                //If we get here, then there were fewer lines in the file than what our constant value expected
                System.out.println( "Reached end of file while reading" );
                //Close the reader to prevent memory leaks!
                reader.close();
                //End the program
                return;
            }
            else{
                //The .split() method expects a String to use as a delimiter
                //The resulting array of Strings will contain every substring of 'line' which was separated by the delimiter (a comma)
                String[] columns = line.split( "," );
                //Column 0 contains the 'number' value, which is irrelevant to us for this program since the dataset is already sorted
                //Column 1 contains the release year of the album. We need to parse it into an int before we can put it in the array
                STATES[i] = columns[1];
                FLIGHT_TIME[i] = columns[2];
            }
        }
        //Close the reader 
        reader.close();

    }

}

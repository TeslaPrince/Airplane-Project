import javax.swing.*;
import java.util.*;
import java.io.*;
public class Finalpro
{
    private static final String PATH ="StateFlightTimes.csv";
    public static int NUMBER_OF_FLIGHTS = 51;
    private static String[] states = new String[NUMBER_OF_FLIGHTS];
    private static float[] times = new float[NUMBER_OF_FLIGHTS]; 
    public static JFrame frame = new JFrame();
    private static final String PATH2 = "Usernames.txt";
    private static final String PATH3 = "Passwords.txt"; 
    File file = new File ("c://temp//usernames.txt");
    public static void main(String[] args){
        boolean wrongInput= false;
        String welcome;
        String invalid_input;
        int user_choices=1;

        //do{
            //wrongInput = false;
            String in1 = JOptionPane.showInputDialog("Welcome To Domestic Flights Planner\n Please input an option from the list\n 1. Log in\n 2. Sign Up\n 3.Plan a flight");
            int user_choice = Integer.valueOf(in1);
            int i = 0;
            for (i=0; i<user_choices; ++i){
                do{
                    switch(user_choice) {
                        case 1:
                        String logIn= JOptionPane.showInputDialog("Please input a valid username");

                        break;
                        case 2:

                        try 
                        {
                            fileWriter();
                        }
                        catch (Exception e)
                        {
                            JOptionPane.showMessageDialog(frame, "Error In File Writing ");
                        }
                        break;
                        case 3:
                        String plan= JOptionPane.showInputDialog("Welcome to the flight selector Please Choose from one of the following:\n 1.Destination \n 2.Milage\n 3.Tourist Favorites \n 4.Hotels \n 5.Return To Main Menu");
                        int subChoice= Integer.valueOf(plan);

                        switch(subChoice){
                            case 1:
                            try {
                                stateInput();
                                //JOptionPane.showMessageDialog(frame, "Reached End Of File While Parsing!");
                            }
                            catch(Exception e){
                                JOptionPane.showMessageDialog(frame, "File could not be read" + e );
                            }
                            break;

                            case 2:
                            try {
                                flightTimes();
                            }
                            catch (Exception e){
                                System.out.println(e);
                            }
                            break;
                            case 3:
                            break;
                            case 4:
                            break;
                            default:
                            break;
                        }
                        break;

                        default:
                        JOptionPane.showMessageDialog(frame, "Please make a valid input");
                        user_choice=0;
                    }
                }
                while (1<= user_choice || user_choice <= 3 );
            }
        //}while (user_choice !=1|| user_choice!=2 || user_choice!=3) ;
    }

    public static void stateInput() throws Exception
    {
        FileReader fileReading= new FileReader(PATH);
        BufferedReader reader= new BufferedReader(fileReading);
        reader.readLine();
        HashSet<State> states = new HashSet<>(50);
        for (int i= 0; i < NUMBER_OF_FLIGHTS; i++){
            String starting = reader.readLine();
            if (starting != null) {
                String[] vert = starting.split(",");
                String str = vert[0];
                State s = State.valueOf(str);
                states.add(s);
                //hash set for states, enum.valueof 
                //times[i]= Float.parseFloat(vert[1]);

            }
        }
        reader.close();
        fileReading.close();
        List<State> States = new ArrayList<State>(states);
        Collections.sort(States);
        JOptionPane.showMessageDialog(frame, States);
    }

    public static void flightTimes() throws Exception{
        FileReader numberParseing = new FileReader(PATH);
        BufferedReader reader = new BufferedReader(numberParseing);
        reader.readLine();

        for (int i=0; i< NUMBER_OF_FLIGHTS; i++){
            String starting=reader.readLine();
            if (starting != null){
                String[] vert = starting.split(",");
                String str = vert[0];
                float dist= Float.parseFloat(vert[1]);

                //distance.add(dist);

            }
        }
        reader.close();
        numberParseing.close();
        //List<State> dista = new ArrayList<State>(s);
        //JOptionPane.showMessageDialog(frame, dist);
    }

    public static void writeToFile(String path, String data){
        try{
            BufferedWriter writer = new BufferedWriter (new FileWriter(path, true));
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    public static void fileWriter()throws Exception{
        BufferedWriter bwu = null;
        BufferedWriter bwp = null;
        String usernameC = JOptionPane.showInputDialog("Please Create a valid username");
        FileWriter writer = new FileWriter(usernameC);
        bwu = new BufferedWriter(writer);
        bwu.write(usernameC);
        writeToFile(PATH2, usernameC);
        writer.write(usernameC);
        writer.flush();
        writer.close();
        String passwordC= JOptionPane.showInputDialog("Please Create A Passcode \nPlease Remember Not To Share These");
        FileWriter writer1 = new FileWriter(passwordC);
        bwp = new BufferedWriter (writer1);
        writer.write(passwordC);
        writer.flush();
        writer.close();
    }
}
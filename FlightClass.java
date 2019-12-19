
/**
 * Write a description of class FlightClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class FlightClass
{
    /*declare void class in this abstract then later call the class that extends FlightClass 

    once you call it in the other class make sure you overide

    use method to take strings and return prices depending on what class they choose

     */
    
    protected String wifi;
    protected String drink;


    public FlightClass( String wifi, String drink){
        this.wifi = wifi;
        this.drink = drink;
        
        //lab 11
    }
    
    
     public final String getWifi(){
        return wifi;
    }

    public final String getdDrink(){
        return drink;
    }
 
  

    

}
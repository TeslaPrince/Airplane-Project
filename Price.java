
/**
 * Write a description of class prices here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Price
{
    // instance variables - replace the example below with your own
    private int firstCount;
    private int commCount;
    
    private int countWifi;
    
    private int countFood;
    
    private int countBooze;
    
    private int countMovie;
    
    private int countDrinks;
    private void Prices(int firstCount, int commCount, String wifi, int countWifi,  String food,int countFood, String drinks , int countDrinks, String booze,int countBooze, String movie ,int countMovie){

        this.firstCount = firstCount;
        this.commCount = commCount;
        this.countWifi = countWifi;
        this.countFood = countFood;
        this.countDrinks = countDrinks;
        this.countBooze = countBooze;
        this.countMovie = countMovie;

    }

    public int getFirstCount(){
        return firstCount;
    }

    public int getCommCount(){
        return commCount;
    }

    public int getCountWifi(){
        return countWifi;
    }

    public int getCountFood(){
        return countFood;
    }
    public int getCountDrinks(){
        return countDrinks;
    }
    public int getCountBooze(){
        return countBooze;
    }
     public int getCountMovie(){
        return countMovie;
    }
    
    
    public void receiptFinal(int firstCount, int commCount, int countWifi, int countFood, int countDrinks, int countBooze, int countMovie){
    
    
    int FCC = firstCount*1000;
    int CCC = commCount*365;
    int WC = countWifi*12;
    int FC = countFood*15;
    int DC = countDrinks*6;
    int BC = countBooze*16;
    int MC = countMovie*25;
    
    int finalValue = FCC+CCC+WC+FC+DC+BC+MC;
    
    
    }
    
    
}

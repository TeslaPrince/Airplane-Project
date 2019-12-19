
public class Ticket {
    public int ticketNum;
    public String firstName;
    public String middleInitial;
    public String lastName;
    public int age;
    public String destinationCity;
    public String destinationState;
    public String classChoice;
    public String military;
    public String disability;
    public String seat;
    
    public void ticket(int ticketNum, String firstName, String middleInitial, String lastName, int age, String destinationCity, String destinationState, String classChoice, String seat, String military, String disability){
        setTicketNum(ticketNum);
        setFirstName(firstName);
        setMiddleInitial(middleInitial);
        setLastName(lastName);
        setAge(age);
        setDestinationCity(destinationCity);
        setDestinationState(destinationState);
        setClassChoice(classChoice);
        setSeat(seat);
        setMilitary(military);
        setDisability(disability);
    }

    public int getTicketNum(){
        return ticketNum;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getMiddleInitial(){
        return middleInitial;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public String getDestinationCity(){
        return destinationCity;
    }

    public String getDestinationState(){
        return destinationState;
    }

    public String getClassChoice(){
        return classChoice;
    }

    public String getSeat(){
        return seat;
    }

    public String getMilitary(){
        return military;
    }

    public String getDisability(){
        return disability;
    }

    public void setTicketNum(int ticketNum){
        this.ticketNum = ticketNum;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setMiddleInitial(String middleInitial){
        this.middleInitial = middleInitial;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setDestinationCity(String destinationCity){
        this.destinationCity = destinationCity;
    }

    public void setDestinationState(String destinationState){
        this.destinationState = destinationState;
    }

    public void setClassChoice(String classChoice){
        this.classChoice = classChoice;
    }

    public void setSeat(String seat){
        this.seat = seat;
    }

    public void setMilitary(String military){
        this.military = military;
    }

    public void setDisability(String disability){
        this.disability = disability;
    }
}
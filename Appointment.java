/*
Implement a superclass Appointment and subclasses Onetime, Daily, and Monthly.  An
appointment has a description (for example, “see the dentist”) and a date (use int's to store the date).
Write a method occursOn(int year, int month, int day) that checks whether the
appointment occurs on that date.  For example, for a monthly appointment, you must check whether the
day of the month matches
 */
public class Appointment {

    private String description;
    private int month;
    private int day;
    private int year;
    public Appointment(){
        description = "";   // set empty string
        month = day = year = 0; // set initial values to zero
    }

    public Appointment(int year, int month, int day, String description){   // constructor
        this.description = description;     // values set to equal current value
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public boolean occursOn(int year, int month, int day){      // returns true if date matches
        return (year == this.year && month == this.month && day == this.day);
    }

    public String getDescription(){
        return description;
    }       // these methods will return a value

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setDescription(String description){
        this.description = description;
    }   // these methods will set a value to be returned in get methods

    public void setMonth(int month){
        this.month = month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString(){
        return getClass().getName() + "[" + getDescription() + ": " + getMonth() + "/" + getDay() + "/" + getYear() + "]";
    }
}

class Onetime extends Appointment {     // subclass of appointment
    public Onetime(){

    }

    public Onetime(int year, int month, int day, String description){
        super(year, month, day, description);
    }   // constructor of Onetime

    @Override
    public boolean occursOn(int year, int month, int day){
        return super.occursOn(year, month, day);
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
class Daily extends Appointment {       // subclass of appointment
    public Daily(){

    }

    public Daily(int year, int month, int day, String description){
        super(year, month, day, description);
    }   // constructor of Daily
    @Override
    public boolean occursOn(int year, int month, int day){
        return day == getDay();
    }

    @Override
    public String toString(){
        return super.toString();
    }
}

class Monthly extends Appointment {     // subclass of appointment
    public Monthly(){

    }

    public Monthly(int year, int month, int day, String description){
        super(year, month, day, description);
    }   // constructor of Monthly
    @Override
    public boolean occursOn(int year, int month, int day){
        return month == getMonth() && day == getDay();
    }

    @Override
    public String toString(){
        return super.toString();
    }
}

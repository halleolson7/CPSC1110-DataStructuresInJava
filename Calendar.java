import java.util.ArrayList;
import java.util.Iterator;
public class Calendar {
    private ArrayList<Appointment> appointments;    // creates ArrayList

    public Calendar(){
        appointments = new ArrayList<>();   // new appointment (date)
    }

    public void add(Appointment apt) {  // adds appointment to ArrayList appointments
        appointments.add(apt);
    }

    public void remove(int year, int month, int day){   // iterator to remove a date value
        Iterator<Appointment> iterator = appointments.iterator();

        while (iterator.hasNext()){
            Appointment appointment = iterator.next();
            if (appointment.getDay() == day && appointment.getMonth() == month && appointment.getYear() == year){
                iterator.remove();
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder ret = new StringBuilder();

        for (Appointment appointment : appointments){
            ret.append(appointment).append("\n");
        }
        return ret.toString();
    }
}

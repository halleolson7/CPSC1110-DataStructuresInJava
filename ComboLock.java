/**
 * @author HALLE OLSON
 * @date 9/13/2022
 *
 A class to simulate a combination lock.
 */
public class ComboLock
{

    //********* you will need to create appropriate instance variables here
    private int currentNumber = 0; //current value lock dial is set to
    //more variables here ....
    int secret1, secret2, secret3;
    int number1, number2, number3 = 0;

    /**
     Initializes the combination of the lock.

     */
    //**** COMPLETE THIS CONSTRUCTOR - input should be 3 number combination
    //**** You may need to set other instance variables other than the
    //**** arguments here
    //You should verify that the secret number are in the range 0-39 (inclusive)
    //if the values given are not in that range, clamp them.
    //i.e. the call new ComboLock(0, -20, 45) would create a combination of
    // 0, 0, 39  (the -20 gets clamped to 0 because it was less than 0)
    // (the 45 gets clamped to 39 because it was > 39).
    public ComboLock(int secret1, int secret2, int secret3)
    {
        this.secret1 = checkSecret(secret1);
        this.secret2 = checkSecret(secret2);
        this.secret3 = checkSecret(secret3);
    }
    public static int checkSecret(int value)
    {
        int number = value;
        if (value < 0){
            number = 0;
        }
        else if (value > 39){
            number = 39;
        }
        else { number = value; }

        return number;
    }
    /**
     Resets the state of the lock so that it can be opened again.
     */
    //********* COMPLETE THIS METHOD
    public void reset()
    {
        this.number1 = 0;
        this.number2 = 0;
        this.currentNumber = 0;
    }

    /**
     Turns lock left given number of ticks.
     @param ticks number of ticks to turn left
     */
    //*********COMPLETE THIS METHOD
    //you can assume that ticks will be a valid value between 0-40
    //note that 40 ticks in either direction should return us back to the
    //number we started on
    public void turnLeft(int ticks)
    {
        if (ticks < 40){
            currentNumber = currentNumber + ticks;
        }
        if (ticks > 40){
        }
        else {
            if (number1 == 0){
                number1 = currentNumber;
            }
            else if (number2 == 0){
                number2 = currentNumber;
            }
            else { number3 = currentNumber; }
        }
    }

    /**
     Turns lock right given number of ticks
     @param ticks number of ticks to turn right
     */
    //*********COMPLETE THIS METHOD
    //you can assume that ticks will be a valid value between 0-40
    //note that 40 ticks in either direction should return us back to the
    //number we started on
    public void turnRight(int ticks)
    {
        currentNumber = currentNumber + 40 - ticks;
        if (ticks > 40){
        }
        else {
            if (number1 == 0){
                number1 = currentNumber;
            }
            else if (number2 == 0){
                number2 = currentNumber;
            }
            else { number3 = currentNumber; }
        }
    }

    /**
     Returns true if the lock can be opened now
     @return true if lock is in open state
     */
    //**** COMPLETE THIS METHOD
    public boolean open()
    {
        if (this.secret1 == number1 && this.secret2 == number2 && this.secret3 == number3){
            return true;
        }
        else{ return false; }
    }
    /**
     Returns current value dial is pointing at
     @return value dial is pointing at currently
     */
    public int getCurrentNumber() {
        if (currentNumber >= 40){
            currentNumber = currentNumber % 40;
        }
        return currentNumber;
    }

}

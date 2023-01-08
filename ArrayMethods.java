import java.util.Arrays;
import java.util.Random;
public class ArrayMethods {
    //part a, fill in this method
    public static void swapFirstAndLast(int[] values) {
        // save the first element to a temp var
        int temp = values[0];
        //move the last element to the first position
        values[0] = values[values.length-1];
        // now put the saved first element into the last position
        values[values.length-1] = temp;
    }

    //part b, fill in this method
    public static void shiftRight(int[] values) {
        // save last element value into temp
        int temp = values[values.length - 1];
        for (int i = values.length - 2; i >= 0; i--){ // shift right
            values[i+1] = values[i];
        }
        values[0] = temp;   // move last element to start position 0
    }

    //part c, set all even elements to 0.
    public static void setEvensToZero(int[] values) {
        for (int i = 0; i < values.length; i++){
            if (values[i] % 2 == 0){    // if even
                values[i] = 0;      // element at pos i set to 0
            }
        }
    }

    //part d, replace each element except the first and last by larger of two
    //around it
    public static void largerOfAdjacents(int[] values) {
        int temp1 = values[0];
        int temp2 = values[values.length -1];
        for (int i = 1; i < values.length-1; i++){
            if (values[i] < values[i+1] && values[i+1] > values[i-1]){  // if element is less than element after and element after is greater than prev
                values[i] = values[i+1];
            }
            else if (values[i] < values[i-1] && values[i-1] > values[i+1]){ // if element is less than element prev and element prev is greater than after
                values[i] = values[i-1];
            }
        }
        values[0] = temp1;      // keep start and end vals the same
        values[values.length -1] = temp2;
    }

    //part e, remove middle el if odd length, else remove middle two els.
    public static int[] removeMiddle(int[] values) {
        //replace the following line with your answer
        int newValues[];
        if (values.length % 2 == 0){        // if even
            newValues = new int[values.length - 2];
            for (int i = 0; i < (newValues.length/2); i++){
                newValues[i] = values[i];
                //System.out.print(newValues[i] + ", ");
            }
            for (int i = (newValues.length/2); i < newValues.length; i++) {
                newValues[i] = values[i+2];
                //System.out.print(newValues[i] + ", ");
            }
        }
        else {      // if odd
            newValues = new int[values.length - 1];
            for(int i = 0; i < (newValues.length/2); i++){
                newValues[i] = values[i];
                //System.out.print(newValues[i] + ", ");
            }
            for (int i = (newValues.length/2); i < newValues.length; i++) {
                newValues[i] = values[i+1];
                //System.out.print(newValues[i] + ", ");
            }
        }
        return newValues;
        //this line needed to compile
        //return null;
    }

    //part f - move all evens to front
    public static void moveEvensToFront(int[] values) {
        int temp = 0;
        int x = 0;
        for (int i = 0; i < values.length; i++){
            if (values[i] % 2 == 0){
                for (int j = i; j > x; j--){
                    temp = values[j-1];     // shifts evens to front and odds to end one by one
                    values[j-1] = values[j];
                    values[j] = temp;
                }
                x++;
            }
        }
    }

    //part g - return second largest element in array
    public static int ret2ndLargest(int[] values) {
        int largest;
        int secLargest;
        if (values.length < 2){
            System.out.println("Too Short");
            return -1;
        }

        largest = secLargest = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++){
            if (values[i] > largest){
                secLargest = largest;
                largest = values[i];
            }
            else if (values[i] > secLargest && values[i] != largest){   // greater than prev 2nd largest value, but not the largest value
                secLargest = values[i];     // assign element at values[i] to secLargest
            }
        }
        return secLargest;
    }

    //part H - returns true if array is sorted in increasing order
    public static boolean isSorted(int[] values) {
        // replace this line with your correct return value
        //Arrays.sort(values);
        for (int i = 0; i < values.length; i++){
            if (values[i] < values[i+1]){       // if element value is less than next element: return true
                return true;
            }
            else { return false; }
        }
        return false;
    }

    //PART I - return true if array contains 2 adjacent duplicate values

    public static boolean hasAdjDuplicates(int[] values) {
        // replace this line with your correct return value
        Arrays.sort(values);
        for (int i = 1; i < values.length; i++){
            if((values[i] == values[i-1]) || (values[i] == values[i+1])){   // if left or right element to current element at position is the same: return true
                return true;
            }
            else { return false; }
        }
        return false; //dummy return value
    }


    //PART J - return true if array contains 2 duplicate values
    //duplicates need not be adjacent to return true

    public static boolean hasDuplicates(int[] values) {
        // replace this line with your correct return value
        for (int i = 0; i < values.length; i++){
            for (int j = i + 1; j < values.length; j++){    // if any element equals another element within values: return true
                if (values[i] == values[j]){
                    return true;
                }
                else { return false; }
            }
        }
        return false;
    }
}

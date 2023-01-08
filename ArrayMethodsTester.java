import java.util.Arrays;
import java.util.Random;


public class ArrayMethodsTester {

    //helper method to print an array
    public static void printArray(int[] values) {
        System.out.println(Arrays.toString(values));
    }
    public static void main(String[] args) {

        int[] a = new int[10]; //array of size 10

        int[] b = new int[11]; //array of size 11 - test case
        int[] c = new int[b.length - 1];  // test case: odd num -1
        int[] d = new int[a.length - 2];   // test case: even num -2
        int[] e = new int[]{1, 2, 3, 4, 5}; // sorted array alternate test case
        //**** Fill the array with random values (use a loop, and a Random object)
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100); // sorts random ints in array a
            //System.out.println(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = rand.nextInt(100); // sorts random ints in array a
            //System.out.println(a[i]);
        }
        int[] a1 = Arrays.copyOf(a, 10);
        int[] a2 = Arrays.copyOf(a, 10);

        // INITIAL ARRAY
        //Now print the array to show initial values
        System.out.println("Initial Array:");
        //note the usage of the "toString()" method here to print the array
        System.out.println(Arrays.toString(a));
        //Could replace the previous line with this:
        //printArray(testValues);
        //blank line
        System.out.println();


        // TEST METHODS

        // Test of swapFirstAndLast()
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Before call to swapFirstAndLast():");
        printArray(a);

        //swap first and last element
        //this method modifies the array referenced by "testValues"
        ArrayMethods.swapFirstAndLast(a);
        System.out.println("After call to swapFirstAndLast()");
        printArray(a); //printing the same array but it has changed
        System.out.println();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // Test of shiftRight()
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Before call to shiftRight():");
        printArray(a);
        ArrayMethods.shiftRight(a);
        System.out.println("After call to shiftRight()");
        printArray(a); //printing the same array but it has changed
        System.out.println();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


        // Test of setEvensToZero()
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Before call to setEvensToZero():");
        printArray(a);
        ArrayMethods.setEvensToZero(a);
        System.out.println("After call to setEvensToZero()");
        printArray(a); //printing the same array but it has changed
        System.out.println();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        //Test of largerOfAdjacents()
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Before call to largerOfAdjacents():");
        printArray(a1);
        ArrayMethods.largerOfAdjacents(a1);
        System.out.println("After call to largerOfAdjacents()");
        printArray(a1); //printing the same array but it has changed
        System.out.println();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


        // Test of removeMiddle()
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Before call to removeMiddle() - Case 1 (even num):");
        printArray(a2);
        d = ArrayMethods.removeMiddle(a2);
        System.out.println("After call to removeMiddle() - Case 1");
        printArray(d); //printing the same array but it has changed
        System.out.println();

        System.out.println("Before call to removeMiddle() - Case 2 (odd num):");
        printArray(b);
        c = ArrayMethods.removeMiddle(b);
        System.out.println("After call to removeMiddle() - Case 2");
        printArray(c); //printing the same array but it has changed


        System.out.println();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


        // Test of moveEvensToFront()
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Before call to moveEvensToFront():");
        printArray(a2);
        ArrayMethods.moveEvensToFront(a2);
        System.out.println("After call to moveEvensToFront()");
        printArray(a2); //printing the same array but it has changed
        System.out.println();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


        // Test of ret2ndLargest()
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Before call to ret2ndLargest():");
        printArray(a2);
        ArrayMethods.ret2ndLargest(a2);
        System.out.println("The second largest value is: ");
        System.out.print(ArrayMethods.ret2ndLargest(a2));
        //printArray(a); //printing the same array but it has changed
        System.out.println();
        System.out.println();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        // Test of isSorted()
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Case 1 - call to isSorted():");
        printArray(a);
        System.out.println(ArrayMethods.isSorted(a));
        System.out.println("Case 2 call to isSorted():");
        printArray(e); //printing the same array but it has changed
        System.out.println(ArrayMethods.isSorted(e));
        System.out.println();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


        // Test of hasAdjDuplicates()
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Case 1 - Call to hasAdjDuplicates():");
        printArray(a);
        System.out.println("Adjacent Duplicates?");
        System.out.println(ArrayMethods.hasAdjDuplicates(a));
        System.out.println();

        System.out.println("Case 2 - Call to hasAdjDuplicates():");
        printArray(a2);
        System.out.println("Adjacent Duplicates?");
        System.out.println(ArrayMethods.hasAdjDuplicates(a2));
        System.out.println();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


        // Test of hasDuplicates()
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        System.out.println("Case 1 - Call to hasDuplicates():");
        printArray(a);
        System.out.println("Duplicates?");
        System.out.println(ArrayMethods.hasDuplicates(a));
        System.out.println();

        System.out.println("Case 2 - Call to hasDuplicates():");
        printArray(a2);
        System.out.println("Duplicates?");
        System.out.println(ArrayMethods.hasDuplicates(a2));
        System.out.println();
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~









    }

}

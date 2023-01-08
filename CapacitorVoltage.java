import java.io.*;
import java.util.Scanner;
/*
@name Halle Olson
@date 10/11/2022
 */

public class CapacitorVoltage {
    private static String readFile(String filename) throws IOException,FileNotFoundException {      // method to read file
        BufferedReader reader;
        String line = "";

        FileReader fileReader = new FileReader(     // new file reading object
                filename);
        reader = new BufferedReader(fileReader);
        line = reader.readLine();       // reads line of file

        reader.close();     // close file
        return line;        // return input from line in file
    }
    public static void main(String []args) throws IOException {     // main method, throws IOException
        boolean validFileProvided = false;      // returns boolean value for existence of valid file
        Scanner myInput = new Scanner( System.in );
        String fileName = "params.txt";         // read params.txt
        String params ="";
        while(!validFileProvided) {
            try {
                params = readFile(fileName);        // reads param.txt
                validFileProvided = true;
            }
            catch (FileNotFoundException fileNotFoundException) {     // catch if file is not found
                validFileProvided = false;
                System.out.println("Enter Valid Filename : ");      // user input for valid file name
                fileName = myInput.nextLine();
            }
        }

        String []data = params.split(" ");
        double B = Double.parseDouble(data[0]);
        double R = Double.parseDouble(data[1]);
        double C = Double.parseDouble(data[2]);
        double tStart = Double.parseDouble(data[3]);
        double tEnd = Double.parseDouble(data[4]);

        double diff = (tEnd-tStart)/100;

        FileWriter myWriter = new FileWriter("rc.txt");     // output file rc.txt

        for (int t = 0; t <= tEnd; t += diff){           // write calculated output to rx.txt
            double expValue = (-1) * t / (R * C);
            double voltage = B * (1 - Math.exp(expValue));
            myWriter.write(t + " " + voltage + "\n");
        }
        myWriter.close();       // close file
    }
}
import java.util.ArrayList;
public class Student implements sumScores, averageScores {
    /*
    Names, Scores
    Get names and get scores (interfaces)
    Calculate the average of the scores
     */
    private String name = "";
    private double score;
    private static ArrayList<Double> studentGrade = new ArrayList<>();

    public Student (String name, double score){
        this.name = name;
        this.score = score;
        studentGrade.add(score);
    }

    public String getName(){    // returns student name
        return name;
    }
    public double getScore(){   // returns student score
        return score;
    }
    @Override
    public double getAvgScores(){   // finds average of all student scores
        double total = 0;
        for (double avg : studentGrade){
            total += avg;
        }
        double size = studentGrade.size();
        total = total/size;
        return total;
    }

    @Override
    public double getSumScores(){   // adds up all student scores
        double total = 0;
        for (double sum : studentGrade){
            total += sum;
        }
        return total;
    }



    public static void main(String [] args) {
        // create student objects
        Student student1 = new Student("Halle", 97);
        Student student2 = new Student("Ashton", 88);
        Student student3 = new Student("Kaden", 85);

        System.out.println("Average Scores: " + student1.getAvgScores());   // print average score
        System.out.println("Sum of Scores: " + student1.getSumScores());    // print score sum
        System.out.println("Student 1: " + student1.getName());    // print student names
        System.out.println("Student 2: " + student2.getName());
        System.out.println("Student 3: " + student3.getName());

    }

}

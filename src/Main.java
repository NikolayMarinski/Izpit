import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("Files/students.txt");
        Scanner in = null;
        try{
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(in.hasNext()){
            String firstName = in.next();
            String lastName = in.next();
            int toefl = in.nextInt();
            int sat = in.nextInt();
            double transcript = in.nextDouble();
            String major = in.next();
            String university = in.next();
            Students student = new Students(firstName, lastName, toefl, sat, transcript, major, university);
        }
        in.close();
    }
}
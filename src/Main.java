import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String, Set<Students>> yaleStudents = new HashMap<>();
        Map<String, Set<Students>> harvardStudents = new HashMap<>();
        Map<String, Set<Students>> princetonStudents = new HashMap<>();

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
            if(student.isValid()){
                switch (university){
                    case "Yale":
                        yaleStudents.get(major).add(student);
                        break;
                    case "Harvard":
                        harvardStudents.get(major).add(student);
                        break;
                    case "Princeton":
                        princetonStudents.get(major).add(student);
                        break;

                }
            }
        }
        in.close();

        StudentThread stYale = new StudentThread("YaleThread");
        StudentThread stHarvard = new StudentThread("HarvardThread");
        StudentThread stPrinceton = new StudentThread("PrincetonThread");

        stYale.start();
        stHarvard.start();
        stPrinceton.start();



    }
}
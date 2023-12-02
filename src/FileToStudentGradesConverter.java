
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileToStudentGradesConverter {

    public List<StudentGrade> convertToStudents(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        List<StudentGrade> allStudentsFromFile = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            //<xml>numele meu<nume>
            //Ealhstan Saira|Computer Science|8
            String[] parts = currentLine.split("\\|");
            String name = parts[0];
            String discipline = parts[1];
            int grade = Integer.parseInt(parts[2]);
            StudentGrade currentStudentGrade = new StudentGrade(name, discipline, grade);
            allStudentsFromFile.add(currentStudentGrade);
        }
        return allStudentsFromFile;
    }
}

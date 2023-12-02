

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String filePath = "Files/grades.txt";
        FileToStudentGradesConverter converter = new FileToStudentGradesConverter();
        List<StudentGrade> studentGradesFromFile = converter.convertToStudents(filePath);
        System.out.println(String.format("Am gasit %d studenti in lista", studentGradesFromFile.size()));

        Classroom classroom = new Classroom(studentGradesFromFile);

        System.out.println("Nota maxima la Computer Science este: " + classroom.getMaxGrade("Computer Science"));
        System.out.println("Nota maxima la Mathematics este: " + classroom.getMaxGrade("Mathematics"));
        System.out.println("Nota maxima la Physics este: " + classroom.getMaxGrade("Physics"));
        System.out.println("-----------------");
        System.out.println("Notele la fizica sunt: " + classroom.getGradesForDiscipline("Physics"));
        System.out.println("-----------------");
        System.out.println(classroom.getGradesForStudent("Demetria Cosme"));
        System.out.println("-----------------");
        System.out.println("Nota medie la Mathematics este: " + classroom.getAverageGrade("Mathematics"));
        System.out.println("Nota medie la Computer Science este: " + classroom.getAverageGrade("Computer Science"));
        System.out.println("Nota medie la Physics este: " + classroom.getAverageGrade("Physics"));

        ReportGenerator report = new ReportGenerator(studentGradesFromFile);
        report.generateReport();
    }
}

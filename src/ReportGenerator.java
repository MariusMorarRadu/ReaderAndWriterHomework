import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {
    private List<StudentGrade> grades;

    public ReportGenerator(List<StudentGrade> grades) {
        this.grades = grades;
    }

    public void generateReport() throws IOException {
        String filePath = "files/grade-reports.out";
        Classroom myClassroom = new Classroom(grades);
        StudentGrade maxStudent  = myClassroom.getMaxGrade("Computer Science");
        String lineToWrite = "Cea mai mare nota: " + maxStudent.getName() + " " + maxStudent.getGrade();
        String lineToWrite2 = "Cea mai mare nota: " + myClassroom.getMaxGrade("Mathematics").getName() + " " + myClassroom.getMaxGrade("Mathematics").getGrade();
        String lineToWrite3 = "Cea mai mare nota: " + myClassroom.getMaxGrade("Physics").getName() + " " + myClassroom.getMaxGrade("Physics").getGrade();
        String lineToWrite4 = "Notele la fizica sunt: " + myClassroom.getGradesForDiscipline("Physics");
        String lineToWrite5 = "Notele lui Demetria Cosme sunt: " + myClassroom.getGradesForStudent("Demetria Cosme");
        String lineToWrite6 = "Nota medie la Mathematics este: " + myClassroom.getAverageGrade("Mathematics");
        String lineToWrite7 = "Nota medie la Computer Science este: " + myClassroom.getAverageGrade("Computer Science");
        String lineToWrite8 = "Nota medie la Physics este: " + myClassroom.getAverageGrade("Physics");


        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        writer.write(lineToWrite);
        writer.newLine();
        writer.write(lineToWrite2);
        writer.newLine();
        writer.write(lineToWrite3);
        writer.newLine();
        writer.write(lineToWrite4);
        writer.newLine();
        writer.write(lineToWrite5);
        writer.newLine();
        writer.write(lineToWrite6);
        writer.newLine();
        writer.write(lineToWrite7);
        writer.newLine();
        writer.write(lineToWrite8);


        writer.close();
    }
}
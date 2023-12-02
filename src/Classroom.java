

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<StudentGrade> grades;

    public Classroom(List<StudentGrade> grades) {
        this.grades = grades;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> gradesForDiscipline =  new ArrayList<>();

        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                gradesForDiscipline.add(studentGrade.getGrade());
            }
        }
        return gradesForDiscipline;
    }

    public List<Integer> getGradesForStudent(String studentName) {
        List<Integer> gradesForStudent = new ArrayList<>();

        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getName().equals(studentName)) {
                gradesForStudent.add(studentGrade.getGrade());
            }
        }
        return gradesForStudent;
    }

    public StudentGrade getMaxGrade(String discipline) {
        StudentGrade maxGrade = null;

        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                if (maxGrade == null) {
                    maxGrade = studentGrade;
                } else {
                    if (studentGrade.getGrade() > maxGrade.getGrade()) {
                        maxGrade = studentGrade;
                    }
                }
            }
        }
        return maxGrade;
    }

    public Integer getAverageGrade(String discipline) {
        int nrOfGrades = 0;
        int sumOfGrades = 0;

        for (StudentGrade studentGrade : grades) {
            if (studentGrade.getDiscipline().equals(discipline)) {
                nrOfGrades++;
                sumOfGrades = sumOfGrades + studentGrade.getGrade();
            }
        }
        return sumOfGrades / nrOfGrades;
    }
}

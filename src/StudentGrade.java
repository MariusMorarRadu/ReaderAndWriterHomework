
public class StudentGrade {
    private String name;
    private String discipline;
    private int grade;

    public StudentGrade(String name, String disclipine, int grade) {
        this.name = name;
        this.discipline = disclipine;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getGrade() {
        return grade;
    }

    public String toString() {
        return name + ";" + discipline + ";" + grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
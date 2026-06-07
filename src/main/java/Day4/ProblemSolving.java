package Day4;

public class ProblemSolving {
    private String name;
    private int grade;


    public void Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getGrade() {
        return grade;
    }


    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade! Grade must be between 0 and 100.");
        }
    }
}
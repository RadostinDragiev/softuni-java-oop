package L01_Working_With_Abstraction_Lab.P03StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }

    public void addStudent(String name, int age, double grade) {
        if (!students.containsKey(name)) {
            Student student = new Student(name, age, grade);
            this.students.put(name, student);
        }
    }

    public String showStudent(String name) {
        String studentInformation = "";

        if (students.containsKey(name)) {
            Student student = students.get(name);

            studentInformation = String.format("%s is %s years old.", student.getName(), student.getAge());

            if (student.getGrade() >= 5.00) {
                studentInformation += " Excellent student.";
            } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                studentInformation += " Average student.";
            } else {
                studentInformation += " Very nice person.";
            }
        }

        return studentInformation;
    }
}

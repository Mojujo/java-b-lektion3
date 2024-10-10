package se.oscar.lists;

import java.util.ArrayList;

public class Course {
    private final String courseName;
    private final ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                System.out.println(student);
                break;
            }
        }
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

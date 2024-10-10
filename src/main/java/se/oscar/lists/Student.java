package se.oscar.lists;

public class Student {
    private final String name;
    private final String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student [name= " + name + ", studentId= " + studentId + "]";
    }
}

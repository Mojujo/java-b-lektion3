package se.oscar.lists;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java A");


        Student student = new Student("Oscar", "1234");
        Student student1 = new Student("Stefan", "2345");
        Student student2 = new Student("Håkan", "1111");
        Student student3 = new Student("Alfons", "0000");
        Student student4 = new Student("Jonathan", "9876");


        course.addStudent(student);
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);

        System.out.println(course.getCourseName());
        course.printStudents();
        System.out.println("********************");
        course.printStudent("0000");

    }
}

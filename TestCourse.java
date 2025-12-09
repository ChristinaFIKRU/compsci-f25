// Christina F
// Test Course class
// 11/11/25


public class TestCourse {
    public static void main(String[] args) {
        TheCourse course = new TheCourse("Intro to Java");

        // Adds students to the course 
        course.addStudent("Alice");
        course.addStudent("Bob");
        course.addStudent("Charlie");

        // Display students before it gets removed 
        System.out.println("Students in " + course.getCourseName() + ":");
        displayStudents(course);

        // Removes one student
        System.out.println("\nDropping Bob...");
        course.dropStudent("Bob");

        // Display outputtt again
        System.out.println("\nStudents after removal:");
        displayStudents(course);

        // Clears all the students
        System.out.println("\nClearing all students...");
        course.clear();

        // Display output again
        System.out.println("\nAfter clear:");
        displayStudents(course);
    }

    // Helper method to print students
    public static void displayStudents(TheCourse course) {
        String[] students = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
    }
}




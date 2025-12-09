// Christina F
// the Course class
// 11/11/25
public class TheCourse {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    // Constructor
    public TheCourse(String courseName) {
        this.courseName = courseName;
        this.students = new String[2]; // start small to test auto-grow
        this.numberOfStudents = 0;
    }

    // Add a student (auto-expand array if needed)
    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            // Create new array double the size
            String[] newStudents = new String[students.length * 2];
            // Copy elements over
            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }
            students = newStudents; // reassign
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    // Drop a student by name
    public void dropStudent(String student) {
        boolean found = false;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                found = true;
                // Shift remaining elements left
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null; // remove duplicate
                numberOfStudents--;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found: " + student);
        }
    }

    // Clear all students
    public void clear() {
        students = new String[2]; // reset to initial size
        numberOfStudents = 0;
    }

    // Getters
    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }
}

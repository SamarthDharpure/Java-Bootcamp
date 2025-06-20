class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int newMaxCapacity) {
        maxCapacity = newMaxCapacity;
    }

    void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
            System.out.println(studentName + " enrolled successfully.");
        } else {
            System.out.println("Enrollment failed: Course is at full capacity.");
        }
    }

    void unenrollStudent(String studentName) {
        int index = -1;
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
          for (int i = index; i < enrollments - 1; i++) {
                enrolledStudents[i] = enrolledStudents[i + 1];
            }
            enrolledStudents[enrollments - 1] = null;
            enrollments--;
            System.out.println(studentName + " has been unenrolled.");
        } else {
            System.out.println("Unenrollment failed: Student not found.");
        }
    }
  
    void printEnrolledStudents() {
        System.out.println("Enrolled students in " + courseName + ":");
        for (int i = 0; i < enrollments; i++) {
            System.out.println((i + 1) + ". " + enrolledStudents[i]);
        }
    }

    public static void main(String[] args) {
        Course javaCourse = new Course("Java Programming");

        javaCourse.enrollStudent("Samarth");
        javaCourse.enrollStudent("Sakshi");
        javaCourse.enrollStudent("John");
        javaCourse.printEnrolledStudents();
        javaCourse.unenrollStudent("John");
        javaCourse.printEnrolledStudents();
    }
}

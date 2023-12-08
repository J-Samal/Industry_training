import java.util.HashMap;
public class University {
    public static void main(String[] args) {
        Student s1 = new Student("Janmajay" , "2001289198", "male" ,20);
        Student s2 = new Student("Rajesh" , "2001289203", "male",21);
        Student s3 = new Student("Smruti" , "2001289151", "female",25);


          
        Teacher t1= new Teacher("Dhruv Jain", "123", "male" ,31);
        Teacher t2= new Teacher("Gaurav", "456", "male" ,27);
        Teacher t3= new Teacher("Ashok", "789", "male" ,29);

        Course c1= new Course("DSA","360@dsa" );
        Course c2= new Course("JAVA using OPPS","360@java" );

        c1.enrollStudents(s1);
        c1.enrollStudents(s2);
        c1.enrollStudents(s3);

        c1.removeStudent(s3);

        c2.enrollStudents(s1);
        c2.enrollStudents(s2);
        c2.enrollStudents(s3);

        t1.addCoursesTeaching(c2);
        t1.addCoursesTeaching(c1);
        t2.addCoursesTeaching(c1);
        t3.addCoursesTeaching(c1);

        t1.coursesTaughtByTeacher();
        t2.coursesTaughtByTeacher();
        t3.coursesTaughtByTeacher();

        t3.removeTeacherFromCourse(c1);
        t3.coursesTaughtByTeacher();

        c1.getStudentEnrolled();
        c2.getStudentEnrolled();

        Exam e1 = new Exam(c1);
        HashMap<Student, Integer> markSheet= new HashMap<Student, Integer>();
        markSheet.put(s1,92);
        markSheet.put(s2,86);
        markSheet.put(s3, 23);

        e1.addMarks(markSheet);

        e1.showMarks();
    }
    
}

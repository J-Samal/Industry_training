
import java.util.ArrayList;
import java.util.List;
public class Course {
    private String CourseName;
    private String CourseId;
    public List<Student> studentEnrolled = new ArrayList<>();

    public  Course(String CourseName, String CourseId){
        this.CourseName = CourseName;
        this.CourseId = CourseId;
    }
  
    public String getCourseName() {
        return CourseName;
    }
   
    public String getCourseId() {
        return CourseId;
    }
   
    public void getStudentEnrolled() {
        System.out.println("Students Enrolled in " + getCourseName() + " : ");
        for(Student stu : studentEnrolled){
            System.out.println(stu.getName());
        }
    }
    public void enrollStudents(Student student){
        studentEnrolled.add(student);
        System.out.println(student.getName() +" is enrolled in " + getCourseName() );
    }
    public void removeStudent(Student student){
        studentEnrolled.remove(student);
        System.out.println(student.getName() + " is removed from " + getCourseName() +" course");
        
    } 
}
    


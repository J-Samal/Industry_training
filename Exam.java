import java.util.HashMap;
import java.util.Map;
public class Exam  {
    String Name;
    HashMap<Student, Integer> Marksheet = new HashMap<Student, Integer>();
    public Exam(Course course) {
        Name = course.getCourseName();
        System.out.println("Exam created Subject : " + Name);
    }
    void addMarks(HashMap<Student, Integer> exam){
        for(Map.Entry<Student, Integer> Exam : exam.entrySet()){
            Student stud = Exam.getKey();
            int mark = Exam.getValue();

            Marksheet.put(stud,mark);
        }
    }
    void showMarks(){
        System.out.println("MARKS Sub: " + Name);
        System.out.println("----------------------------------------------------------------------------");
        for(Map.Entry<Student, Integer> sheet : Marksheet.entrySet()){
            Student stud = sheet.getKey();
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Name: " + stud.getName() + " Marks: " + sheet.getValue());
        }
    }
}

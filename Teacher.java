import java.util.ArrayList;
import java.util.List;

public class Teacher{
    String Name;
    String ID;
    String Gender;
    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        Name = name;
    }
    /**
     * @return the iD
     */
    public String getID() {
        return ID;
    }
    /**
     * @param iD the iD to set
     */
    public void setID(String iD) {
        ID = iD;
    }
    /**
     * @return the gender
     */
    public String getGender() {
        return Gender;
    }
    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        Gender = gender;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return Age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        Age = age;
    }


    int Age;

    ArrayList <Course> coursesTaught = new ArrayList<Course>(); 
    public Teacher(String name, String id, String gender, int age) {
        setName(name);
        setID(id);
        setGender(gender);
        setAge(age);
    }
    public void addCoursesTeaching(Course course){
        coursesTaught.add(course);
    }
    public void coursesTaughtByTeacher(){
        System.out.println(getName() +" is teaching :"  );
        for(Course c : coursesTaught){
            System.out.println(c.getCourseName());
        }
    }
    
   

    public void removeTeacherFromCourse(Course course){
        coursesTaught.remove(course);
        System.out.println(getName()+" removed from "+ course.getCourseName() +" course");
    }

   
    
    
}

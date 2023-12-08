import java.util.ArrayList;
import java.util.List;
public class Student {
    String Name;
    String ID;
    String Gender;
    int Age;
    public Student(String name, String Id, String gender, int age) {
        setName(name);
        setID(Id);
        setGender(gender);
        setAge(age);
    }
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
    
}

  
    


   


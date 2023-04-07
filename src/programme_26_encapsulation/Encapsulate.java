package programme_26_encapsulation;

public class Encapsulate {
    // Private variable declared, this can only be accessed by public methods of class
    private String name;
    private int rollNo;
    private int age;

    // set method for name to access private variable name
    public void setName(String name) {
        this.name = name;
    }
    //get method for name to access privater variable name
    public String getName() {
        return name;
    }

    //get method for RollNo to access privater variable rollNo
    public int getRollNo() {
        return rollNo;
    }

    //set method for RollNo to access privater variable rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    //get method for age to access privater variable age
    public int getAge() {
        return age;
    }

    //set method for age to access privater variable age
    public void setAge(int age) {
        this.age = age;
    }
}

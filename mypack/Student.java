package mypack;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    protected String id;
    protected List<Student> friends;
    public static String universityName = "UTT";
    public static int total = 0;
    static String course;
    protected ArrayList<String> arrayIdFriend;

    static {
        System.out.println("ALALA");
        course = "Java core";
    }

    public Student() {
        super();
        total += 1;
    }

    
    public Student(String id, List<Student> friends, ArrayList<String> arrayIdFriend) {
        this.id = id;
        this.friends = friends;
        this.arrayIdFriend = arrayIdFriend;
    }

    public Student(String name, int age, float height, String id, List<Student> friends,
            ArrayList<String> arrayIdFriend) {
        super(name, age, height);
        this.id = id;
        this.friends = friends;
        this.arrayIdFriend = arrayIdFriend;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Student> getFriends() {
        return friends;
    }

    public void setFriends(List<Student> friend) {
        this.friends = friend;
    }

    public static void getInfoUniversity() {
        System.out.println("UTT. Education!");
        System.out.println("Course: " + Student.course);
    }

    public void getInfo() {
        System.out.println("ID: " + this.getId());
        super.getInfo();
    }

    public void setArrayIdFriend(ArrayList<String> arrayId) {
        this.arrayIdFriend = arrayId;
    }

    public ArrayList<String> getArrayIdFriend(){
        return arrayIdFriend;
    }

}

package mypack;

import java.util.List;

public class Student extends Person {

    protected String id;
    protected List<Student> friends;

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

}

import java.util.ArrayList;
public class User {
    private final int userID;
    private String name;
    private String major;
    private ArrayList<Course> gradReqs;

    public User(int userID, String name, String major) {
        this.userID = userID;
        this.name = name;
        this.major = major;
        this.gradReqs = new ArrayList<>();
    }



}

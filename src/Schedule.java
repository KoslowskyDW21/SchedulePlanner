import java.time.LocalTime;
import java.util.ArrayList;
public class Schedule {
    private int totalCredits;
    private ArrayList<String> filledTimeslots;
    private ArrayList<Course> currentCourses;

    public Schedule() {
        this.totalCredits = 0;
        this.filledTimeslots = new ArrayList<>();
        this.currentCourses = new ArrayList<>();
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void addCourse(Course course) {

    }

    public void removeCourse(Course course) {

    }

    public boolean testInSchedule(Course course) {
        return false;
    }

    public void createRecommendedSchedule() {

    }

    public String toString(){
        return null;
    }

    public void SaveSchedule(){

    }


}

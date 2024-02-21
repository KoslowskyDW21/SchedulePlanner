import java.time.LocalTime;
import java.util.ArrayList;
public class Schedule {
    private int totalCredits;
    private ArrayList<LocalTime[]> filledTimeslots;
    private ArrayList<Course> currentCourses;

    public Schedule() {
        this.totalCredits = 0;
        this.filledTimeslots = new ArrayList<>();
        this.currentCourses = new ArrayList<>();
    }

    private int getTotalCredits() {
        return totalCredits;
    }

    private void addCourse(Course course) {

    }

    private void removeCourse(Course course) {

    }



}

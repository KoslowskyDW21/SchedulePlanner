import java.time.LocalTime;

public class Course {
    private final String courseCode;
    private final String professor;
    private String color;
    private final LocalTime[] timeSlot;
    private final String description;
    private final int numCredits;
    private final Course[] preReqs;
    private final Course[] coReqs;


    public Course(String courseCode, String professor, String color, LocalTime[] timeSlot,
                  String description, int numCredits, Course[] preReqs, Course[]coReqs) {
        this.courseCode = courseCode;
        this.professor = professor;
        this.color = color;
        this.timeSlot = timeSlot;
        this.description = description;
        this.numCredits = numCredits;
        this.preReqs = preReqs;
        this.coReqs = coReqs;
    }



}

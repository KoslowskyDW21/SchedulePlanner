public class Filter {
    // filter class with apply to results method that all filters inherit from

    int credits;
    int startTime;
    int endTime;
    int levelMin;
    int levelMax;
    String profName;
    String courseCode;
    String department;



    public Filter(){
        this.credits = -1;
        this.startTime = 800;
        this.endTime = 2100;
        this.levelMin = 100;
        this.levelMax = 400;
        this.profName = "";
        this.courseCode = "";
        this.department = "";
    }

}

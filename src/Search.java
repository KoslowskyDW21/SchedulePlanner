import java.lang.reflect.Array;
import java.util.ArrayList;
public class Search {
    private String userInput;
    private String[] filters;
    private ArrayList<Course> results;

    public Search() {
        this.userInput = "";
        this.filters = null;
        this.results = new ArrayList<Course>();
    }

    public String modifyQuery(String input) { return input; }

    public ArrayList<Course> getResults() {
        return results;
    }

    public void setFilters(String[] filters) {
        this.filters = filters;
    }

    public void generateResults() {

    }
}

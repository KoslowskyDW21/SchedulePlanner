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

    private void setUserInput(String input) { this.userInput = input; }

    private ArrayList<Course> getResults() {
        return results;
    }

    private void setFilters(String[] filters) {
        this.filters = filters;
    }

    private void generateResults() {

    }
}

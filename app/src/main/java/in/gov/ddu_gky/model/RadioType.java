package in.gov.ddu_gky.model;

import java.util.ArrayList;

/**
 * Created by vyas on 6/13/17.
 */

public class RadioType {

    private String Questions;
    private ArrayList<String> Options;

    public RadioType(String Q) {
        Questions = Q;
        Options = new ArrayList<>();
        Options.add("Option 1");
        Options.add("Option 2");
        Options.add("Option 3");
    }

    public String getQuestions() {
        return Questions;
    }

    public void setQuestions(String questions) {
        Questions = questions;
    }

    public ArrayList<String> getOptions() {
        return Options;
    }

    public void setOptions(ArrayList<String> options) {
        Options = options;
    }
}

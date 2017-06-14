package in.gov.ddu_gky.model;

import android.widget.TextView;

/**
 * Created by vyas on 6/13/17.
 */

public class EditType {

    private String Question;

    public EditType(String question) {
        Question = question;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }
}

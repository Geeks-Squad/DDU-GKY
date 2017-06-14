package in.gov.ddu_gky.feedback.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import in.gov.ddu_gky.R;

/**
 * Created by vyas on 6/13/17.
 */

public class RadioCheckHolder extends RecyclerView.ViewHolder {

    RadioGroup optionsGroup;
    TextView Question;

    public RadioCheckHolder(View itemView) {
        super(itemView);
        optionsGroup = (RadioGroup) itemView.findViewById(R.id.radio_options);
        Question = (TextView) itemView.findViewById(R.id.radio_question);
    }

    public TextView getQuestion() {
        return Question;
    }

    public void setQuestion(TextView question) {
        Question = question;
    }

    public RadioGroup getOptionsGroup() {
        return optionsGroup;
    }

    public void setOptionsGroup(RadioGroup optionsGroup) {
        this.optionsGroup = optionsGroup;
    }
}

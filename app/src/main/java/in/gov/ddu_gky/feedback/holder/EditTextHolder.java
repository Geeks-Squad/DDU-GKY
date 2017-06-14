package in.gov.ddu_gky.feedback.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import in.gov.ddu_gky.R;

/**
 * Created by vyas on 6/12/17.
 */

public class EditTextHolder extends RecyclerView.ViewHolder {

    TextView question;
    EditText answer;

    public EditTextHolder(View itemView) {
        super(itemView);
        question = (TextView) itemView.findViewById(R.id.text_question);
        answer = (EditText) itemView.findViewById(R.id.text_answer);
    }

    public void setQuestion (String question) {
        this.question.setText(question);
    }

    public String getAnswer () {
        return this.answer.getText().toString();
    }

    public TextView getQuestion () {
        return this.question;
    }
}

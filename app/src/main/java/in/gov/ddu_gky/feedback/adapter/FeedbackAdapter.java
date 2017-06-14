package in.gov.ddu_gky.feedback.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import in.gov.ddu_gky.R;
import in.gov.ddu_gky.feedback.holder.EditTextHolder;
import in.gov.ddu_gky.feedback.holder.RadioCheckHolder;
import in.gov.ddu_gky.feedback.holder.ReportLocationHolder;
import in.gov.ddu_gky.model.EditType;
import in.gov.ddu_gky.model.LocationType;
import in.gov.ddu_gky.model.RadioType;

/**
 * Created by vyas on 6/12/17.
 */

public class FeedbackAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private ArrayList<Object> data;
    private Context context;
    private final int LOCATION = 0;
    private final int EDITTEXT = 1;
    private final int RADIOGROUP = 2;

    public FeedbackAdapter(ArrayList<Object> items, Context context) {
        this.data = items;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        if (data.get(position) instanceof EditType) {
            return EDITTEXT;
        } else if (data.get(position) instanceof RadioType) {
            return RADIOGROUP;
        } else if (data.get(position) instanceof LocationType) {
            return LOCATION;
        } else {
            return -1;
        }
    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RecyclerView.ViewHolder viewHolder = null;
        View view;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case LOCATION:
                view = inflater.inflate(R.layout.feedback_item_location, parent, false);
                viewHolder = new ReportLocationHolder(view);
                break;
            case EDITTEXT:
                view = inflater.inflate(R.layout.feedback_item_edit_text, parent, false);
                viewHolder = new EditTextHolder(view);
                break;
            case RADIOGROUP:
                view = inflater.inflate(R.layout.feedback_item_checkbutton, parent, false);
                viewHolder = new RadioCheckHolder(view);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case LOCATION:
                ReportLocationHolder reportLocationHolder = (ReportLocationHolder) holder;
                setupReportLocationHolder (reportLocationHolder, position);
                break;
            case EDITTEXT:
                EditTextHolder editTextHolder = (EditTextHolder) holder;
                setupEditTextHolder (editTextHolder, position);
                break;
            case RADIOGROUP:
                RadioCheckHolder radioCheckHolder = (RadioCheckHolder) holder;
                setupRadioCheckHolder (radioCheckHolder, position);
        }
    }

    private void setupRadioCheckHolder(RadioCheckHolder radioCheckHolder, int position) {
        RadioType type = (RadioType) data.get(position);
        RadioGroup optionsGroup = radioCheckHolder.getOptionsGroup();
        //ArrayList<RadioButton> options = new ArrayList<>(type.getOptions().size());
        if (type != null) {
            radioCheckHolder.getQuestion().setText(type.getQuestions());
            for (String option:type.getOptions()) {
                RadioButton button = new RadioButton(context);
                button.setText(option);
                optionsGroup.addView(button);
            }
        }
    }

    private void setupReportLocationHolder (ReportLocationHolder reportLocationHolder, int position) {
        
    }

    private void setupEditTextHolder(EditTextHolder editTextHolder, int position) {
        EditType type = (EditType) data.get(position);
        editTextHolder.getQuestion().setText(type.getQuestion());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

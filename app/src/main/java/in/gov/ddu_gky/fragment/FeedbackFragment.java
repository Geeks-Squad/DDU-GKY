package in.gov.ddu_gky.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

import in.gov.ddu_gky.R;
import in.gov.ddu_gky.feedback.adapter.FeedbackAdapter;
import in.gov.ddu_gky.model.EditType;
import in.gov.ddu_gky.model.LocationType;
import in.gov.ddu_gky.model.RadioType;

/**
 * Created by vyas on 6/12/17.
 */

public class FeedbackFragment extends Fragment {

    RecyclerView feedbackList;
    Button feedbackSubmit;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feedback, container, false);

        feedbackList = (RecyclerView) view.findViewById(R.id.feedback_list);
        feedbackSubmit = (Button) view.findViewById(R.id.feedback_submit);

        FeedbackAdapter adapter = new FeedbackAdapter(getSampleArrayList(),view.getContext());
        feedbackList.setAdapter(adapter);
        feedbackList.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;
    }

    private ArrayList<Object> getSampleArrayList() {
        ArrayList<Object> items = new ArrayList<>();
        items.add(new EditType("Dany Targaryen"));
        items.add(new LocationType());
        items.add(new EditType("Jon Snow"));
        items.add(new RadioType("Tyrion Lanister"));
        return items;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Feedback");
    }

}

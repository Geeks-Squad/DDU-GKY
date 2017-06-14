package in.gov.ddu_gky.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.gov.ddu_gky.R;
import in.gov.ddu_gky.model.User;


/**
 * Created by vyas on 6/11/17.
 */

public class StatsFragment extends Fragment {

    User user;

    public static StatsFragment newInstance(User user) {
        StatsFragment newFragment = new StatsFragment();

        Bundle args = new Bundle();
        args.putSerializable("User", user);
        newFragment.setArguments(args);

        return newFragment;
    }
/*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        user = (User) getArguments().getSerializable("User");
    }
*/
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_stats, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Stats");
    }

}

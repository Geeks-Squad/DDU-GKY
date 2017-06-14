package in.gov.ddu_gky.feedback.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import in.gov.ddu_gky.R;

/**
 * Created by vyas on 6/13/17.
 */

public class ReportLocationHolder extends RecyclerView.ViewHolder{

    Button locationButton;

    public ReportLocationHolder(View itemView) {
        super(itemView);
        locationButton = (Button) itemView.findViewById(R.id.location_button);
    }
}

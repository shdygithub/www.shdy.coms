package www.shdy.mvp.viewUi.adapter.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;

import butterknife.Bind;
import butterknife.ButterKnife;
import www.shdy.R;


public class OnlineOneListViewHodler extends BaseViewHolder<String> {

    @Bind(R.id.hand_layout)
    LinearLayout mHead;



    public OnlineOneListViewHodler(ViewGroup parent) {
        super(parent, R.layout.online_twohead_recycler_layout);
        ButterKnife.bind(this, itemView);


    }

    @Override
    public void setData(String data) {
        super.setData(data);


        mHead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              }
        });

    }
}



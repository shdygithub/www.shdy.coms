package www.shdy.widget.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import www.shdy.R;

public class FenxiangDialog extends BaseDialogFragment {


//
//    @Bind(R.id.weixin_btn)
//    LinearLayout weixinBtn;
//    @Bind(R.id.pengyouquan_btn)
//    LinearLayout pengyouquanBtn;
//    @Bind(R.id.qq_btn)
//    LinearLayout qqBtn;
//    @Bind(R.id.ganbi_btn)
//    ImageView ganbiBtn;

    private Context context;

    private String shareid;
    private String Type;

    public static FenxiangDialog newInatance(String share_id, String type) {

        Bundle args = new Bundle();
        FenxiangDialog fenxiangDialog = new FenxiangDialog();
        fenxiangDialog.setArguments(args);
        fenxiangDialog.setCancelable(false);

        fenxiangDialog.shareid = share_id;
        fenxiangDialog.Type = type;


        return fenxiangDialog;

    }


    public static FenxiangDialog newInatances() {

        Bundle args = new Bundle();
        FenxiangDialog fenxiangDialog = new FenxiangDialog();
        fenxiangDialog.setArguments(args);
        fenxiangDialog.setCancelable(false);


        return fenxiangDialog;

    }

    @Override
    public int getGravity() {
        return Gravity.BOTTOM;
    }

    @Override
    protected int getLayoutRes() {
        return 0 ;
    }

    @Override
    public void BindView(View v) {

    }

    @Override
    protected void show(Context context) {


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


//
//    public void qq(View view) {
//        ShareUtils.shareWeb(getActivity(), Defaultcontent.url, Defaultcontent.title
//                , Defaultcontent.text, "", R.mipmap.logs_icon, SHARE_MEDIA.QQ,shareid,Type);
//    }
//
//    public void weiXin(View view) {
//        ShareUtils.shareWeb(getActivity(), Defaultcontent.url, Defaultcontent.title
//                , Defaultcontent.text, "", R.mipmap.logs_icon, SHARE_MEDIA.WEIXIN
//                ,shareid,Type);
//    }
//
//    public void weixinCircle(View view) {
//        ShareUtils.shareWeb(getActivity(), Defaultcontent.url, Defaultcontent.title
//                , Defaultcontent.text, "", R.mipmap.logs_icon, SHARE_MEDIA.WEIXIN_CIRCLE
//                ,shareid,Type);
//    }


}

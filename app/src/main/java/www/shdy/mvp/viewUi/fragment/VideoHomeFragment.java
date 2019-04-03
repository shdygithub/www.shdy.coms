package www.shdy.mvp.viewUi.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.hjq.toast.ToastUtils;
import com.stx.xhb.xbanner.XBanner;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import www.shdy.R;
import www.shdy.base.BaseMvpFragment;
import www.shdy.entity.VideoHomeFragmentBean;
import www.shdy.mvp.contract.video_contract.VideoFragmentContract;
import www.shdy.mvp.presenter.video_presenter.VideoFragmentPresenter;

public class VideoHomeFragment extends BaseMvpFragment<VideoFragmentPresenter> implements VideoFragmentContract.videohomeView {


    @Bind(R.id.xbanner)
    XBanner xbanner;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ButterKnife.bind(this, super.onCreateView(inflater, container, savedInstanceState));
        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @NonNull
    @Override
    protected VideoFragmentPresenter onLoadPresenter() {
        return new VideoFragmentPresenter();
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.video_homefragment;
    }

    @Override
    protected void onInitView(Bundle savedInstanceState) {

        xbanner.setOnItemClickListener(new XBanner.OnItemClickListener() {
            @Override
            public void onItemClick(XBanner banner, Object model, View view, int position) {
                Toast.makeText(getActivity(), "点击了第" + (position + 1) + "图片", Toast.LENGTH_SHORT).show();

            }
        });
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void videohomeSuccess(final VideoHomeFragmentBean data) {

        if(data.getBanner()!=null){

            xbanner.setData(data.getBanner(), null);
            xbanner.loadImage(new XBanner.XBannerAdapter() {
                @Override
                public void loadBanner(XBanner banner, Object model, View view, int position) {



                    Glide.with(getActivity()).load(data.getBanner().get(position).getBannerImgUrl()).into((ImageView) view);
                 }
            });


        }

    }

    @Override
    public void videohomeFailed(String msg) {

        ToastUtils.show(msg);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    protected void lazyLoad() {
        super.lazyLoad();

        mPresenter.videohomemodel("首页");
    }
}

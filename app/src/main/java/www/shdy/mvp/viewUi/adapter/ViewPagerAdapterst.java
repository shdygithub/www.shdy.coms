package www.shdy.mvp.viewUi.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapterst extends FragmentPagerAdapter {

    private ArrayList<Fragment> mFragments;

    public ViewPagerAdapterst(FragmentManager fm, ArrayList<Fragment> mFragments) {
        super(fm);
        this.mFragments = mFragments;

    }

    @Override
    public int getCount() {
        return mFragments.size();
    }



    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

}
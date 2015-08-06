package swapper.swapapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import java.util.Locale;

/**
 * Created by Björn on 5.8.2015.
 */
public class InboxFriendsMenu extends FragmentPagerAdapter{

    protected Context mContext;

    public InboxFriendsMenu(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new InboxFragment();
            case 1:
                return new FriendsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                return mContext.getString(R.string.inbox_menu_button).toUpperCase(l);
            case 1:
                return mContext.getString(R.string.friends_menu_button).toUpperCase(l);
        }
        return null;
    }
}

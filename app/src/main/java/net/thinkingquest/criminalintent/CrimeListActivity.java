package net.thinkingquest.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by wind on 2017/5/6.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

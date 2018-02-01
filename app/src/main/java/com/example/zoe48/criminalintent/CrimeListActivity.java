package com.example.zoe48.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by zoe48 on 2017-11-24.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment()
    {
        return new CrimeListFragment();
    }
}

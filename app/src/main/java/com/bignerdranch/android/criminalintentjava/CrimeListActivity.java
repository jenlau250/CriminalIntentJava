package com.bignerdranch.android.criminalintentjava;

import androidx.fragment.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}

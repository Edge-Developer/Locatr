package io.edgedev.locatr;

import android.support.v4.app.Fragment;

public class LocatrActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return LocatrFragment.newInstance();
    }

}

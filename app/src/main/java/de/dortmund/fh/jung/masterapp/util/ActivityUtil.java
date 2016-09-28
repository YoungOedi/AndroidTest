package de.dortmund.fh.jung.masterapp.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by hendrikjung on 28.09.16.
 */

public class ActivityUtil {
    public static void addFragmentToActivity (FragmentManager fragmentManager,
                                              Fragment fragment, int frameId) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment);
        transaction.commit();
    }
}

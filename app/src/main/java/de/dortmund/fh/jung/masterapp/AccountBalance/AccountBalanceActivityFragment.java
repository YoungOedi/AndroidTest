package de.dortmund.fh.jung.masterapp.accountBalance;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.dortmund.fh.jung.masterapp.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class AccountBalanceActivityFragment extends Fragment {

    public AccountBalanceActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_account_balance, container, false);
    }
}

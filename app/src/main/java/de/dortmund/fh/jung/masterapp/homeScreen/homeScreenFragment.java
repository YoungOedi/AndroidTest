package de.dortmund.fh.jung.masterapp.homeScreen;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.dortmund.fh.jung.masterapp.accountBalance.AccountBalanceActivity;
import de.dortmund.fh.jung.masterapp.login.LoginActivity;
import de.dortmund.fh.jung.masterapp.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomeScreenFragment extends Fragment implements HomeScreenContract.View {

    private HomeScreenContract.Presenter mPresenter;

    public HomeScreenFragment() {
    }

    public static HomeScreenFragment newInstance() {
        return new HomeScreenFragment();
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void showUserData() {

    }

    @Override
    public void showAccountBalance() {
        Intent intent = new Intent(getContext(), AccountBalanceActivity.class);
        startActivity(intent);
    }

    @Override
    public void showAccountMovement() {

    }

    @Override
    public void showLogin() {
        Intent intent = new Intent(getContext(), LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void showTransactionScreen() {

    }

    @Override
    public void setPresenter(HomeScreenContract.Presenter presenter) {
        mPresenter=presenter;
    }


}
